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
@Table(name = "ville")
public class Ville implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ville")
    private Integer id;

    /**
     * 
     */
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    /**
     * 
     */
    @Column(name = "code_postal", nullable = false, length = 15)
    private String codePostal;

    /**
     * 
     */
    @OneToMany(mappedBy = "ville")
    private List<Adresse> adresses;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_departement")
    private Departement departement;

    /**
     * Default constructor
     */
    public Ville() {
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
    public List<Adresse> getAdresses() {
        return adresses;
    }

    /**
     * Accesseur en écriture du champ <code>adresses</code>.
     * @param paramAdresses la valeur à écrire dans <code>adresses</code>.
     */
    public void setAdresses(List<Adresse> paramAdresses) {
        adresses = paramAdresses;
    }

    /**
     * Accesseur en lecture du champ <code>departement</code>.
     * @return le champ <code>departement</code>.
     */
    public Departement getDepartement() {
        return departement;
    }

    /**
     * Accesseur en écriture du champ <code>departement</code>.
     * @param paramDepartement la valeur à écrire dans <code>departement</code>.
     */
    public void setDepartement(Departement paramDepartement) {
        departement = paramDepartement;
    }

}