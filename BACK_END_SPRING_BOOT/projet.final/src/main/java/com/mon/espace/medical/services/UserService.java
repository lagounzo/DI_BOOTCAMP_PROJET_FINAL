package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Users;

import java.util.List;

public interface UserService {
    List<Users> getAll();
    Users Create(Users users);

    Users Update(Users users);

    void Delete(Long id);
}
