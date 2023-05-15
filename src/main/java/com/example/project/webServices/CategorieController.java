package com.example.project.webServices;

import com.example.project.beans.Categorie;
import com.example.project.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping("/add")
    public Categorie saveCategorie(@RequestBody Categorie c) {
        return categorieService.saveCategorie(c);
    }

    @DeleteMapping("/delete")
    public void deleteCategorieById(@PathVariable Long id) {
        categorieService.deleteCategorieById(id);
    }

    @GetMapping("/getCategorie/{id}")
    public Categorie getCategorie(@PathVariable Long id) {
        return categorieService.getCategorie(id);
    }

    @GetMapping("/all")
    public List<Categorie> getAllCategories() {
        return categorieService.getAllCategories();
    }
}
