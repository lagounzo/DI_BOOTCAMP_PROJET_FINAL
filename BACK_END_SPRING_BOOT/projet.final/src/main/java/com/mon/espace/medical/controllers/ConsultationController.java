package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Consultation;
import com.mon.espace.medical.services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultations")
public class ConsultationController  {
    @Autowired
    ConsultationService consultationService;
    //recuperer tous les elements de la table
    @GetMapping()
    public List<Consultation> getAll() {
        return consultationService.getAll();
    }

    @PostMapping
    public Consultation Create(@RequestBody Consultation consultation) {
        return consultationService.Create(consultation);
    }

    @PutMapping
    public Consultation Update(@RequestBody Consultation consultation) {
        return consultationService.Update(consultation);
    }
    @DeleteMapping
    public void Delete(Long id) {
        consultationService.Delete(id);
    }
}



