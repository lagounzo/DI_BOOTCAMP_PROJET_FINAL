package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionRepository  extends JpaRepository<Fonction, Long> {
}
