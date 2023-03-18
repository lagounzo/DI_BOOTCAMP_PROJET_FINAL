package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.ProfilUser;
import com.mon.espace.medical.services.ProfilUserService;
import com.mon.espace.medical.services.RoleSeederService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profilUsers")
public class ProfilUserController {
    @Autowired
   private ProfilUserService profilUserService;
    @Autowired
    private RoleSeederService roleSeederService;

    // attribution des roles
    ProfilUserController(RoleSeederService roleSeederService){
        roleSeederService.seedRole();
    }
    @GetMapping()
    public List<ProfilUser> getAll() {
        return profilUserService.getAll();
    }

    @PostMapping
    public ProfilUser Create(@RequestBody ProfilUser profilUser) {
        return profilUserService.Create(profilUser);
    }

    @PutMapping
    public ProfilUser Update(@RequestBody ProfilUser profilUser) {
        return profilUserService.Update(profilUser);
    }
    @DeleteMapping
    public void Delete(Long id) {
        profilUserService.Delete(id);
    }




}
