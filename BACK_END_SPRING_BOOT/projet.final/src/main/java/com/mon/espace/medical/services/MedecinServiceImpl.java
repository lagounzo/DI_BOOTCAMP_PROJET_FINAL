package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Medecin;
import com.mon.espace.medical.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinServiceImpl implements MedecinService{
    // pour l'injection des independences importer les repository
    @Autowired
    MedecinRepository medecinRepository;
    @Override
    public List<Medecin> getAll() {
        return medecinRepository.findAll();
    }

    @Override
    public Medecin Create(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public Medecin Update(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public void Delete(Long id) {
        medecinRepository.deleteById(id);

    }
}
