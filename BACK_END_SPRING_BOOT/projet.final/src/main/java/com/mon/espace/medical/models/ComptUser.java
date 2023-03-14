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
@Table(name = "comptUsers")

public class ComptUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_comptUser;
    //apres je mettrais les exceptions
    @Column(name = "firstName", length = 250 )

    private String first_name;
    @Column(name = "lastName", length = 250 )

    private String last_name;
    @Column(name = "addres_email", length = 250 )

    private String email;
    @Column(name = "password", length = 250 )

    private String password;

    private Date createdat;
    private Date updatedat;

}
