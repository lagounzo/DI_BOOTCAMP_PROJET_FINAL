package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.ComptUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ComptUserRepository extends JpaRepository<ComptUser, Long> {

    Optional<ComptUser> findByEmailAndPassword (String email , String password);

    //methode de connexion
}
