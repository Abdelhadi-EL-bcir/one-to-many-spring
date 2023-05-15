package com.example.project.servicesImpl;

import com.example.project.beans.Categorie;
import com.example.project.dao.CategorieRepository;
import com.example.project.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieRepository categorieRepository ;


    @Override
    public Categorie saveCategorie(Categorie c) {
        return null;
    }

    @Override
    public Categorie updateCategorie(Categorie c) {
        return null;
    }

    @Override
    public void deleteCategorie(Categorie c) {

    }

    @Override
    public void deleteCategorieById(Long id) {

    }

    @Override
    public Categorie getCategorie(Long id) {
        return null;
    }

    @Override
    public List<Categorie> getAllCategories() {
        return null;
    }
}
