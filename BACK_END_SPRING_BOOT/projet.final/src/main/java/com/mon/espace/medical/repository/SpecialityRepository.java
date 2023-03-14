package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
