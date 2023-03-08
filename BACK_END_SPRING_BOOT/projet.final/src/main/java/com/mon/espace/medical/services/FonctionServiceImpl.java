package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Fonction;
import com.mon.espace.medical.repository.FonctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FonctionServiceImpl  implements FonctionService {
    @Autowired
    FonctionRepository fonctionRepository;
    @Override
    public List<Fonction> getAll() {
        return fonctionRepository.findAll();
    }

    @Override
    public Fonction Create(Fonction fonction) {
        return fonctionRepository.save(fonction);
    }

    @Override
    public Fonction Update(Fonction fonction) {
        return fonctionRepository.save(fonction);
    }

    @Override
    public void Delete(Long id) {
        fonctionRepository.deleteById(id);
    }

}
