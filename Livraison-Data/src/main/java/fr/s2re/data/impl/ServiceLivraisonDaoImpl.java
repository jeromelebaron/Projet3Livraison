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

import fr.s2re.api.data.IServiceLivraisonDao;
import fr.s2re.livraison.entity.ServiceLivraison;
import fr.s2re.livraison.entity.TypeLivraison;
import fr.s2re.livraison.entity.Ville;

/**
 * Pour l'accès à la bdd concernant le {@link ServiceLivraison}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IServiceLivraisonDao.class)
@Stateless
public class ServiceLivraisonDaoImpl implements IServiceLivraisonDao {

    /**
     * L'entity manager de JPA.
     */
    @PersistenceContext(name = "Livraison-Data")
    private EntityManager entityManager;

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger.getLogger(ServiceLivraisonDaoImpl.class);

    /**
     * La requête HQL pour récupérer les {@link ServiceLivraison} par {@link Ville}.
     */
    private static final String REQUETE_FIND_SERVICE_LIVRAISON_BY_VILLE = "SELECT DISTINCT s FROM ServiceLivraison s "
            + "LEFT JOIN FETCH s.jourOuvertures WHERE s.adresseLocalisation.ville.codePostal = :codePostal";
    /**
     * La requête HQL pour récupérer les {@link ServiceLivraison} par {@link TypeLivraison}.
     */
    private static final String REQUETE_FIND_SERVICE_LIVRAISON_BY_TYPE_LIVRAISON = "SELECT DISTINCT s FROM ServiceLivraison s "
            + "LEFT JOIN FETCH s.jourOuvertures WHERE s.typeLivraison.id = :idTypeLivraison";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraison> getServiceLivraisonByIdVille(final String paramCodePostal) {
        LOGGER.debug("Méthode dao getServiceLivraisonByIdVille");
        final TypedQuery<ServiceLivraison> queryFindServiceLivraisonByVille = entityManager
                .createQuery(REQUETE_FIND_SERVICE_LIVRAISON_BY_VILLE, ServiceLivraison.class);
        queryFindServiceLivraisonByVille.setParameter("codePostal", paramCodePostal);
        return queryFindServiceLivraisonByVille.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraison> getServiceLivraisonByIdTypeLivraison(
            final Integer paramIdTypeLivraison) {
        LOGGER.debug("Méthode dao getServiceLivraisonByTypeLivraison");
        final TypedQuery<ServiceLivraison> queryFindServiceLivraisonByTypeLivraison = entityManager
                .createQuery(REQUETE_FIND_SERVICE_LIVRAISON_BY_TYPE_LIVRAISON,
                        ServiceLivraison.class);
        queryFindServiceLivraisonByTypeLivraison.setParameter("idTypeLivraison",
                paramIdTypeLivraison);
        return queryFindServiceLivraisonByTypeLivraison.getResultList();
    }

}
