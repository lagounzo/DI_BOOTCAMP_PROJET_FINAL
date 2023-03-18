package com.mon.espace.medical.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@Table(name = "constantes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property= "id_constante")
public class Constante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_patient;

    @Column(name = "poids", length = 250)
    private int poids;
    @Column(name = "tailles", length = 250)
    private int tailles;
    @Column(name = "temperature", length = 250)
    private int temperature;
    @Column(name = "glycemie", length = 250)
    private int glycemie;
    @Column(name = "Tension_artérielle", length = 250)
    private int TensionArtérielle;
    @Column(name = "frequence_cardiaque", length = 250)
    private int frequenceCardiaque;
    @Column(name = "valider", length = 250)
    private int valider;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;



    //// LES RELATION ///////





}
