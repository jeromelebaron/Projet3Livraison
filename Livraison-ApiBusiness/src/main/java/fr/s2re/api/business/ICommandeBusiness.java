/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.api.business;

import fr.s2re.livraison.dto.CommandeDto;
import fr.s2re.livraison.entity.Commande;

/**
 * Concernant le business des {@link Commande}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface ICommandeBusiness {

    /**
     * Pour insérer une {@link CommandeDto} dans la bdd.
     * @param paramCommande la {@link CommandeDto} à insérer.
     * @return la {@link CommandeDto} avec son id.
     */
    CommandeDto insertCommande(CommandeDto paramCommande);

}
