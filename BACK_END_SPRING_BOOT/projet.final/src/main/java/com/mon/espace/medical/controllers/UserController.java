package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Users;
import com.mon.espace.medical.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // les routes
@AllArgsConstructor
public class UserController {
    @Autowired
    //recuperer tous les elements de la table
   private final UserService userService;
    @GetMapping
    public List<Users> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public Users Create(@RequestBody Users users) {
        return userService.Create(users);
    }

    @PutMapping
    public Users Update(@RequestBody Users users) {
        return userService.Update(users);
    }
    @DeleteMapping
    public void Delete(Long id) {
        userService.Delete(id);
    }

}
