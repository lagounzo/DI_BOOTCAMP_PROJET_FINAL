package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Users;
import com.mon.espace.medical.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService {
    // pour importer le repository une injection d independance

   private final UserRepository userRepository;

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users Create(Users users) {
        return userRepository.save(users);
    }

    @Override
    public Users Update( Users users) {
        return userRepository.save(users);
    }

    @Override
    public void Delete(Long id) {
        userRepository.deleteById(id);
    }
}
