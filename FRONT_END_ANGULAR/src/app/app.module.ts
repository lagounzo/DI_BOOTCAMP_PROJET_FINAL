import { NgDompurifySanitizer } from "@tinkoff/ng-dompurify";
import { TuiRootModule, TuiDialogModule, TuiAlertModule, TUI_SANITIZER } from "@taiga-ui/core";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { LoginComponent } from './components/auth/login/login.component';
import { RegisterComponent } from './components/auth/register/register.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PatientComponent } from './components/patient/patient.component';
import { PrescriptionComponent } from './components/patient/prescription/prescription.component';
import { PlayoutComponent } from './components/patient/playout/playout.component';
import { ConsultationComponent } from './components/patient/consultation/consultation.component';
import { ProfilMedicalComponent } from './components/patient/profil-medical/profil-medical.component';
import { InformationPersonnelleComponent } from './components/patient/information-personnelle/information-personnelle.component';
import { AllergieComponent } from './components/patient/allergie/allergie.component';
import { AntecedentComponent } from './components/patient/antecedent/antecedent.component';
import { HttpClientJsonpModule, HttpClientModule } from "@angular/common/http";
import { VaccinationComponent } from './components/patient/vaccination/vaccination.component';
import { ConstanteComponent } from './components/patient/constante/constante.component';
import { AjouterComponent } from './components/medecin/ajouter/ajouter.component';
import { HomeComponent } from './components/home/home.component';
import { SpecialiteComponent } from './components/specialite/specialite.component';
import { SpecialiteHopitalDrComponent } from './components/patient/specialite-hopital-dr/specialite-hopital-dr.component';
// import { DashboardComponent } from './modules/component/dashboard/dashboard.component';
import {NgxTypedJsModule} from 'ngx-typed-js';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    RegisterComponent,
    PatientComponent,
    PrescriptionComponent,
    PlayoutComponent,
    ConsultationComponent,
    ProfilMedicalComponent,
    InformationPersonnelleComponent,
    AllergieComponent,
    AntecedentComponent,
    VaccinationComponent,
    ConstanteComponent,
    AjouterComponent,
    HomeComponent,
    SpecialiteComponent,
    SpecialiteHopitalDrComponent,
    // DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    NgxTypedJsModule,
    ReactiveFormsModule, // pour le formulaire reactif
      BrowserAnimationsModule,
      TuiRootModule,
      TuiDialogModule,
      TuiAlertModule,
      HttpClientModule, // impoter pour l api

],
  providers: [{provide: TUI_SANITIZER, useClass: NgDompurifySanitizer}],
  bootstrap: [AppComponent]
})
export class AppModule { }
