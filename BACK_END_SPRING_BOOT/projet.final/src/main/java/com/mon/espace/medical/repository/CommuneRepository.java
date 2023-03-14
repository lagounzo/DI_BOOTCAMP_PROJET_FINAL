package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.Commune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommuneRepository extends JpaRepository<Commune,Long> {
}
