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
// import { DashboardComponent } from './modules/component/dashboard/dashboard.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    RegisterComponent,
    PatientComponent,
    // DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    ReactiveFormsModule // pour le formulaire reactif
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
