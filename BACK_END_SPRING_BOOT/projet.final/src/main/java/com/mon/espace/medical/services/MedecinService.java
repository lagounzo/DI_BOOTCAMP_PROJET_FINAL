package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Medecin;

import java.util.List;

public interface MedecinService {
    List<Medecin> getAll();
    Medecin Create(Medecin medecin);
    Medecin Update(Medecin medecin);

    void Delete(Long id);
}
