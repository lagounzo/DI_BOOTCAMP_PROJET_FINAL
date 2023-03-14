package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.HopitalSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopitalSpecialityRepository extends JpaRepository<HopitalSpeciality,Long> {
}
