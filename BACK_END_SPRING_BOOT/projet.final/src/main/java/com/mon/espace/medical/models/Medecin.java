package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medecins")
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id_medecin;
    // je dois mettre les exceptions

    @Column(name = "firstName", length = 128 )

    private String first_name;
    @Column(name = "lastName", length = 128 )

    private String last_name;

    @Column(name = "specility", length = 128 )

    private String speciality;
    @Column(name = "Genre", length = 1 )

    private String sexe;
    @Column(name = "phone", length = 20 )
    private String tel1 ;
    @Column(name = "address", length = 128 )

    private String address;
    private Date createdat;
    private Date updatedat;

    // pou la relation entre medecin et consultation
/*@OneToMany(fetch = FetchType.LAZY)
    private List<Consultation> consultations;*/


}
