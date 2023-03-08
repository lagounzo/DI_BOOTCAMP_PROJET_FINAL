package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PrescriptionRepository  extends JpaRepository<Prescription, Long> {
}
