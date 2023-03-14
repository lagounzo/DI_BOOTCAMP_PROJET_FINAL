package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> getAll();
    Genre Create(Genre genre);
    Genre Update(Genre genre);

    void Delete(Long id);
}
