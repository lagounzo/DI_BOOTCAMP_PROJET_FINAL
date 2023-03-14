package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Commune;
import com.mon.espace.medical.repository.CommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuneServiceImpl implements CommuneService{
    @Autowired
    CommuneRepository communeRepository;
    @Override
    public List<Commune> getAll() {
        return communeRepository.findAll();
    }

    @Override
    public Commune Create(Commune commune) {
        return communeRepository.save(commune);
    }

    @Override
    public Commune Update(Commune commune) {
        return communeRepository.save(commune);
    }

    @Override
    public void Delete(Long id) {
        communeRepository.deleteById(id);
    }
}
