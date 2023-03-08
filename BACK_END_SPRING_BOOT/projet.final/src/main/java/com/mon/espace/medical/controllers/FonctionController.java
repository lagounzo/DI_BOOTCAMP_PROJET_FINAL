package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Fonction;
import com.mon.espace.medical.services.FonctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fonctions")
public class FonctionController {
    @Autowired
    FonctionService fonctionService;
    //recuperer tous les elements de la table
    @GetMapping()
    public List<Fonction> getAll() {
        return fonctionService.getAll();
    }

    @PostMapping
    public Fonction Create(@RequestBody Fonction fonction) {
        return fonctionService.Create(fonction);
    }

    @PutMapping
    public Fonction Update(@RequestBody Fonction fonction) {
        return fonctionService.Update(fonction);
    }
    @DeleteMapping
    public void Delete(Long id) {
        fonctionService.Delete(id);
    }

}
