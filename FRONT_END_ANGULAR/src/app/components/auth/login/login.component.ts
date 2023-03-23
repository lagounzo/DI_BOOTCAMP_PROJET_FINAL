import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/api/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
 // pour faire les validation dans mon formulaire
  login! : FormGroup;

  // le constructeur
  constructor(private fb : FormBuilder, private router:Router  , private LoginService : LoginService){}

  ngOnInit(): void {
    this.login =this.fb.group({
      email:[``,[Validators.required /*,Validators.email*/]],
      password:[``,Validators.required]
    })

  }
// la fontion retourne l'alert d'envoie
  logIn(){
    // console.log(this.login.value)
    // if (!this.login.valid){
    //   return alert("veuillez saisir vos identifiants")
    // }
    // this.LoginService.setLogin({
    //   data : this.login.value,
    //   endpoint: "commtUsers/login"


    // }).subscribe({
    //   next:(response :any) => {
    //     console.log(response)
    //   },
    //   error:(error :any) => {
    //     console.log(error)
    //   }
    // })



    // if(this.login.invalid){
    //   alert("Error");
    // }else{
    //   alert("Succes");
    // }
    console.log(this.login)

    this.router.navigate(['/playout/informationPersonnelle']);

  }

  //resgter

  register(){
    this.router.navigate(['/register']);
  }
}

