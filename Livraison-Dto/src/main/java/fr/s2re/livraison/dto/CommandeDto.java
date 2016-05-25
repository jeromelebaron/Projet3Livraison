package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class CommandeDto implements Serializable{

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
    private Date datePriseEnCharge;

    /**
     * 
     */
    private Date dateLivraison;

    /**
     * 
     */

    private Double volume;

    /**
     * 
     */
    private Integer delaiRecuperationCommande;

    /**
     * 
     */
    private ServiceLivraisonDto serviceLivraison;

    /**
     * 
     */
    private AdresseDto adresseLivraison;

    /**
     * Default constructor
     */
    public CommandeDto() {
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
     * Accesseur en lecture du champ <code>datePriseEnCharge</code>.
     * @return le champ <code>datePriseEnCharge</code>.
     */
    public Date getDatePriseEnCharge() {
        return datePriseEnCharge;
    }

    /**
     * Accesseur en écriture du champ <code>datePriseEnCharge</code>.
     * @param paramDatePriseEnCharge la valeur à écrire dans <code>datePriseEnCharge</code>.
     */
    public void setDatePriseEnCharge(Date paramDatePriseEnCharge) {
        datePriseEnCharge = paramDatePriseEnCharge;
    }

    /**
     * Accesseur en lecture du champ <code>dateLivraison</code>.
     * @return le champ <code>dateLivraison</code>.
     */
    public Date getDateLivraison() {
        return dateLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>dateLivraison</code>.
     * @param paramDateLivraison la valeur à écrire dans <code>dateLivraison</code>.
     */
    public void setDateLivraison(Date paramDateLivraison) {
        dateLivraison = paramDateLivraison;
    }

    /**
     * Accesseur en lecture du champ <code>volume</code>.
     * @return le champ <code>volume</code>.
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Accesseur en écriture du champ <code>volume</code>.
     * @param paramVolume la valeur à écrire dans <code>volume</code>.
     */
    public void setVolume(Double paramVolume) {
        volume = paramVolume;
    }

    /**
     * Accesseur en lecture du champ <code>delaiRecuperationCommande</code>.
     * @return le champ <code>delaiRecuperationCommande</code>.
     */
    public Integer getDelaiRecuperationCommande() {
        return delaiRecuperationCommande;
    }

    /**
     * Accesseur en écriture du champ <code>delaiRecuperationCommande</code>.
     * @param paramDelaiRecuperationCommande la valeur à écrire dans
     *            <code>delaiRecuperationCommande</code>.
     */
    public void setDelaiRecuperationCommande(Integer paramDelaiRecuperationCommande) {
        delaiRecuperationCommande = paramDelaiRecuperationCommande;
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
     * Accesseur en lecture du champ <code>adresseLivraison</code>.
     * @return le champ <code>adresseLivraison</code>.
     */
    public AdresseDto getAdresseLivraison() {
        return adresseLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>adresseLivraison</code>.
     * @param paramAdresseLivraison la valeur à écrire dans <code>adresseLivraison</code>.
     */
    public void setAdresseLivraison(AdresseDto paramAdresseLivraison) {
        adresseLivraison = paramAdresseLivraison;
    }

}