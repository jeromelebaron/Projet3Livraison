/*
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.api.data;

import java.util.List;

import fr.s2re.livraison.entity.ServiceLivraison;
import fr.s2re.livraison.entity.TypeLivraison;
import fr.s2re.livraison.entity.Ville;

/**
 * Pour récupérer de la bdd des {@link ServiceLivraison}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IServiceLivraisonDao {

    /**
     * Pour récupérer les {@link ServiceLivraison} en fonction de la ville.
     * @param paramCodePostal le code postal de la {@link Ville} pour laquelle rechercher.
     * @return une liste de {@link ServiceLivraison}.
     */
    List<ServiceLivraison> getServiceLivraisonByIdVille(String paramCodePostal);

    /**
     * Pour récupérer les {@link ServiceLivraison} en fonction de la ville.
     * @param paramIdTypeLivraison l'id de la {@link TypeLivraison} pour lequel rechercher.
     * @return une liste de {@link ServiceLivraison}.
     */
    List<ServiceLivraison> getServiceLivraisonByIdTypeLivraison(Integer paramIdTypeLivraison);

}
