import { NgModule } from '@angular/core';
import { ChildrenOutletContexts, RouterModule, Routes } from '@angular/router';
import { AjouterComponent } from 'src/app/components/medecin/ajouter/ajouter.component';
import { AntecedentComponent } from 'src/app/components/patient/antecedent/antecedent.component';
import { ConstanteComponent } from 'src/app/components/patient/constante/constante.component';
import { ConsultationComponent } from 'src/app/components/patient/consultation/consultation.component';
import { InformationPersonnelleComponent } from 'src/app/components/patient/information-personnelle/information-personnelle.component';
import { PlayoutComponent } from 'src/app/components/patient/playout/playout.component';
import { PrescriptionComponent } from 'src/app/components/patient/prescription/prescription.component';
import { ProfilMedicalComponent } from 'src/app/components/patient/profil-medical/profil-medical.component';

const routes: Routes = [
//   {
//     path:"", component : PlayoutComponent , children: [
//       {
//         path: "consultation",component : ConsultationComponent
//       },
//       {
//         path:"maladie",component : MaladieComponent
//       },
//       {
//         path:"prescription", component : PrescriptionComponent
//       },
      // {
      //   path:"profil", component : ProfilMedicalComponent
      // },
      // {
      //   path: "information-personnelle", component : InformationPersonnelleComponent
      // },
      // {
      //   path:"antecedent", component : AntecedentComponent
      // },
      // {
      //   path:"constante", component : ConstanteComponent
      // },
      // {
      //   path:"ajouter", component : AjouterComponent
      // },
      // {
      //   path:"", redirectTo : "profil" , pathMatch: "full"
      // }

  //   ]
  // }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PublicRoutingModule { }
