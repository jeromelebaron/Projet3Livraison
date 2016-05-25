package fr.s2re.livraison.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 */
@Entity
@Table(name = "commande")
public class Commande implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commande")
    private Integer id;

    /**
     * 
     */
    @Column(name = "numero", length = 255, nullable = false)
    private String numero;

    /**
     * 
     */
    @Column(name = "date_prise_en_charge", nullable = true)
    @Temporal(TemporalType.TIME)
    private Date datePriseEnCharge;

    /**
     * 
     */
    @Column(name = "date_livraison", nullable = true)
    @Temporal(TemporalType.TIME)
    private Date dateLivraison;

    /**
     * 
     */

    @Column(name = "volume", nullable = false)
    private Double volume;

    /**
     * 
     */
    @Column(name = "delai_recuperation_commande", nullable = false)
    private Integer delaiRecuperationCommande;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_service_livraison")
    private ServiceLivraison serviceLivraison;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_adresse")
    private Adresse adresseLivraison;

    /**
     * Default constructor
     */
    public Commande() {
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
    public ServiceLivraison getServiceLivraison() {
        return serviceLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>serviceLivraison</code>.
     * @param paramServiceLivraison la valeur à écrire dans <code>serviceLivraison</code>.
     */
    public void setServiceLivraison(ServiceLivraison paramServiceLivraison) {
        serviceLivraison = paramServiceLivraison;
    }

    /**
     * Accesseur en lecture du champ <code>adresseLivraison</code>.
     * @return le champ <code>adresseLivraison</code>.
     */
    public Adresse getAdresseLivraison() {
        return adresseLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>adresseLivraison</code>.
     * @param paramAdresseLivraison la valeur à écrire dans <code>adresseLivraison</code>.
     */
    public void setAdresseLivraison(Adresse paramAdresseLivraison) {
        adresseLivraison = paramAdresseLivraison;
    }

}