package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.Hopital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopitalRepository extends JpaRepository<Hopital, Long> {
}
