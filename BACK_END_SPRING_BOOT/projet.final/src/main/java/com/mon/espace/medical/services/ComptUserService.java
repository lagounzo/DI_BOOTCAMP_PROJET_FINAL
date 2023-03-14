package com.mon.espace.medical.services;

import com.mon.espace.medical.models.ComptUser;
import com.mon.espace.medical.models.Login;
import com.mon.espace.medical.models.Register;

import java.util.List;

public interface ComptUserService {
    List<ComptUser> getAll();
    ComptUser Create(ComptUser comptUser );
    ComptUser Update(ComptUser comptUser);
    void Delete(Long id);

    // add methode login

    void register(Register register);
    ComptUser login(Login login);

/*
    ComptUser login(String email, String password);
*/
}
