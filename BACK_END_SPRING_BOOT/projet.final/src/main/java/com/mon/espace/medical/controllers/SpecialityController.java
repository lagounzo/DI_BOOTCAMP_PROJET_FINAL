package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Speciality;
import com.mon.espace.medical.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specialitys")
public class SpecialityController {
    @Autowired
    SpecialityService specialityService;
    @GetMapping("/show")
    public List<Speciality> getAll(){
        return specialityService.getAll();
    }
    @PostMapping("/create")
    public Speciality Create(@RequestBody Speciality speciality){
        return specialityService.Create(speciality);
    }

    @PutMapping("/update/{id}")
    public Speciality Update(@RequestBody Speciality speciality){
        return specialityService.Update(speciality);
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(Long id){
        specialityService.Delete(id);
    }
}
