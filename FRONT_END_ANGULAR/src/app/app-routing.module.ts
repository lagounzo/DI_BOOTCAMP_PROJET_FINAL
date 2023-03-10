import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/auth/login/login.component';
import { RegisterComponent } from './components/auth/register/register.component';

const routes: Routes = [
  // route du login
  {
    path:"", component: LoginComponent
   },
   // route du register
   {
    path:"register",component: RegisterComponent
   }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
