/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.business.assembleur;

import java.util.ArrayList;
import java.util.List;

import fr.s2re.livraison.dto.AdresseDto;
import fr.s2re.livraison.dto.DepartementDto;
import fr.s2re.livraison.dto.HorairesDto;
import fr.s2re.livraison.dto.JourOuvertureDto;
import fr.s2re.livraison.dto.JourSemaineDto;
import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.dto.TypeLivraisonDto;
import fr.s2re.livraison.dto.VilleDto;
import fr.s2re.livraison.entity.Adresse;
import fr.s2re.livraison.entity.Departement;
import fr.s2re.livraison.entity.Horaires;
import fr.s2re.livraison.entity.JourOuverture;
import fr.s2re.livraison.entity.JourSemaine;
import fr.s2re.livraison.entity.ServiceLivraison;
import fr.s2re.livraison.entity.TypeLivraison;
import fr.s2re.livraison.entity.Ville;

/**
 * Pour convertur les Entity en DTO.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class EntityToDto {

    private EntityToDto() {
        // EMPTY
    }

    public static ServiceLivraisonDto fromServiceLivraisonEntityToServiceLivraisonDto(
            final ServiceLivraison paramServiceLivraison) {
        final ServiceLivraisonDto serviceLivraisonDto = new ServiceLivraisonDto();
        serviceLivraisonDto.setId(paramServiceLivraison.getId());
        serviceLivraisonDto.setNom(paramServiceLivraison.getNom());
        serviceLivraisonDto.setAdresseLocalisation(EntityToDto
                .fromAdresseEntityToAdresseDto(paramServiceLivraison.getAdresseLocalisation()));
        serviceLivraisonDto
                .setTypeLivraison(EntityToDto
                        .fromTypeLivraisonEntityToTypeLivraisonDto(paramServiceLivraison
                                .getTypeLivraison()));
        return serviceLivraisonDto;
    }

    public static AdresseDto fromAdresseEntityToAdresseDto(final Adresse paramAdresseLocalisation) {
        final AdresseDto adresseDto = new AdresseDto();
        adresseDto.setId(paramAdresseLocalisation.getId());
        adresseDto.setNomRue(paramAdresseLocalisation.getNomRue());
        adresseDto.setNumero(paramAdresseLocalisation.getNumero());
        adresseDto.setVille(EntityToDto.fromVilleEntityToVilleDto(paramAdresseLocalisation
                .getVille()));
        return adresseDto;
    }

    public static VilleDto fromVilleEntityToVilleDto(final Ville paramVille) {
        final VilleDto villeDto = new VilleDto();
        villeDto.setId(paramVille.getId());
        villeDto.setNom(paramVille.getNom());
        villeDto.setCodePostal(paramVille.getCodePostal());
        villeDto.setDepartement(EntityToDto.fromDepartementEntityToDepartementDto(paramVille
                .getDepartement()));
        return villeDto;
    }

    public static DepartementDto fromDepartementEntityToDepartementDto(
            final Departement paramDepartement) {
        final DepartementDto departementDto = new DepartementDto();
        departementDto.setId(paramDepartement.getId());
        departementDto.setNom(paramDepartement.getNom());
        departementDto.setNom(paramDepartement.getNumero());
        return departementDto;
    }

    public static TypeLivraisonDto fromTypeLivraisonEntityToTypeLivraisonDto(
            final TypeLivraison paramTypeLivraison) {
        final TypeLivraisonDto typeLivraisonDto = new TypeLivraisonDto();
        typeLivraisonDto.setId(paramTypeLivraison.getId());
        typeLivraisonDto.setLibelle(paramTypeLivraison.getLibelle());
        return typeLivraisonDto;
    }

    public static List<ServiceLivraisonDto> fromListServiceLivraisonEntityToListLivraisonDto(
            final List<ServiceLivraison> paramLesServiceLivraison) {
        final List<ServiceLivraisonDto> lesServiceLivraisonDto = new ArrayList<>();
        for (ServiceLivraison localServiceLivraison : paramLesServiceLivraison) {
            final ServiceLivraisonDto serviceLivraisonDto = EntityToDto
                    .fromServiceLivraisonEntityToServiceLivraisonDto(localServiceLivraison);
            lesServiceLivraisonDto.add(serviceLivraisonDto);
        }
        return lesServiceLivraisonDto;
    }

    public static List<JourOuvertureDto> fromListeJourOuvertureEntityToJourOuvertureDto(
            final List<JourOuverture> paramJourOuvertures) {
        final List<JourOuvertureDto> lesJourOuvertureDto = new ArrayList<>();
        for (JourOuverture localJourOuverture : paramJourOuvertures) {
            final JourOuvertureDto jourOuvertureDto = EntityToDto
                    .fromJourOuvertureEntityToJourOuvertureDto(localJourOuverture);
            lesJourOuvertureDto.add(jourOuvertureDto);
        }
        return lesJourOuvertureDto;
    }

    public static JourOuvertureDto fromJourOuvertureEntityToJourOuvertureDto(
            final JourOuverture paramJourOuverture) {
        final JourOuvertureDto jourOuvertureDto = new JourOuvertureDto();
        jourOuvertureDto.setId(paramJourOuverture.getId());
        jourOuvertureDto.setJourSemaine(EntityToDto
                .fromJourSemaineEntityToJourSemaineDto(paramJourOuverture.getJourSemaine()));
        jourOuvertureDto.setServiceLivraison(EntityToDto
                .fromServiceLivraisonEntityToServiceLivraisonDto(paramJourOuverture
                        .getServiceLivraison()));
        return jourOuvertureDto;
    }

    public static JourSemaineDto fromJourSemaineEntityToJourSemaineDto(
            final JourSemaine paramJourSemaine) {
        final JourSemaineDto jourSemaineDto = new JourSemaineDto();
        jourSemaineDto.setId(paramJourSemaine.getId());
        jourSemaineDto.setLibelle(paramJourSemaine.getLibelle());
        return jourSemaineDto;
    }

    public static List<HorairesDto> fromListHorairesEntityToHorairesDto(
            final List<Horaires> paramHoraires) {
        final List<HorairesDto> lesHorairesDto = new ArrayList<>();
        for (Horaires localHoraires : paramHoraires) {
            final HorairesDto horairesDto = EntityToDto
                    .fromHorairesEntityToHoraireDto(localHoraires);
            lesHorairesDto.add(horairesDto);
        }
        return lesHorairesDto;
    }

    public static HorairesDto fromHorairesEntityToHoraireDto(final Horaires paramHoraires) {
        final HorairesDto horairesDto = new HorairesDto();
        horairesDto.setId(paramHoraires.getId());
        horairesDto.setDebut(paramHoraires.getDebut());
        horairesDto.setFin(paramHoraires.getFin());
        horairesDto.setJourOuverture(EntityToDto
                .fromJourOuvertureEntityToJourOuvertureDto(paramHoraires.getJourOuverture()));
        return horairesDto;
    }
}
