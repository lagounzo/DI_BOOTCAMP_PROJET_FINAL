package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="medicaments")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_medicament;

    @Column(name= "medicament" , length = 250)
    private String medoc_name;

    @Column(name = "posologie",length = 250)
    private String indication;

    private Date createdat;
    private Date updatedat;

}
