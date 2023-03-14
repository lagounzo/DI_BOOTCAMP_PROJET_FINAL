package com.mon.espace.medical.services;
import com.mon.espace.medical.models.HopitalSpeciality;
import com.mon.espace.medical.repository.HopitalSpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopitalSpecialityServiceImpl implements  HopitalSpecialityService {
    @Autowired
    HopitalSpecialityRepository hopitalSpecialityRepository;

    @Override
    public List<HopitalSpeciality> getAll() {
        return hopitalSpecialityRepository.findAll();
    }

    @Override
    public HopitalSpeciality Create(HopitalSpeciality hopitalSpeciality) {
        return hopitalSpecialityRepository.save(hopitalSpeciality);
    }

    @Override
    public HopitalSpeciality Update(HopitalSpeciality hopitalSpeciality) {
        return hopitalSpecialityRepository.save(hopitalSpeciality);
    }

    @Override
    public void Delete(Long id) {
        hopitalSpecialityRepository.deleteById(id);

    }
}
