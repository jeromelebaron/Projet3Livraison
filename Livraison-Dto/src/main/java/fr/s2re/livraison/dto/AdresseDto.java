package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class AdresseDto implements Serializable {

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
    private String numero;

    /**
     * 
     */
    private String nomRue;

    /**
     * 
     */
    private Double longitude;

    /**
     * 
     */
    private Double lattitude;

    /**
     * 
     */
    private List<ServiceLivraisonDto> serviceLivraisons;

    /**
     * 
     */
    private VilleDto ville;

    /**
     * 
     */
    private List<CommandeDto> commandes;

    /**
     * Default constructor
     */
    public AdresseDto() {
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
     * Accesseur en lecture du champ <code>numero</code>.
     * @return le champ <code>numero</code>.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Accesseur en écriture du champ <code>numero</code>.
     * @param paramNumero la valeur à écrire dans <code>numero</code>.
     */
    public void setNumero(String paramNumero) {
        numero = paramNumero;
    }

    /**
     * Accesseur en lecture du champ <code>nomRue</code>.
     * @return le champ <code>nomRue</code>.
     */
    public String getNomRue() {
        return nomRue;
    }

    /**
     * Accesseur en écriture du champ <code>nomRue</code>.
     * @param paramNomRue la valeur à écrire dans <code>nomRue</code>.
     */
    public void setNomRue(String paramNomRue) {
        nomRue = paramNomRue;
    }

    /**
     * Accesseur en lecture du champ <code>longitude</code>.
     * @return le champ <code>longitude</code>.
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Accesseur en écriture du champ <code>longitude</code>.
     * @param paramLongitude la valeur à écrire dans <code>longitude</code>.
     */
    public void setLongitude(Double paramLongitude) {
        longitude = paramLongitude;
    }

    /**
     * Accesseur en lecture du champ <code>lattitude</code>.
     * @return le champ <code>lattitude</code>.
     */
    public Double getLattitude() {
        return lattitude;
    }

    /**
     * Accesseur en écriture du champ <code>lattitude</code>.
     * @param paramLattitude la valeur à écrire dans <code>lattitude</code>.
     */
    public void setLattitude(Double paramLattitude) {
        lattitude = paramLattitude;
    }

    /**
     * Accesseur en lecture du champ <code>serviceLivraisons</code>.
     * @return le champ <code>serviceLivraisons</code>.
     */
    public List<ServiceLivraisonDto> getServiceLivraisons() {
        return serviceLivraisons;
    }

    /**
     * Accesseur en écriture du champ <code>serviceLivraisons</code>.
     * @param paramServiceLivraisons la valeur à écrire dans <code>serviceLivraisons</code>.
     */
    public void setServiceLivraisons(List<ServiceLivraisonDto> paramServiceLivraisons) {
        serviceLivraisons = paramServiceLivraisons;
    }

    /**
     * Accesseur en lecture du champ <code>ville</code>.
     * @return le champ <code>ville</code>.
     */
    public VilleDto getVille() {
        return ville;
    }

    /**
     * Accesseur en écriture du champ <code>ville</code>.
     * @param paramVille la valeur à écrire dans <code>ville</code>.
     */
    public void setVille(VilleDto paramVille) {
        ville = paramVille;
    }

    /**
     * Accesseur en lecture du champ <code>commandes</code>.
     * @return le champ <code>commandes</code>.
     */
    public List<CommandeDto> getCommandes() {
        return commandes;
    }

    /**
     * Accesseur en écriture du champ <code>commandes</code>.
     * @param paramCommandes la valeur à écrire dans <code>commandes</code>.
     */
    public void setCommandes(List<CommandeDto> paramCommandes) {
        commandes = paramCommandes;
    }

}