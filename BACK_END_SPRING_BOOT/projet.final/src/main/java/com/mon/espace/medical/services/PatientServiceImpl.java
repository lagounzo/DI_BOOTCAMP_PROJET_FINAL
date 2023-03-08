package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Patient;
import com.mon.espace.medical.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService{
    // pour importer le repository une injection d independance
    @Autowired
    PatientRepository patientRepository;
    @Override
    public List<Patient> getAll() {

        return patientRepository.findAll();
    }

    @Override
    public Patient Create(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient Update(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void Delete(Long id) {
        patientRepository.deleteById(id);
    }
}
