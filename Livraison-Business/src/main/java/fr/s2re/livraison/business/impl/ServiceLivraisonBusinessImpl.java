/**
 * Créé le 18 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import fr.s2re.api.business.IServiceLivraisonBusiness;
import fr.s2re.api.data.IHorairesDao;
import fr.s2re.api.data.IServiceLivraisonDao;
import fr.s2re.livraison.business.assembleur.EntityToDto;
import fr.s2re.livraison.dto.HorairesDto;
import fr.s2re.livraison.dto.JourOuvertureDto;
import fr.s2re.livraison.dto.ServiceLivraisonDto;
import fr.s2re.livraison.entity.Horaires;
import fr.s2re.livraison.entity.JourOuverture;
import fr.s2re.livraison.entity.ServiceLivraison;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IServiceLivraisonBusiness.class)
@Stateless
public class ServiceLivraisonBusinessImpl implements IServiceLivraisonBusiness {

    /**
     * Le dao pour le {@link ServiceLivraison}.
     */
    @EJB
    private IServiceLivraisonDao serviceLivraisonDao;

    /**
     * Le dao pour les {@link Horaires}.
     */
    @EJB
    private IHorairesDao horairesDao;

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger.getLogger(ServiceLivraisonBusinessImpl.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByCodePostal(final String paramCodePostal) {
        LOGGER.debug("Méthode business getServiceLivraisonByIdVille");
        final List<ServiceLivraison> lesServiceLivraison = serviceLivraisonDao
                .getServiceLivraisonByIdVille(paramCodePostal);
        recupererTousHorairesOuvertures(lesServiceLivraison);
        final List<ServiceLivraisonDto> lesServiceLivraisonDto = EntityToDto
                .fromListServiceLivraisonEntityToListLivraisonDto(lesServiceLivraison);
        recupereJoursOuverture(lesServiceLivraison, lesServiceLivraisonDto);
        return lesServiceLivraisonDto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByIdTypeLivraison(
            Integer paramIdTypeLivraison) {
        LOGGER.debug("Méthode business getServiceLivraisonByITypeLivraison");
        final List<ServiceLivraison> lesServiceLivraison = serviceLivraisonDao
                .getServiceLivraisonByIdTypeLivraison(paramIdTypeLivraison);
        recupererTousHorairesOuvertures(lesServiceLivraison);
        final List<ServiceLivraisonDto> lesServiceLivraisonDto = EntityToDto
                .fromListServiceLivraisonEntityToListLivraisonDto(lesServiceLivraison);
        recupereJoursOuverture(lesServiceLivraison, lesServiceLivraisonDto);
        return lesServiceLivraisonDto;
    }

    /**
     * Pour récupérer les {@link Horaires} d'ouverture de tous les {@link ServiceLivraison}.
     * @param lesServiceLivraison les {@link ServiceLivraison} pour lesquels récupérer les horaires.
     */
    private void recupererTousHorairesOuvertures(final List<ServiceLivraison> lesServiceLivraison) {
        for (ServiceLivraison localServiceLivraison : lesServiceLivraison) {
            recupereHoraireParJour(localServiceLivraison);
        }
    }

    /**
     * Pour récupérer les {@link Horaires} d'ouverture du {@link ServiceLivraison}.
     * @param paramServiceLivraison le {@link ServiceLivraison} pour lequel récupérer les horaires.
     */
    private void recupereHoraireParJour(final ServiceLivraison paramServiceLivraison) {
        for (JourOuverture localJourOuverture : paramServiceLivraison.getJourOuvertures()) {
            localJourOuverture.setHoraires(horairesDao
                    .getHorairesByIdJourOuverture(localJourOuverture.getId()));
        }
    }

    /**
     * Pour peupleur les {@link JourOuvertureDto} et les {@link HorairesDto} du
     * {@link ServiceLivraisonDto} des {@link ServiceLivraisonDto} lié aux {@link ServiceLivraison}.
     * @param lesServiceLivraison le {@link ServiceLivraison} duquel récupérer les
     *            {@link JourOuverture}.
     * @param lesServiceLivraisonDto le {@link ServiceLivraisonDto} pour lequel peupler les
     *            {@link JourOuvertureDto}.
     */
    private void recupereJoursOuverture(final List<ServiceLivraison> lesServiceLivraison,
            final List<ServiceLivraisonDto> lesServiceLivraisonDto) {
        for (ServiceLivraison localServiceLivraison : lesServiceLivraison) {
            List<JourOuvertureDto> lesJourOuvertureDto = EntityToDto
                    .fromListeJourOuvertureEntityToJourOuvertureDto(localServiceLivraison
                            .getJourOuvertures());
            for (JourOuverture localJourOuverture : localServiceLivraison.getJourOuvertures()) {
                final List<HorairesDto> lesHorairesDto = EntityToDto
                        .fromListHorairesEntityToHorairesDto(localJourOuverture.getHoraires());
                for (JourOuvertureDto localJourOuvertureDto : lesJourOuvertureDto) {
                    if (localJourOuvertureDto.getId().equals(localJourOuverture.getId())) {
                        localJourOuvertureDto.setHoraires(lesHorairesDto);
                    }
                }
            }
            for (ServiceLivraisonDto localServiceLivraisonDto : lesServiceLivraisonDto) {
                if (localServiceLivraison.getId().equals(localServiceLivraisonDto.getId())) {
                    localServiceLivraisonDto.setJourOuvertures(lesJourOuvertureDto);
                }
            }
        }
    }
}
