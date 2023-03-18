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
@Table(name = "profilUsers")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property= "id_profil") //a mettre sur toutes les table pour eviter les erreur des bouble infinie

public class ProfilUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_profil;

    @Column(name = "name" , length = 128)
    private String name ;

    @OneToMany (mappedBy = "profilUser")
    @JsonIdentityReference(alwaysAsId=true)
    private List<ComptUser> comptUserList;


    @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;
}
