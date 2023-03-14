import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FunctionService } from 'src/app/api/function.service';
import { PatientService } from 'src/app/api/patient.service';
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
    ){


  }
  ngOnInit(): void {
    this.infoPerso = this.fb.group({
      first_name:['',[Validators.required]],
      last_name:['',[Validators.required]]

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

  inforPersonel(){
    // if(!this.infoPerso.valid){
    //   return alert("veuillez saisir les champs vide")
    // }
    this.patientService.setPatient({
      data: this.infoPerso.value,
      endpoint:"patients"

    }).subscribe({
      next:(response :any) => {
        console.log(response)
      },
      error:(error :any) => {
        console.log(error)
      }
    })
  }

  open(content:any) {
		this.modalService.open(content , { size: 'lg' }); // pour le modal
	}

}
