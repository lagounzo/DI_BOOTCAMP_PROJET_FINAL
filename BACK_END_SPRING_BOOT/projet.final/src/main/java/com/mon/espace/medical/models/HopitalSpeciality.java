package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hopitalSepialitys")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HopitalSpeciality {
    @EmbeddedId
    private HopitalSpecialityKey id;

    private Date createdat;
    private Date updatedat;
    //LES DEUX CLES DES DEUX TABLES ETRANGERE
    @ManyToOne
    @MapsId("id_hopital")
    @JoinColumn(name = "id_hopital")
    private Hopital hopital;

    @ManyToOne
    @MapsId("id_speciality")
    @JoinColumn(name = "id_speciality")
    private Speciality speciality;

}
