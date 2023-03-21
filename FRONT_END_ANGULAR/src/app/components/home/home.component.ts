import { Component } from '@angular/core';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [NgbCarouselModule, NgIf], // pour slide

})
export class HomeComponent {
  images = ["/assets/imag/dr_patient.jpg","/assets/imag/shot-health.jpg","/assets/imag/specialites.png"];


}
