package com.mon.espace.medical.services;

import com.mon.espace.medical.models.Hopital;

import java.util.List;

public interface HopitalService {
    List<Hopital> getAll();
    Hopital Create(Hopital hopital);
    Hopital Update(Hopital hopital);

    void Delete(Long id);

}
