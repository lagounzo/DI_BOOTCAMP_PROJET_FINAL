package com.mon.espace.medical.repository;

import com.mon.espace.medical.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
