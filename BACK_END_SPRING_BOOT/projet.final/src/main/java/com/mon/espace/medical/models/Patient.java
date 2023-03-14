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
import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient")
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
    @Column(name = "commune" ,length = 250)
    private String commune;

    //LES RELATIONS

    @ManyToOne
    @JsonIdentityReference(alwaysAsId=true) //que pour envoyer l'objet de la fonction
    private Fonction fonction;

   /* @Column(name="statusMatrimonial", length = 250)
    private boolean */

    private Date createdat;
    private Date updatedat;

    @Column(name = "status", nullable = false, columnDefinition = " boolean default false") // la contrainte est a revoire
    private  Boolean status=true;

// obtenir la liste de 1 ou plusiuers consultations

   /* @OneToMany(mappedBy = "patient" , fetch = FetchType.LAZY)
    private List<Consultation> consultations ;*/

}
