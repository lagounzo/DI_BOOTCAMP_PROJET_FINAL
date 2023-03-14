package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Commune;
import com.mon.espace.medical.services.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/communes")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class CommuneController {
    @Autowired
    CommuneService communeService;
    @GetMapping
    public List<Commune> getAll(){
        return communeService.getAll();
    }

    @PostMapping
    public Commune Create(@RequestBody Commune commune){
        return communeService.Create(commune);
    }
    @PutMapping
    public Commune Update(@RequestBody Commune commune) {
        return communeService.Update(commune);
    }
    @DeleteMapping
    public void Delete(Long id) {
        communeService.Delete(id);
    }

}
