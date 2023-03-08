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
@Table(name = "users") // creer la table dans la base de donnee
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
/*
    @NonNull(message ="le first_name est obliagatoire")
*/
/*
    @NotBlank(message = "le first_name n'est pas obligatoire")
*/
    @Column(name = "first_name", length = 128 )

    private String firstName;
    @Column(name = "last_name", length = 128 )

    private String lastName;
    @Column(name = "Genre", length = 1 )
    private String sexe;

    @Column(name = "AnneeNaissance", length = 8 )
    private Date birthday;
    @Column(name = "CommuneServiceImpl", length = 128 )
    private String district;
    @Column(name = "AddressMail", length = 250 )
    private String email;
    @Column(name = "phone", length = 20 )
    private String tel1 ;
    @Column(name = "phone2", length = 20 )
    private String tel2 ;
    @Column(name = "address", length = 128 )

    private String address;
    private Date createdat;
    private Date updatedat;


    //  lier un user a un ou  plusieurs consultations

}


