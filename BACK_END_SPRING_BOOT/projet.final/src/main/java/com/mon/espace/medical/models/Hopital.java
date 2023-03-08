package com.mon.espace.medical.models;

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
@Table(name = "hopitals")
public class Hopital implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_hopital;
    //apres je mettrais les exceptions
    @Column(name = "hopitalName", length = 128 )

    private String hopital_name;

    @Column(name = "phone", length = 20 )
    private String tel1 ;
    @Column(name = "address", length = 128 )

    private String address;
    private Date createdat;
    private Date updatedat;


}
