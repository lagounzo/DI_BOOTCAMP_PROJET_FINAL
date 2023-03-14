package com.mon.espace.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "communes")
public class Commune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_commune;

    @Column(name = "nameDistrict" , length = 128)
    private String disrict_name ;

   /* @Column(name = "area" , length = 128 )
    private String  area;*/
    @Column(name = "homeAddress" , length = 128 )
    private String  home_address;
    /*@Column(name = "Boolean", nullable = false, columnDefinition = " boolean default false") // la contrainte est a revoire
    private  Boolean status;*/
    private Date createdat;
    private Date updatedat;
}
