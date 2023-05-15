package com.example.project.webServices;

import com.example.project.beans.Produit;
import com.example.project.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/produit")
public class ProduitController {

    @PostMapping("/add")
    public Produit saveProduit(@RequestBody Produit p) {
        return produitService.saveProduit(p);
    }

    @PutMapping("/edit")
    public Produit updateProduit(@RequestBody Produit p) {
        return produitService.updateProduit(p);
    }

    @DeleteMapping("/deleteProduct")
    public void deleteProduit(@RequestBody Produit p) {
        produitService.deleteProduit(p);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduitById(@PathVariable Long id) {
        produitService.deleteProduitById(id);
    }

    @GetMapping("/produit/{id}")
    public Produit getProduit(@PathVariable Long id) {
        return produitService.getProduit(id);
    }

    @GetMapping("/list")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @Autowired
    private ProduitService produitService ;
}
