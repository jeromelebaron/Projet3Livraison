package fr.s2re.livraison.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(namespace = "http://servicelivraison.livraison.s2re.fr")
public class TypeLivraisonDto implements Serializable {

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
    private List<ServiceLivraisonDto> serviceLivraisons;

    /**
     * Default constructor
     */
    public TypeLivraisonDto() {
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

}
