package com.mon.espace.medical.models;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "profilUsers")
public class ProfilUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_profil;

    @Column(name = "name" , length = 128)
    private String name ;

    private Date createdat;
    private Date updatedat;
}
