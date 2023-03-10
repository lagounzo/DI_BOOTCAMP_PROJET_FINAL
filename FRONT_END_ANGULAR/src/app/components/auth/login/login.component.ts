import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
 // pour faire les validation dans mon formulaire
  login! : FormGroup;

  // le constructeur
  constructor(private fb : FormBuilder, private router:Router){
  }

  ngOnInit(): void {
    this.login =this.fb.group({
      useremail:[``,[Validators.required /*,Validators.email*/]],
      password:[``,Validators.required]
    })

  }
// la fontion retourne l'alert d'envoie
  logIn(){
    if(this.login.invalid){
      alert("Error");
    }else{
      alert("Succes");
    }
    // console.log(this.login)
  }
  //resgter

  register(){
    this.router.navigate(['/register']);
  }
}

