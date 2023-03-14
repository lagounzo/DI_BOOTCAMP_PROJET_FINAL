package com.mon.espace.medical.services;

import com.mon.espace.medical.models.ComptUser;
import com.mon.espace.medical.models.Login;
import com.mon.espace.medical.models.Register;
import com.mon.espace.medical.repository.ComptUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComptUserServiceImpl  implements ComptUserService {
    @Autowired
    ComptUserRepository comptUserRepository;
    @Override
    public List<ComptUser> getAll(){
        return comptUserRepository.findAll();
    }
    @Override

    public ComptUser Create(ComptUser comptUser){
    return comptUserRepository.save(comptUser);
    }

    @Override
    public ComptUser Update(ComptUser comptUser) {
        return comptUserRepository.save(comptUser);
    }
    @Override
    public void Delete(Long id){
        comptUserRepository.deleteById(id);
    }

    @Override
    public void register(Register register) {

    }
 //methode de retour de connexion
    @Override
    public ComptUser login(Login login) {
        Optional<ComptUser> comptUser = comptUserRepository.findByEmailAndPassword(login.getEmail(),login.getPassword());
        if (comptUser.isPresent()) {
            return comptUser.get();
        } else {
            throw new ApplicationContextException("utilisateur inexistant");

        }
    }

    // methode login


   /* @Override
    public ComptUser  login(String email, String password) {
        return comptUserRepository.login(email,password);
    }*/
}