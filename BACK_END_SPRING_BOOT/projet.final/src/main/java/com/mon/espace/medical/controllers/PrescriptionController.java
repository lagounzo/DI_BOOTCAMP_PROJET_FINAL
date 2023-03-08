package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Prescription;
import com.mon.espace.medical.services.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {
    @Autowired
    //recuperer tous les elements de la table
    PrescriptionService prescriptionService;
    @GetMapping()
    public List<Prescription> getAll() {
        return prescriptionService.getAll();
    }

    @PostMapping
    public Prescription Create(@RequestBody Prescription prescription) {
        return prescriptionService.Create(prescription);
    }

    @PutMapping
    public Prescription Update(@RequestBody Prescription prescription) {
        return prescriptionService.Update(prescription);
    }
    @DeleteMapping
    public void Delete(Long id) {
        prescriptionService.Delete(id);
    }
}
