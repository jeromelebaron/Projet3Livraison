/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.api.data;

import fr.s2re.livraison.entity.Commande;
import fr.s2re.livraison.entity.ServiceLivraison;

/**
 * Pour récupérer les {@link Commande} dans la bdd.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface ICommandeDao {

    /**
     * Pour ajouter une {@link Commande} au {@link ServiceLivraison}.
     * @param paramCommande la {@link Commande} à ajouter.
     * @return la {@link Commande} avec son id.
     */
    Commande insertCommande(Commande paramCommande);

}
