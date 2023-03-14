package com.mon.espace.medical.services;

import com.mon.espace.medical.models.ProfilUser;

import java.util.List;

public interface ProfilUserService {
    List<ProfilUser> getAll();
    ProfilUser Create(ProfilUser profilUser);
    ProfilUser Update(ProfilUser profilUser);

    void Delete(Long id);
}
