package com.mon.espace.medical.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "communes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id_commune")

public class Commune implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_commune;

    @Column(name = "nameDistrict", length = 128)
    private String disrict_name;

    /* @Column(name = "area" , length = 128 )
     private String  area;*/
    @Column(name = "homeAddress", length = 128)
    private String home_address;

    /*@Column(name = "Boolean", nullable = false, columnDefinition = " boolean default false") // la contrainte est a revoire
    private  Boolean status;*/


    //////// LES RELATIONS //////////////
    @OneToMany(mappedBy = "commune")
    @JsonIdentityReference(alwaysAsId = true)
    private List<Patient> patientList;

    @JsonIdentityReference(alwaysAsId = true)
    @OneToMany(mappedBy = "commune")
    private List<Medecin> medecinList;

    /////////////////////////
    @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;



}