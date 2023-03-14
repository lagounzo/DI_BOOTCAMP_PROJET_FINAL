package com.mon.espace.medical.services;

import com.mon.espace.medical.models.HopitalSpeciality;

import java.util.List;

public interface HopitalSpecialityService {
    List<HopitalSpeciality> getAll();
    HopitalSpeciality Create(HopitalSpeciality hopitalSpeciality);
    HopitalSpeciality Update(HopitalSpeciality hopitalSpeciality);

    void Delete(Long id);
}
