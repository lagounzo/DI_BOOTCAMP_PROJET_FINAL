package com.mon.espace.medical.models;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
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
    @NonNull(message ="speciality_name est obliagatoire")

/*
    @NotBlank(message = "le first_name n'est pas obligatoire")
*/
    @Column(name = "specilaityName", length = 250 )

    private String speciality_name;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdat;
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedat;


//////LES RELATIONS////////
    @OneToMany(mappedBy = "speciality")
    @JsonIdentityReference(alwaysAsId=true)
    private List<Medecin> medecinList;


    @OneToMany(mappedBy = "speciality")
    @JsonIdentityReference(alwaysAsId=true)
    private List<HopitalSpeciality> hopitalSpecialityList;


}


