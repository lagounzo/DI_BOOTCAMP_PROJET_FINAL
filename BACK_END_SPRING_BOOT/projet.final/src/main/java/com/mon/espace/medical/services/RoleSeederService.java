package com.mon.espace.medical.services;

import com.mon.espace.medical.models.ProfilUser;
import com.mon.espace.medical.repository.ProfilUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service

public class RoleSeederService {
    @Autowired
    ProfilUserRepository  profilUserRepository;
// creation des roles
    @Transactional
            public void seedRole(){
        /*BackInfo info = new BackInfo();*/

        if (profilUserRepository.findAll().size()==0) {
            List<ProfilUser> profilUserList = new ArrayList<>();
            ProfilUser patient = new ProfilUser();
            ProfilUser medecin = new ProfilUser();
            ProfilUser admin = new ProfilUser();
            ProfilUser infirmerie = new ProfilUser();


            patient.setName("patient");
            medecin.setName("medecin");
            admin.setName("admin");
            infirmerie.setName("infirmerie");


            profilUserList.add(patient);
            profilUserList.add(medecin);
            profilUserList.add(admin);


            profilUserList.forEach((profilUser) -> {
                profilUserRepository.save(profilUser);
            });
        }
    }

    }