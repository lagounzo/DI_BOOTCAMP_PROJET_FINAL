package com.mon.espace.medical.services;

import com.mon.espace.medical.models.ProfilUser;
import com.mon.espace.medical.repository.ProfilUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilUserServiceImpl implements ProfilUserService {
    // pour importer le repository une injection d independance

  @Autowired
    ProfilUserRepository profilUserRepository;

    @Override
    public List<ProfilUser> getAll() {
        return profilUserRepository.findAll();
    }

    @Override
    public ProfilUser Create(ProfilUser profilUser) {
        return profilUserRepository.save(profilUser);
    }

    @Override
    public ProfilUser Update(ProfilUser profilUser) {
        return null;
    }

    @Override
    public void Delete(Long id) {

    }
}
