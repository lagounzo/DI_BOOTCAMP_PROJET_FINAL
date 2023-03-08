package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Fonction;

import java.util.List;

public interface FonctionService {
    List<Fonction> getAll();

    Fonction Create(Fonction fonction);

    Fonction Update(Fonction fonction);

    void Delete(Long id);
}
