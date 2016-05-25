package fr.s2re.livraison.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "service_livraison")
public class ServiceLivraison implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service_livraison")
    private Integer id;

    /**
     * 
     */
    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_adresse_localisation", nullable = false)
    private Adresse adresseLocalisation;

    /**
     * 
     */
    @OneToMany(mappedBy = "serviceLivraison")
    private List<JourOuverture> jourOuvertures;

    /**
     * 
     */
    @OneToMany(mappedBy = "serviceLivraison")
    private List<Commande> commandes;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_type_livraison", nullable = false)
    private TypeLivraison typeLivraison;

    /**
     * Default constructor
     */
    public ServiceLivraison() {
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
     * Accesseur en lecture du champ <code>adresseLocalisation</code>.
     * @return le champ <code>adresseLocalisation</code>.
     */
    public Adresse getAdresseLocalisation() {
        return adresseLocalisation;
    }

    /**
     * Accesseur en écriture du champ <code>adresseLocalisation</code>.
     * @param paramAdresseLocalisation la valeur à écrire dans <code>adresseLocalisation</code>.
     */
    public void setAdresseLocalisation(Adresse paramAdresseLocalisation) {
        adresseLocalisation = paramAdresseLocalisation;
    }

    /**
     * Accesseur en lecture du champ <code>jourOuvertures</code>.
     * @return le champ <code>jourOuvertures</code>.
     */
    public List<JourOuverture> getJourOuvertures() {
        return jourOuvertures;
    }

    /**
     * Accesseur en écriture du champ <code>jourOuvertures</code>.
     * @param paramJourOuvertures la valeur à écrire dans <code>jourOuvertures</code>.
     */
    public void setJourOuvertures(List<JourOuverture> paramJourOuvertures) {
        jourOuvertures = paramJourOuvertures;
    }

    /**
     * Accesseur en lecture du champ <code>commandes</code>.
     * @return le champ <code>commandes</code>.
     */
    public List<Commande> getCommandes() {
        return commandes;
    }

    /**
     * Accesseur en écriture du champ <code>commandes</code>.
     * @param paramCommandes la valeur à écrire dans <code>commandes</code>.
     */
    public void setCommandes(List<Commande> paramCommandes) {
        commandes = paramCommandes;
    }

    /**
     * Accesseur en lecture du champ <code>typeLivraison</code>.
     * @return le champ <code>typeLivraison</code>.
     */
    public TypeLivraison getTypeLivraison() {
        return typeLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>typeLivraison</code>.
     * @param paramTypeLivraison la valeur à écrire dans <code>typeLivraison</code>.
     */
    public void setTypeLivraison(TypeLivraison paramTypeLivraison) {
        typeLivraison = paramTypeLivraison;
    }

}