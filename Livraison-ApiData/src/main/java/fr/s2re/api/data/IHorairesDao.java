/*
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.api.data;

import java.util.List;

import fr.s2re.livraison.entity.Horaires;
import fr.s2re.livraison.entity.JourOuverture;

/**
 * Pour récupérer de la bdd des {@link Horaires}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IHorairesDao {

    /**
     * POur récupérer les {@link Horaires} en fonction du {@link JourOuverture}.
     * @param paramIdJourOuverture l'id du {@link JourOuverture} pour lequel rechercher.
     * @return une liste d'{@link Horaires}.
     */
    List<Horaires> getHorairesByIdJourOuverture(Integer paramIdJourOuverture);

}
