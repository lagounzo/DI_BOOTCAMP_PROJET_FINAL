package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Prescription;
import com.mon.espace.medical.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    // pour importer le repository une injection d independance

    @Autowired
    PrescriptionRepository prescriptionRepository;
    @Override
    public List<Prescription> getAll() {

        return prescriptionRepository.findAll();
    }

    @Override
    public Prescription Create(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    @Override
    public Prescription Update(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    @Override
    public void Delete(Long id) {
        prescriptionRepository.deleteById(id);
    }

}
