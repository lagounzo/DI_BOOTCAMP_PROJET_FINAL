import { NgModule } from '@angular/core';
import { ChildrenOutletContexts, RouterModule, Routes } from '@angular/router';
import { AntecedentComponent } from 'src/app/components/patient/antecedent/antecedent.component';
import { ConsultationComponent } from 'src/app/components/patient/consultation/consultation.component';
import { InformationPersonnelleComponent } from 'src/app/components/patient/information-personnelle/information-personnelle.component';
import { MaladieComponent } from 'src/app/components/patient/maladie/maladie.component';
import { PlayoutComponent } from 'src/app/components/patient/playout/playout.component';
import { PrescriptionComponent } from 'src/app/components/patient/prescription/prescription.component';
import { ProfilMedicalComponent } from 'src/app/components/patient/profil-medical/profil-medical.component';

const routes: Routes = [
  {
    path:"", component : PlayoutComponent , children: [
      {
        path: "consultation",component : ConsultationComponent
      },
      {
        path:"maladie",component : MaladieComponent
      },
      {
        path:"prescription", component : PrescriptionComponent
      },
      {
        path:"profil", component : ProfilMedicalComponent
      },
      {
        path: "information-personnelle", component : InformationPersonnelleComponent
      },
      {
        path:"antecedent", component : AntecedentComponent
      },
      {
        path:"", redirectTo : "profil" , pathMatch: "full"
      }

    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PublicRoutingModule { }
