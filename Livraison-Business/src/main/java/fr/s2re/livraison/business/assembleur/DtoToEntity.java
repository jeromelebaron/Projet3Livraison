/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.business.assembleur;

import fr.s2re.livraison.dto.AdresseDto;
import fr.s2re.livraison.dto.CommandeDto;
import fr.s2re.livraison.dto.DepartementDto;
import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.dto.TypeLivraisonDto;
import fr.s2re.livraison.dto.VilleDto;
import fr.s2re.livraison.entity.Adresse;
import fr.s2re.livraison.entity.Commande;
import fr.s2re.livraison.entity.Departement;
import fr.s2re.livraison.entity.ServiceLivraison;
import fr.s2re.livraison.entity.TypeLivraison;
import fr.s2re.livraison.entity.Ville;

/**
 * Pour concvertir les Dto en Entity.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class DtoToEntity {

    private DtoToEntity() {
        // EMPTY
    }

    public static Commande fromCommandeDtoToCommandeEntity(final CommandeDto paramCommande) {
        Commande commande = new Commande();
        commande.setId(paramCommande.getId());
        commande.setNumero(paramCommande.getNumero());
        commande.setDelaiRecuperationCommande(paramCommande.getDelaiRecuperationCommande());
        commande.setDateLivraison(paramCommande.getDateLivraison());
        commande.setDatePriseEnCharge(paramCommande.getDatePriseEnCharge());
        commande.setVolume(paramCommande.getVolume());
        commande.setServiceLivraison(DtoToEntity
                .fromServiceLivraisonDtoToServiceLivraisonEntity(paramCommande
                        .getServiceLivraison()));
        commande.setAdresseLivraison(DtoToEntity
                .fromAdresseLivraisonDtoToAdresseLivraisonEntity(paramCommande
                        .getAdresseLivraison()));
        return commande;
    }

    public static ServiceLivraison fromServiceLivraisonDtoToServiceLivraisonEntity(
            final ServiceLivraisonDto paramServiceLivraison) {
        ServiceLivraison serviceLivraison = new ServiceLivraison();
        serviceLivraison.setId(paramServiceLivraison.getId());
        serviceLivraison.setNom(paramServiceLivraison.getNom());
        serviceLivraison
                .setTypeLivraison(DtoToEntity
                        .fromTypeLivraisonDtoToTypeLivraisonEntity(paramServiceLivraison
                                .getTypeLivraison()));
        return serviceLivraison;
    }

    public static Adresse fromAdresseLivraisonDtoToAdresseLivraisonEntity(
            final AdresseDto paramAdresseLivraison) {
        final Adresse adresse = new Adresse();
        adresse.setId(paramAdresseLivraison.getId());
        if (paramAdresseLivraison.getLattitude() != null) {
            adresse.setLattitude(paramAdresseLivraison.getLattitude());
        }
        if (paramAdresseLivraison.getLongitude() != null) {
            adresse.setLongitude(paramAdresseLivraison.getLongitude());
        }
        adresse.setNumero(paramAdresseLivraison.getNumero());
        adresse.setNomRue(paramAdresseLivraison.getNomRue());
        adresse.setVille(DtoToEntity.fromVilleDtoToVilleEntity(paramAdresseLivraison.getVille()));
        return adresse;
    }

    public static TypeLivraison fromTypeLivraisonDtoToTypeLivraisonEntity(
            final TypeLivraisonDto paramTypeLivraison) {
        final TypeLivraison typeLivraison = new TypeLivraison();
        typeLivraison.setId(paramTypeLivraison.getId());
        typeLivraison.setLibelle(paramTypeLivraison.getLibelle());
        return typeLivraison;
    }

    public static Ville fromVilleDtoToVilleEntity(VilleDto paramVille) {
        final Ville ville = new Ville();
        ville.setId(paramVille.getId());
        ville.setNom(paramVille.getNom());
        ville.setCodePostal(paramVille.getCodePostal());
        ville.setDepartement(DtoToEntity.fromDepartementDtoToDepartementEntity(paramVille
                .getDepartement()));
        return null;
    }

    public static Departement fromDepartementDtoToDepartementEntity(DepartementDto paramDepartement) {
        final Departement departement = new Departement();
        departement.setId(paramDepartement.getId());
        departement.setNom(paramDepartement.getNom());
        departement.setNumero(paramDepartement.getNumero());
        return departement;
    }
}
