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
@Table(name = "jour_ouverture")
public class JourOuverture implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jour_ouverture")
    private Integer id;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_service_livraison", nullable = false)
    private ServiceLivraison serviceLivraison;

    /**
     * 
     */
    @OneToMany(mappedBy = "jourOuverture")
    private List<Horaires> horaires;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_jour_semaine", nullable = false)
    private JourSemaine jourSemaine;

    /**
     * Default constructor
     */
    public JourOuverture() {
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
     * Accesseur en lecture du champ <code>horaires</code>.
     * @return le champ <code>horaires</code>.
     */
    public List<Horaires> getHoraires() {
        return horaires;
    }

    /**
     * Accesseur en écriture du champ <code>horaires</code>.
     * @param paramHoraires la valeur à écrire dans <code>horaires</code>.
     */
    public void setHoraires(List<Horaires> paramHoraires) {
        horaires = paramHoraires;
    }

    /**
     * Accesseur en lecture du champ <code>jourSemaine</code>.
     * @return le champ <code>jourSemaine</code>.
     */
    public JourSemaine getJourSemaine() {
        return jourSemaine;
    }

    /**
     * Accesseur en écriture du champ <code>jourSemaine</code>.
     * @param paramJourSemaine la valeur à écrire dans <code>jourSemaine</code>.
     */
    public void setJourSemaine(JourSemaine paramJourSemaine) {
        jourSemaine = paramJourSemaine;
    }

}