package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Speciality;
import com.mon.espace.medical.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpecialityServiceImpl implements SpecialityService{

    // pour une injection d'indepense

    @Autowired
    SpecialityRepository specialityRepository;

    @Override
    public List<Speciality> getAll() {
        return specialityRepository.findAll();
    }

    @Override
    public Speciality Create(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public Speciality Update(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void Delete(Long id) {
        specialityRepository.deleteById(id);

    }

}
