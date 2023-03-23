import { Component, OnInit } from '@angular/core';
import { ConsultationService } from 'src/app/api/consultation';
import { HopitalService } from 'src/app/api/hopital.service';
import { MedecinService } from 'src/app/api/medecin';
import { PrescriptionService } from 'src/app/api/prescription.service';
import { SpecialityService } from 'src/app/api/speciality.service';
import { Consultation } from 'src/app/interface/consultation';
import { Hopital } from 'src/app/interface/hopital';
import { Medecin } from 'src/app/interface/medecin';
import { Prescription } from 'src/app/interface/prescription';
import { Speciality } from 'src/app/interface/speciality';

@Component({
  selector: 'app-prescription',
  templateUrl: './prescription.component.html',
  styleUrls: ['./prescription.component.css']
})
export class PrescriptionComponent implements OnInit {

  prescription:Prescription;

  constructor(
    private consultationService:ConsultationService,
    private prescriptionService:PrescriptionService){
      this.prescription=new Prescription();
    }

    ngOnInit(): void {
      this.getAllConsultation()
  }


  consultationList : Consultation[]= [];



  getAllConsultation(){
    this.consultationService.getConsultation().subscribe({
      next:data =>{
        this.consultationList = data as Consultation[]

        console.log(this.consultationList);

      },
      error:error => {

        console.log(error);
      }

    })
  }

  ordonnance() {

    //Recuperation de la consultation sélectionnée
    let consultationSelect!:Consultation;
    for (const consultation of this.consultationList) {
      if(consultation.id_consultation==this.prescription.consultation.id_consultation){
        consultationSelect=consultation;
        break;
      }
    }
    this.prescription.id_hopital=consultationSelect.id_hopital;
    this.prescription.id_medecin=consultationSelect.id_medecin;
    this.prescription.id_consultation=consultationSelect.id_consultation;
    this.prescription.id_profil = 2;

    console.log(this.prescription);

    this.prescriptionService.setPrescription(this.prescription).subscribe({
      next:data=>{
        console.log(data);
        this.prescription=new Prescription(); //clearn onglet
        alert("Prescription créée avec succès");

      },
      error:error=>{
        console.log(error);

      }
    })
  }

}

