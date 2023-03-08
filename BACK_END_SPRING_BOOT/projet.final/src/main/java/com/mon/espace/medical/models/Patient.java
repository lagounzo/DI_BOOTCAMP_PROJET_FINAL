package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient")

public class Patient implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_patient;

@Column(name = "firstName", length = 128)
    private String first_name;
    @Column(name = "lastName", length = 128)
    private String last_name;

    @Column(name = "sexe", length = 10)
    private String sexe;
    @Column(name = "phone", length = 20 )
    private String tel1 ;
    @Column(name = "address", length = 128 )
    private String address;
    private Date createdat;
    private Date updatedat;

@Column(name = "Boolean", nullable = false, columnDefinition = " boolean default false") // la contrainte est a revoire
    private  Boolean status;

// obtenir la liste de 1 ou plusiuers consultations

   /* @OneToMany(mappedBy = "patient" , fetch = FetchType.LAZY)
    private List<Consultation> consultations ;*/

}
