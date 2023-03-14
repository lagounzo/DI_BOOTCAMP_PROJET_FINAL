package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Patient;
import com.mon.espace.medical.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    PatientService patientService;
    //recuperer tous les elements de la table
    @GetMapping()
    public List<Patient> getAll() {
        return patientService.getAll();
    }

    @PostMapping
    public Patient Create(@RequestBody Patient patient) {
        return patientService.Create(patient);
    }

    @PutMapping
    public Patient Update(@RequestBody Patient patient) {
        return patientService.Update(patient);
    }
    @DeleteMapping
    public void Delete(Long id) {
        patientService.Delete(id);
    }
}
