package sn.esp.pratique.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupMarcher {
    @Id
    private Long idMarcher;
    private String nomProduit;
    private String description;
    private Double prix;
    private Boolean disponible;
    private List<Category> supMarchers = new ArrayList<Category>();

    public Long getIdMarcher() {
        return idMarcher;
    }

    public void setIdMarcher(Long idMarcher) {
        this.idMarcher = idMarcher;
    }

    public List<Category> getSupMarchers() {
        return supMarchers;
    }

    public void setSupMarchers(List<Category> supMarchers) {
        this.supMarchers = supMarchers;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public SupMarcher() {
    }

    public SupMarcher(Long idMarcher, String nomProduit, String description, Double prix, Boolean disponible, List<Category> supMarchers) {
        this.idMarcher = idMarcher;
        this.nomProduit = nomProduit;
        this.description = description;
        this.prix = prix;
        this.disponible = disponible;
        this.supMarchers = supMarchers;
    }
}
