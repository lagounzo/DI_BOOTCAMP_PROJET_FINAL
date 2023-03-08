package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Prescription;

import java.util.List;

public interface PrescriptionService {
    List<Prescription> getAll();
    Prescription Create(Prescription prescription);
    Prescription Update(Prescription prescription);

    void Delete(Long id);
}
