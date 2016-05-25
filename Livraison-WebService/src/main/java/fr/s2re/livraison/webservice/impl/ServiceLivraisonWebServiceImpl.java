/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.webservice.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.s2re.api.business.ICommandeBusiness;
import fr.s2re.api.business.IServiceLivraisonBusiness;
import fr.s2re.api.webservice.ILivraisonWebService;
import fr.s2re.livraison.dto.CommandeDto;
import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.entity.Commande;
import fr.s2re.livraison.entity.ServiceLivraison;

/**
 * Le webservice concernant le {@link ServiceLivraison}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(ILivraisonWebService.class)
@Stateless
@WebService(endpointInterface = "fr.s2re.api.webservice.ILivraisonWebService", targetNamespace = "http://servicelivraison.livraison.s2re.fr", serviceName = "ServiceLivraisonWS")
public class ServiceLivraisonWebServiceImpl implements ILivraisonWebService {

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger.getLogger(ServiceLivraisonWebServiceImpl.class);

    /**
     * Pour le business du {@link ServiceLivraison}.
     */
    @EJB
    private IServiceLivraisonBusiness serviceLivraisonBusiness;

    /**
     * Pour le business de {@link Commande}.
     */
    @EJB
    private ICommandeBusiness commandeBusiness;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByCodePostal(final String paramCodePostal) {
        LOGGER.debug("Méthode Webservice getServiceLivraisonByIdVille");
        return serviceLivraisonBusiness.getServiceLivraisonByCodePostal(paramCodePostal);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByIdTypeLivraison(
            final Integer paramIdTypeLivraison) {
        LOGGER.debug("Méthode Webservice getServiceLivraisonByIdTypeLivraison");
        return serviceLivraisonBusiness.getServiceLivraisonByIdTypeLivraison(paramIdTypeLivraison);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommandeDto insertCommande(CommandeDto paramCommandeDto) {
        LOGGER.debug("Méthode WebService insertCommande");
        return commandeBusiness.insertCommande(paramCommandeDto);
    }

}
