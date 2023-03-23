import { Component, OnInit } from '@angular/core';
import { Validators,FormBuilder,FormGroup } from '@angular/forms';
// import { ,Validators } from '@angular/forms';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap'; // import du modale
import { ConsultationService } from 'src/app/api/consultation';
import { HopitalService } from 'src/app/api/hopital.service';
import { MedecinService } from 'src/app/api/medecin';
import { SpecialityService } from 'src/app/api/speciality.service';
import { Consultation } from 'src/app/interface/consultation';
import { Hopital } from 'src/app/interface/hopital';
import { Medecin } from 'src/app/interface/medecin';
import { Speciality } from 'src/app/interface/speciality';


@Component({
  selector: 'app-consultation',
  templateUrl: './consultation.component.html',
  styleUrls: ['./consultation.component.css'],
  	// add NgbModalConfig and NgbModal to the component providers
	providers: [NgbModalConfig, NgbModal],
})
export class ConsultationComponent implements OnInit {

  consultation: Consultation;

  hopitalList : Hopital[] = [];

  specialityList :Speciality[] = [];

  medecinList : Medecin[] = [];

  consultationList : Consultation[]= [];

  constructor( config: NgbModalConfig, private modalService: NgbModal ,
    private hopitalService:HopitalService,
    private specialityService:SpecialityService,
    private medecinService:MedecinService,
    private consulstationService:ConsultationService,
    ) {
		// customize default values of modals used by this component tree
		config.backdrop = 'static';
		config.keyboard = false;

    this.consultation = new Consultation();
}


diagnostique(){
  this.consultation.id_profil = "2";
  console.log(this.consultation)
  this.consulstationService.setConsultation(this.consultation).subscribe({
    next:data =>{
      console.log(data);
      this.consultation=new Consultation();
      this.modalService.dismissAll();
      this.getAllConsultation();
      alert("consultation enregistrée avec succès")
    },
    error:error =>{
      console.log(error)
    }
  })

}

ngOnInit(): void{
  this.getAllHopital();

}
// methode hopital
getAllHopital(){
  this.hopitalService.getHopital().subscribe({
    next:data =>{
      console.log(data);
      this.hopitalList = data as Hopital[]

      this.getAllSpeciality();

    },
    error:error =>{
      console.log(error);

    }
  })

}

// methode speciality
 getAllSpeciality(){
  this.specialityService.getSpeciality().subscribe({
    next:data =>{
      console.log(data);
      this.specialityList = data as Speciality []
      this.getAllMedecin();

    },
    error:error =>{
      console.log(error);
    }

  })
 }


//   methode medecin

getAllMedecin(){
  this.medecinService.getMedecin().subscribe({
    next:data =>{
      console.log(data);
      this.medecinList = data as Medecin[]
      this.getAllConsultation();
    },
    error:error =>{
      console.log(error);

    }
  })

}

getAllConsultation(){
  this.consulstationService.getConsultation().subscribe({
    next:data =>{

      this.consultationList = data as Consultation[]
      this.consultationList.forEach(consultation=>{
        console.log(consultation.id_speciality);

        for (const medecin of this.medecinList) {
          if(consultation.id_medecin==medecin.id_medecin){
            consultation.id_medecin=medecin
            break;
          }
        }
        for (const specialite of this.specialityList) {
          if(consultation.id_speciality==specialite.id_speciality){
            consultation.id_speciality=specialite
            break;
          }
        }
        for (const hopital of this.hopitalList) {
          if(consultation.id_hopital==hopital.id_hopital){
            consultation.id_hopital=hopital;
            break;
          }
        }
      })
      console.log(this.consultationList);

    },
    error:error => {

      console.log(error);
    }

  })
}

	open(content:any) {
		this.modalService.open(content , { size: 'l' }); // pour le modal
	}

}
