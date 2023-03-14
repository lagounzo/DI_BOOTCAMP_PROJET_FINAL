package com.mon.espace.medical.controllers;

import com.mon.espace.medical.models.Genre;
import com.mon.espace.medical.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/genres")
public class GenreController {
    @Autowired
    //recuperer tous les elements de la table
    GenreService genreService;
    @GetMapping()
    public List<Genre> getAll() {
        return genreService.getAll();
    }
    @PostMapping
    public Genre Create(@RequestBody Genre genre) {
    return genreService.Create(genre);
    }

    @PutMapping
    public Genre Update(@RequestBody Genre genre) {
        return genreService.Update(genre);
    }
    @DeleteMapping
    public void Delete(Long id) {
        genreService.Delete(id);
    }
}

