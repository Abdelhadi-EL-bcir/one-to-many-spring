package com.example.project.dao;

import com.example.project.beans.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit , Long> {
    public Produit findProduitByIdProduit(Long id);
}
