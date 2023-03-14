package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "genres")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_consultation;

    @Column(name = "femme" , length = 20)
    private String f ;
    @Column(name = "mal" , length = 20)
    private String m;

    @Column(name = "non_binaire" , length = 20)
    private String nB;

    private Date createdat;
    private Date updatedat;
}
