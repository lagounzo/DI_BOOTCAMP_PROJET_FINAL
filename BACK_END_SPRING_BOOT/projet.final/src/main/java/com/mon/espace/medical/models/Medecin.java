package com.mon.espace.medical.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medecins")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property= "id_medecin") //a mettre sur toutes les table pour eviter les erreur des bouble infinie

public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id_medecin;
    // je dois mettre les exceptions

    @Column(name = "firstName", length = 128 )
    private String first_name;
    @Column(name = "lastName", length = 128 )
    private String last_name;

   /* @Column(name = "specility", length = 128 )
    private String speciality;*/
    @Column(name = "Genre", length = 1 )
    private String sexe;
    @Column(name = "phone", length = 20 )
    private String tel1 ;
    @Column(name = "address", length = 128 )
    private String address;



    // LES RELATIONS
    // pou la relation entre medecin et COMMUNE
    @ManyToOne
    @JsonIdentityReference(alwaysAsId=true) //que pour envoyer l'objet de la commune
    private Commune commune;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId=true) //que pour envoyer l'objet de la commune
    private Speciality speciality;
    @ManyToOne
    @JsonIdentityReference(alwaysAsId=true)
    private ComptUser comptUser;


    @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;




}
