package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAll();
    Patient Create(Patient patient);
    Patient Update(Patient patient);

    void Delete(Long id);
}
