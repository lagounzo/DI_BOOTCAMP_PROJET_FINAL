package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Commune;

import java.util.List;

public interface CommuneService {
    List<Commune> getAll();

    Commune Create(Commune commune);

    Commune Update(Commune commune);

    void Delete(Long id);
}
