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
@Table(name = "horaires")
public class Horaires implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horaires")
    private Integer id;

    /**
     * 
     */
    @Column(name = "debut", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date debut;

    /**
     * 
     */
    @Column(name = "fin", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date fin;

    /**
     * 
     */
    @ManyToOne
    @JoinColumn(name = "id_jour_ouverture", nullable = false)
    private JourOuverture jourOuverture;

    /**
     * Default constructor
     */
    public Horaires() {
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
    public JourOuverture getJourOuverture() {
        return jourOuverture;
    }

    /**
     * Accesseur en écriture du champ <code>jourOuverture</code>.
     * @param paramJourOuverture la valeur à écrire dans <code>jourOuverture</code>.
     */
    public void setJourOuverture(JourOuverture paramJourOuverture) {
        jourOuverture = paramJourOuverture;
    }

}