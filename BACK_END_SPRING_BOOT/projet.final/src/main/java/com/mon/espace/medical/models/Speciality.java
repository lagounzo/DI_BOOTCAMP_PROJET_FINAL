package com.mon.espace.medical.models;

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
@Table(name = "specialitys") // creer la table dans la base de donnee
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_speciality;
/*
    @NonNull(message ="le first_name est obliagatoire")
*/
/*
    @NotBlank(message = "le first_name n'est pas obligatoire")
*/
    @Column(name = "specilaityMedecin", length = 250 )

    private String speciality;
    private Date createdat;
    private Date updatedat;


    //  lier un user a un ou  plusieurs consultations

    @OneToMany(mappedBy = "speciality")
    private List<HopitalSpeciality> hopitalSpecialityList;
}


