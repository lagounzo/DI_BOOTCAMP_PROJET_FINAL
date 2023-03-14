package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Genre;
import com.mon.espace.medical.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/*@AllArgsConstructor*/
public class GenreServiceImpl implements GenreService {
    @Autowired
   GenreRepository genreRepository;
    @Override
    public List<Genre> getAll(){
        return genreRepository.findAll();
    }

    @Override
    public Genre Create(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public Genre Update(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public void Delete(Long id) {
        genreRepository.deleteById(id);
    }
}
