import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FunctionService } from 'src/app/api/function.service';
import { PatientService } from 'src/app/api/patient.service';
// import { ProfessionService } from 'src/app/api/profession.service';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap'; // import du modale


@Component({
  selector: 'app-information-personnelle',
  templateUrl: './information-personnelle.component.html',
  styleUrls: ['./information-personnelle.component.css'],
  	// add NgbModalConfig and NgbModal to the component providers
	providers: [NgbModalConfig, NgbModal],
})
export class InformationPersonnelleComponent implements OnInit {
  communes: any

  //pour faire fonctionner le formulaire

  infoPerso! : FormGroup;

  //un constructeur pour la methode

  constructor(private fb: FormBuilder, private patientService: PatientService, private functionService: FunctionService,
    private modalService: NgbModal
    ){}
    // ,private professionService : ProfessionService

  ngOnInit(): void {
    this.infoPerso = this.fb.group({
      first_name:['',Validators.required],
      last_name:['',Validators.required],
      gender:['',Validators.required],
      address:['',Validators.required],
      contact: ['',Validators.required],
      commune: ['',Validators.required],
      assurance_maladie: ['',Validators.required],
      birthday: ['',Validators.required],



    })

// api communes
    this.functionService.getCommune().subscribe({
      next: (response)=> {
        console.log(response)
        this.communes = response;
      },
      error: (err)=> {
        console.log(err);
      }
    })

  }
 //api send for personnal information
  inforPersonel(){

    if(this.infoPerso.invalid){
      //  alert("veuillez saisir les champs vide")
    } else{
      let formVal = this.infoPerso.value;
      let data = JSON.stringify({
        "first_name": formVal.first_name,
        "last_name": formVal.last_name,
        "gender": formVal.gender,
        "address": formVal.address,
        "contact": formVal.contact,
        "assurance_maladie": formVal.assurance_maladie,
        "commune" : formVal.commune,
        "birthday": formVal.birthday,


    });
      this.patientService.setPatient(data).subscribe({
        next:(response :any) => {
          console.log(response)

        },
        error:(error :any) => {
          console.log(error)
        }
      
      })
      
      console.log(this.infoPerso.value)
    }


  }

  open(content:any) {
		this.modalService.open(content , { size: 'lg' }); // pour le modal
	}

}
