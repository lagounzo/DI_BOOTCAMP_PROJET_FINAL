import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpService } from 'src/app/api/api.service';
import { FunctionService } from 'src/app/api/function.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  communes: any

  //creer un constructeur / injecter les service du api
  constructor(private fb: FormBuilder, private apiService : HttpService, private functionService: FunctionService) {}

  /// creation fonction pour validtion du formulaire
  enregistrer! : FormGroup;

  soumettre(){
  console.log(this.enregistrer);

  }
  ngOnInit(): void {
    this.enregistrer =this.fb.group({
      last_name:['',Validators.required],
      first_name:['',Validators.required], // le nombre de caracter a la saisir
      email:['', Validators.email],
      password:['',Validators.required]
    })

    
    // throw new Error('Method not implemented.');
  }

  // pour connecter notre api
signUp(){

  if (!this.enregistrer.valid){

  return alert("veuillerz remplir tous les champs")

  }
  this.apiService.post({
    data : this.enregistrer.value,
    endpoint: "commtUsers"


  }).subscribe({
    next:(response ) => {
      console.log(response)
    },
    error:(error) => {
      console.log(error)
    }

  })


}


}

// ngOninit(): void {
// }


