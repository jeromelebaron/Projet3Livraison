package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class JourSemaineDto implements Serializable {

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
    private String libelle;

    /**
     * 
     */
    private List<JourOuvertureDto> jourOuvertures;

    /**
     * Default constructor
     */
    public JourSemaineDto() {
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
     * Accesseur en lecture du champ <code>libelle</code>.
     * @return le champ <code>libelle</code>.
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Accesseur en écriture du champ <code>libelle</code>.
     * @param paramLibelle la valeur à écrire dans <code>libelle</code>.
     */
    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }

    /**
     * Accesseur en lecture du champ <code>jourOuvertures</code>.
     * @return le champ <code>jourOuvertures</code>.
     */
    public List<JourOuvertureDto> getJourOuvertures() {
        return jourOuvertures;
    }

    /**
     * Accesseur en écriture du champ <code>jourOuvertures</code>.
     * @param paramJourOuvertures la valeur à écrire dans <code>jourOuvertures</code>.
     */
    public void setJourOuvertures(List<JourOuvertureDto> paramJourOuvertures) {
        jourOuvertures = paramJourOuvertures;
    }

}