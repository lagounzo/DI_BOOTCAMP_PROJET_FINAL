package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Speciality;

import java.util.List;

public interface SpecialityService {
    List<Speciality> getAll();
    Speciality Create(Speciality speciality);
    Speciality Update(Speciality speciality);

    void Delete(Long id);
}
