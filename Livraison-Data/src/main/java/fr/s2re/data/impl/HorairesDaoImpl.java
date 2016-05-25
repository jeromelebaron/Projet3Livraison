/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.data.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import fr.s2re.api.data.IHorairesDao;
import fr.s2re.livraison.entity.Horaires;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IHorairesDao.class)
@Stateless
public class HorairesDaoImpl implements IHorairesDao {

    private static final Logger LOGGER = Logger.getLogger(HorairesDaoImpl.class);

    @PersistenceContext(name = "Livraison-Data")
    private EntityManager entityManager;

    private static final String REQUETE_GET_HORAIRES_BY_ID_JOUR_OUVERTURE = "FROM Horaires h WHERE h.jourOuverture.id = :idJourOuverture";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Horaires> getHorairesByIdJourOuverture(Integer paramIdJourOuverture) {
        LOGGER.debug("Méthode Dao getHorairesByIdJourOuverture");
        final TypedQuery<Horaires> queryGetHoraireqByIfJourOuverture = entityManager.createQuery(
                REQUETE_GET_HORAIRES_BY_ID_JOUR_OUVERTURE, Horaires.class);
        queryGetHoraireqByIfJourOuverture.setParameter("idJourOuverture", paramIdJourOuverture);
        return queryGetHoraireqByIfJourOuverture.getResultList();
    }

}
