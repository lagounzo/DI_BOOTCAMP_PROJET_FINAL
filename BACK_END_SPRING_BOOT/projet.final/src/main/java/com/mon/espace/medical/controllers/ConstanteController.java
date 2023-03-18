package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Constante;
import com.mon.espace.medical.services.ConstanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/constantes")
public class ConstanteController {
    @Autowired
    ConstanteService constanteService;
    @GetMapping()
    public List<Constante> getAll(){
        return constanteService.getAll();

    }

    @PostMapping
    public Constante create(@RequestBody Constante constante){
       return constanteService.Create(constante);
    }

    @PutMapping
    public Constante Update(@RequestBody Constante constante) {
        return constanteService.Update(constante);
    }

    @DeleteMapping
    public void Delete(Long id){
        constanteService.Delete(id);
    }

}
