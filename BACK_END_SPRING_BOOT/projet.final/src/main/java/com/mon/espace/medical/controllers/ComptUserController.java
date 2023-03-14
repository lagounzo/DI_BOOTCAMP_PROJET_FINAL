package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.ComptUser;
import com.mon.espace.medical.models.Login;
import com.mon.espace.medical.services.ComptUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*") // permet d'accepter toutes les requettes pour communiquer avec les api
@RestController
@RequestMapping("/commtUsers")
public class ComptUserController {
    @Autowired
    ComptUserService comptUserService;

    @GetMapping("")
    public List<ComptUser> getAll(){
        return comptUserService.getAll();
    }

    @PostMapping("")
    public ComptUser Create(@RequestBody ComptUser comptUser) {
        return comptUserService.Create(comptUser);
    }

    @PutMapping("")
    public ComptUser Update(@RequestBody ComptUser comptUser) {
        return comptUserService.Update(comptUser);
    }
    @DeleteMapping
    public void Delete(Long id) {
        comptUserService.Delete(id);
    }


    // methode de connexion
    @PostMapping("/login")
    public ComptUser longin(@RequestBody Login login){
        return comptUserService.login(login);
    }

}
