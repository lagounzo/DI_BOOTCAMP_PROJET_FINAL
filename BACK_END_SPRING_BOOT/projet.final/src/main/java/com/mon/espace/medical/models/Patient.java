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


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patients")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property= "id_patient") //a mettre sur toutes les table pour eviter les erreur des bouble infinie
public class Patient implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_patient;

    @Column(name = "firstName", length = 128)
    private String first_name;
    @Column(name = "lastName", length = 128)
    private String last_name;

    @Column(name = "sexe")
    private char sexe;
    @Column(name = "phone", length = 20 )
    private String tel1 ;

    @Column(name = "address", length = 128 )
    private String address;
    @Column(name = "assurance_maladie")
    private String carte_assurance_maladie;
    @Column(name="profession", length = 250)
    private String profession;
   /* @Column(name = "commune" ,length = 250)
    private String commune;*/

    //LES RELATIONS

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIdentityReference(alwaysAsId=true) //que pour envoyer l'objet de la fonction
    private Fonction fonction;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIdentityReference(alwaysAsId=true) //que pour envoyer l'objet de la commune
    private  Commune commune;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIdentityReference(alwaysAsId=true) //que pour envoyer l'objet de la consultation
    private Consultation consultation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIdentityReference(alwaysAsId=true)
    private ComptUser comptUser;

   /* @Column(name="statusMatrimonial", length = 250)
    private boolean */




   @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
   @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;

    @Column(name = "status", nullable = false, columnDefinition = " boolean default false") // la contrainte est a revoire
    private  Boolean status=true;



}
