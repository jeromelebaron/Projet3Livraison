package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class JourOuvertureDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private ServiceLivraisonDto serviceLivraison;

    /**
     * 
     */
    private List<HorairesDto> horaires;

    /**
     * 
     */
    private JourSemaineDto jourSemaine;

    /**
     * Default constructor
     */
    public JourOuvertureDto() {
        // EMPTY
    }

    /**
     * Accesseur en lecture du champ <code>id</code>.
     * @return le champ <code>id</code>.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Accesseur en écriture du champ <code>id</code>.
     * @param paramId la valeur à écrire dans <code>id</code>.
     */
    public void setId(Integer paramId) {
        id = paramId;
    }

    /**
     * Accesseur en lecture du champ <code>serviceLivraison</code>.
     * @return le champ <code>serviceLivraison</code>.
     */
    public ServiceLivraisonDto getServiceLivraison() {
        return serviceLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>serviceLivraison</code>.
     * @param paramServiceLivraison la valeur à écrire dans <code>serviceLivraison</code>.
     */
    public void setServiceLivraison(ServiceLivraisonDto paramServiceLivraison) {
        serviceLivraison = paramServiceLivraison;
    }

    /**
     * Accesseur en lecture du champ <code>horaires</code>.
     * @return le champ <code>horaires</code>.
     */
    public List<HorairesDto> getHoraires() {
        return horaires;
    }

    /**
     * Accesseur en écriture du champ <code>horaires</code>.
     * @param paramHoraires la valeur à écrire dans <code>horaires</code>.
     */
    public void setHoraires(List<HorairesDto> paramHoraires) {
        horaires = paramHoraires;
    }

    /**
     * Accesseur en lecture du champ <code>jourSemaine</code>.
     * @return le champ <code>jourSemaine</code>.
     */
    public JourSemaineDto getJourSemaine() {
        return jourSemaine;
    }

    /**
     * Accesseur en écriture du champ <code>jourSemaine</code>.
     * @param paramJourSemaine la valeur à écrire dans <code>jourSemaine</code>.
     */
    public void setJourSemaine(JourSemaineDto paramJourSemaine) {
        jourSemaine = paramJourSemaine;
    }

}