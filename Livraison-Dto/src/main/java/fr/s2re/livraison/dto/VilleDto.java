package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class VilleDto implements Serializable {

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
    private String nom;

    /**
     * 
     */
    private String codePostal;

    /**
     * 
     */
    private List<AdresseDto> adresses;

    /**
     * 
     */
    private DepartementDto departement;

    /**
     * Default constructor
     */
    public VilleDto() {
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
     * Accesseur en lecture du champ <code>nom</code>.
     * @return le champ <code>nom</code>.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accesseur en écriture du champ <code>nom</code>.
     * @param paramNom la valeur à écrire dans <code>nom</code>.
     */
    public void setNom(String paramNom) {
        nom = paramNom;
    }

    /**
     * Accesseur en lecture du champ <code>codePostal</code>.
     * @return le champ <code>codePostal</code>.
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Accesseur en écriture du champ <code>codePostal</code>.
     * @param paramCodePostal la valeur à écrire dans <code>codePostal</code>.
     */
    public void setCodePostal(String paramCodePostal) {
        codePostal = paramCodePostal;
    }

    /**
     * Accesseur en lecture du champ <code>adresses</code>.
     * @return le champ <code>adresses</code>.
     */
    public List<AdresseDto> getAdresses() {
        return adresses;
    }

    /**
     * Accesseur en écriture du champ <code>adresses</code>.
     * @param paramAdresses la valeur à écrire dans <code>adresses</code>.
     */
    public void setAdresses(List<AdresseDto> paramAdresses) {
        adresses = paramAdresses;
    }

    /**
     * Accesseur en lecture du champ <code>departement</code>.
     * @return le champ <code>departement</code>.
     */
    public DepartementDto getDepartement() {
        return departement;
    }

    /**
     * Accesseur en écriture du champ <code>departement</code>.
     * @param paramDepartement la valeur à écrire dans <code>departement</code>.
     */
    public void setDepartement(DepartementDto paramDepartement) {
        departement = paramDepartement;
    }

}