import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/auth/login/login.component';
import { RegisterComponent } from './components/auth/register/register.component';
import { HeaderComponent } from './components/header/header.component';
import { HomeComponent } from './components/home/home.component';
import { AjouterComponent } from './components/medecin/ajouter/ajouter.component';
import { AntecedentComponent } from './components/patient/antecedent/antecedent.component';
import { ConstanteComponent } from './components/patient/constante/constante.component';
import { ConsultationComponent } from './components/patient/consultation/consultation.component';
import { InformationPersonnelleComponent } from './components/patient/information-personnelle/information-personnelle.component';
import { PlayoutComponent } from './components/patient/playout/playout.component';
import { PrescriptionComponent } from './components/patient/prescription/prescription.component';
import { SpecialiteHopitalDrComponent } from './components/patient/specialite-hopital-dr/specialite-hopital-dr.component';
import { SpecialiteComponent } from './components/specialite/specialite.component';

const routes: Routes = [

 //charger dans la memoire du navigateur le module a la demande

 {
  path:"admin", loadChildren: () => import ('./modules/public/public.module')
    .then (page => page.PublicModule)
},

  // route du login
  {
    path:"login", component: LoginComponent
   },
   // route du register
   {
    path:"register",component: RegisterComponent
   },
  //  {
  //   path: '',
  //   redirectTo: 'login',
  //   pathMatch: 'full'
  //  }

  {
    path:"home", component: HomeComponent
  },
  {
    path:"specialite",component : SpecialiteComponent
  },
  {
    path: "playout", component : PlayoutComponent, children: [

      {
        path: "informationPersonnelle", component: InformationPersonnelleComponent
      },
      {
        path: "consultation", component: ConsultationComponent
      },

      {
        path:"antecedent", component : AntecedentComponent
      },
      {
        path:"prescription", component : PrescriptionComponent
      },
      {
        path:"ajoutMedecin", component : AjouterComponent
      },
      {
        path:"specialiteHopitalDr", component : SpecialiteHopitalDrComponent
      },
      {
        path:"constante", component : ConstanteComponent
      }

    ]

  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
