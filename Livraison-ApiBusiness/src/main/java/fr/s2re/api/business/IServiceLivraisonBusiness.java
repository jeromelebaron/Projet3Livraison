/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.api.business;

import java.util.List;

import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.entity.ServiceLivraison;

/**
 * Pour les traitements business du {@link ServiceLivraison}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IServiceLivraisonBusiness {

    List<ServiceLivraisonDto> getServiceLivraisonByCodePostal(final String paramparamCodePostal);

    List<ServiceLivraisonDto> getServiceLivraisonByIdTypeLivraison(
            final Integer paramIdTypeLivraison);
}
