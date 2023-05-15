package com.example.project.servicesImpl;

import com.example.project.beans.Produit;
import com.example.project.dao.ProduitRepository;
import com.example.project.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository ;

    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return null;
    }

    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long id) {
       produitRepository.deleteById(id);
    }

    @Override
    public Produit getProduit(Long id) {
        return produitRepository.findProduitByIdProduit(id);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
