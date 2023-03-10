import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  //creer un constructeur
  constructor(private enregistrers: FormBuilder) {}

  /// creation fonction pour validtion du formulaire
  enregistrer! : FormGroup;
  soumettre(){
  console.log(this.enregistrer);

  }
  ngOnInit(): void {
    this.enregistrer =this.enregistrers.group({
      nom:['',Validators.required],
      prenom:['',Validators.minLength(3)] // le nombre de caracter a la saisir
    })
    // throw new Error('Method not implemented.');
  }



ngOnint(): void {
}
}

