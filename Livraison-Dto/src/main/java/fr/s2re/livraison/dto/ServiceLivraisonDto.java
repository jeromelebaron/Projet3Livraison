package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class ServiceLivraisonDto implements Serializable {

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
    private AdresseDto adresseLocalisation;

    /**
     * 
     */
    private List<JourOuvertureDto> jourOuvertures;

    /**
     * 
     */
    private List<CommandeDto> commandes;

    /**
     * 
     */
    private TypeLivraisonDto typeLivraison;

    /**
     * Default constructor
     */
    public ServiceLivraisonDto() {
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
    public AdresseDto getAdresseLocalisation() {
        return adresseLocalisation;
    }

    /**
     * Accesseur en écriture du champ <code>adresseLocalisation</code>.
     * @param paramAdresseLocalisation la valeur à écrire dans <code>adresseLocalisation</code>.
     */
    public void setAdresseLocalisation(AdresseDto paramAdresseLocalisation) {
        adresseLocalisation = paramAdresseLocalisation;
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

    /**
     * Accesseur en lecture du champ <code>typeLivraison</code>.
     * @return le champ <code>typeLivraison</code>.
     */
    public TypeLivraisonDto getTypeLivraison() {
        return typeLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>typeLivraison</code>.
     * @param paramTypeLivraison la valeur à écrire dans <code>typeLivraison</code>.
     */
    public void setTypeLivraison(TypeLivraisonDto paramTypeLivraison) {
        typeLivraison = paramTypeLivraison;
    }

}