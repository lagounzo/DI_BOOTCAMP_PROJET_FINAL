package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Consultation;

import java.util.List;

public interface ConsultationService {
    List<Consultation> getAll();

    Consultation Create(Consultation consultation);

    Consultation Update(Consultation consultation);

    void Delete(Long id);
}
