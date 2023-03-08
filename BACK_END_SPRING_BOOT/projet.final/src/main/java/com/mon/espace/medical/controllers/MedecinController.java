package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Medecin;
import com.mon.espace.medical.services.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/medecins")
public class MedecinController {
    @Autowired
    //recuperer tous les elements de la table
    MedecinService medecinService;
    @GetMapping()
    public List<Medecin> getAll() {
        return medecinService.getAll();
    }

    @PostMapping
    public Medecin Create(@RequestBody Medecin medecin) {
        return medecinService.Create(medecin);
    }

    @PutMapping
    public Medecin Update(@RequestBody Medecin medecin) {
        return medecinService.Update(medecin);
    }
    @DeleteMapping
    public void Delete(Long id) {
        medecinService.Delete(id);
    }
}
