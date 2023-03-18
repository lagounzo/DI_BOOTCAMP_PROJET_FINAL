import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpService } from 'src/app/api/api.service';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap'; // import du modale


@Component({
  selector: 'app-ajouter',
  templateUrl: './ajouter.component.html',
  styleUrls: ['./ajouter.component.css'],
  providers: [NgbModalConfig, NgbModal],

})
export class AjouterComponent {

  constructor(private modalService: NgbModal){}

  open(content:any) {
		this.modalService.open(content , { size: 'lg' }); // pour le modal
	}

  //creer un constructeur / injecter les service du api
  // constructor(private fb: FormBuilder, private apiService : HttpService) {}

  /// creation fonction pour validtion du formulaire
  // enregistrer! : FormGroup;

  // soumettre(){
  // console.log(this.enregistrer);

  // }
  // ngOnInit(): void {
  //   this.enregistrer =this.fb.group({
  //     last_name:['',Validators.required],
  //     first_name:['',Validators.required], // le nombre de caracter a la saisir
  //     email:['', Validators.email],
  //     password:['',Validators.required]
  //   })
    // throw new Error('Method not implemented.');
  // }

  // pour connecter notre api
// signUp(){

//   if (!this.enregistrer.valid){

//   return alert("veuillerz remplir tous les champs")

//   }
//   this.apiService.post({
//     data : this.enregistrer.value,
//     endpoint: "commtUsers"


//   }).subscribe({
//     next:(response ) => {
//       console.log(response)
//     },
//     error:(error) => {
//       console.log(error)
//     }

//   })


// }

}
