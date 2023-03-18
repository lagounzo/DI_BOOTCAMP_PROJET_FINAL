package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Hopital;
import com.mon.espace.medical.services.HopitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hopitals")
public class HopitalController {
    @Autowired
    HopitalService hopitalService;
//recuperer tous les elements de la table
    @GetMapping("/show")
    public List<Hopital> getAll() {
        return hopitalService.getAll();
    }

    @PostMapping("/create")
    public Hopital Create(@RequestBody Hopital hopital) {
        return hopitalService.Create(hopital);
    }

    @PutMapping("/update/{id}")
    public Hopital Update(@RequestBody Hopital hopital) {
        return hopitalService.Update(hopital);
    }
    @DeleteMapping("/delete/{id}")
    public void Delete(Long id) {
        hopitalService.Delete(id);
    }

}
