package com.mon.espace.medical.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "consultations")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property= "id_consultation") //a mettre sur toutes les table pour eviter les erreur des bouble infinie

public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_consultation;

   /* @Column(name = "dateRdv" , columnDefinition = "timestamp")
    private Date dateRdv ;*/

    @Column(name = "motif_mal", length = 250)
    private String description;

    @Column(name = "observation", length = 250)
    private String commentaire;

   /* @Column(name = "Boolean", nullable = false, columnDefinition = " boolean default false") // la contrainte est a revoire
    private  Boolean status;*/
    @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;


    //plusieurs consultations ou  consultation pour un patient

  @OneToMany(mappedBy = "consultation")
  @JsonIdentityReference(alwaysAsId=true)
  private List<Patient> patientList;

  @OneToOne
  @JsonIdentityReference(alwaysAsId=true)
    private Prescription prescription;




}
