package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Consultation;
import com.mon.espace.medical.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsultationServiceImpl implements ConsultationService{
    // pour importer le repository une injection d independance
    @Autowired
    ConsultationRepository consultationRepository;
    @Override
    public List<Consultation> getAll() {
        return consultationRepository.findAll();
    }

    @Override
    public Consultation Create(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Consultation Update(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public void Delete(Long id) {
        consultationRepository.deleteById(id);
    }
}
