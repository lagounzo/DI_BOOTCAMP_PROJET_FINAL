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
@Table(name = "prescriptions")
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
        private Date createdat;
        private Date updatedat;
        //une prescription pour une ordonnance
      /*  @OneToOne(fetch = FetchType.LAZY)
        Consultation consultations;*/

}
