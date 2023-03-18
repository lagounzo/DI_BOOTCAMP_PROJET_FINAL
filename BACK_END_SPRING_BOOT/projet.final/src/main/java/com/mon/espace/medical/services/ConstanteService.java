package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Constante;

import java.util.List;

public interface ConstanteService {
    List<Constante> getAll();
  Constante Create(Constante constante);
    Constante Update(Constante constante);
    void Delete(Long id);
}
