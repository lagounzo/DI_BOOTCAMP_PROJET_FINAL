package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Constante;
import com.mon.espace.medical.repository.ConstanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstanteServiceImpl  implements ConstanteService{
    @Autowired
    ConstanteRepository constanteRepository;

    @Override
    public List<Constante> getAll() {
        return constanteRepository.findAll();
    }

    @Override
    public Constante Create(Constante constante) {
        return constanteRepository.save(constante);
    }

    @Override
    public Constante Update(Constante constante) {
        return constanteRepository.save(constante);
    }

    @Override
    public void Delete(Long id) {
        constanteRepository.deleteById(id);

    }


}
