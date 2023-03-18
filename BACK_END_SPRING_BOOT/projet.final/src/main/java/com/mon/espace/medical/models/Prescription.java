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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prescriptions")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property= "id_prescription") //a mettre sur toutes les table pour eviter les erreur des bouble infinie

public class Prescription {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id_prescription;

        @Column(name = "date" , columnDefinition ="date")
        private Date date ;
        @Column(name = "Quantity", length = 20)
        private String qte;
        @Column(name = "Boolean", nullable = false, columnDefinition = " boolean default false") // a revoire la condition
        private  Boolean status;

        ////// LES RELATIONS////////

        /*prescription*/
        @OneToOne(mappedBy = "prescription")
        @JsonIdentityReference(alwaysAsId=true)
        private Consultation consultation;


        @Column(name = "created_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
        @Temporal(TemporalType.TIMESTAMP)
        private Date createdat;
        @Column(name = "updated_at", columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
        @Temporal(TemporalType.TIMESTAMP)
        private Date updatedat;


}
