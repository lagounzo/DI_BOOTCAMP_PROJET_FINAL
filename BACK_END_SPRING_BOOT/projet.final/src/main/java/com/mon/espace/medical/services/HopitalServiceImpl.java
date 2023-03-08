package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Hopital;
import com.mon.espace.medical.repository.HopitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HopitalServiceImpl  implements HopitalService{
// pour importer le repository une injection d independance
    @Autowired
    HopitalRepository hopitalRepository;
    @Override
    public List<Hopital> getAll() {
        return hopitalRepository.findAll();
    }

    @Override
    public Hopital Create(Hopital hopital) {
        return hopitalRepository.save(hopital);
    }

    @Override
    public Hopital Update(Hopital hopital) {
        return hopitalRepository.save(hopital);
    }

    @Override
    public void Delete(Long id) {
        hopitalRepository.deleteById(id);
    }

}
