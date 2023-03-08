package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "consultations")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_consultation;

    @Column(name = "dateRdv" , columnDefinition = "timestamp")
    private Date dateRdv ;
    @Column(name = "Boolean", nullable = false, columnDefinition = " boolean default false") // la contrainte est a revoire
    private  Boolean status;
    private Date createdat;
    private Date updatedat;


    //plusieurs consultations ou 1 consultation pour un patient

  /*  @ManyToOne
    Patient patient ;*/
     // plusieurs consultation ou 1 pour un medecin
   /* @ManyToOne
    Medecin medecin;

    @OneToOne(mappedBy = "consultation",fetch = FetchType.LAZY)
    List<Prescription> prescription ;*/

    //medecin a une liste de  consultations

   /* @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medecin")
    private Medecin medecin;*/

    // patient pere et consultation enfant
 /*   @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient")
    private Patient patient;*/
}
