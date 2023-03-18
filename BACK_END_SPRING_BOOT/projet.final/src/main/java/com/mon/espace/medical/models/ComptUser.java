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
@Table(name = "comptUsers")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property= "id_comptUser") //a mettre sur toutes les table pour eviter les erreur des bouble infinie
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
    @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;

    //////LES RELATIONS/////////

    @ManyToOne
    @JsonIdentityReference(alwaysAsId=true)
    private ProfilUser profilUser;

    @OneToMany(mappedBy = "comptUser")
    @JsonIdentityReference(alwaysAsId=true)
    private List<Patient> patientList;

    @OneToMany(mappedBy = "comptUser")
    @JsonIdentityReference(alwaysAsId=true)
    private List<Medecin> medecinList;



}
