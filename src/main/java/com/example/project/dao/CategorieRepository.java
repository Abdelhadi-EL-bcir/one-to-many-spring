package com.example.project.dao;

import com.example.project.beans.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie , Integer> {
}
