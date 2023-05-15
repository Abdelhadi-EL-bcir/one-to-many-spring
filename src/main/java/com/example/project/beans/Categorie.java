package com.example.project.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCategorie ;
    private String namCategorie ;
    @OneToMany
    @JoinColumn(name ="categorie")
    private List<Produit> produitList ;

    public Categorie(){

    }

    public Categorie(String namCategorie, List<Produit> produitList) {
        this.namCategorie = namCategorie;
        this.produitList = produitList;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNamCategorie() {
        return namCategorie;
    }

    public void setNamCategorie(String namCategorie) {
        this.namCategorie = namCategorie;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }
}
