package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class HorairesDto implements Serializable {

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
    private Date debut;

    /**
     * 
     */
    private Date fin;

    /**
     * 
     */
    private JourOuvertureDto jourOuverture;

    /**
     * Default constructor
     */
    public HorairesDto() {
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
     * Accesseur en lecture du champ <code>debut</code>.
     * @return le champ <code>debut</code>.
     */
    public Date getDebut() {
        return debut;
    }

    /**
     * Accesseur en écriture du champ <code>debut</code>.
     * @param paramDebut la valeur à écrire dans <code>debut</code>.
     */
    public void setDebut(Date paramDebut) {
        debut = paramDebut;
    }

    /**
     * Accesseur en lecture du champ <code>fin</code>.
     * @return le champ <code>fin</code>.
     */
    public Date getFin() {
        return fin;
    }

    /**
     * Accesseur en écriture du champ <code>fin</code>.
     * @param paramFin la valeur à écrire dans <code>fin</code>.
     */
    public void setFin(Date paramFin) {
        fin = paramFin;
    }

    /**
     * Accesseur en lecture du champ <code>jourOuverture</code>.
     * @return le champ <code>jourOuverture</code>.
     */
    public JourOuvertureDto getJourOuverture() {
        return jourOuverture;
    }

    /**
     * Accesseur en écriture du champ <code>jourOuverture</code>.
     * @param paramJourOuverture la valeur à écrire dans <code>jourOuverture</code>.
     */
    public void setJourOuverture(JourOuvertureDto paramJourOuverture) {
        jourOuverture = paramJourOuverture;
    }

}