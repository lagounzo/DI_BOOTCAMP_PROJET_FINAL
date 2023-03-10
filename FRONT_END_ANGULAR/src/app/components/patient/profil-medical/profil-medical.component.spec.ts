import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfilMedicalComponent } from './profil-medical.component';

describe('ProfilMedicalComponent', () => {
  let component: ProfilMedicalComponent;
  let fixture: ComponentFixture<ProfilMedicalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfilMedicalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfilMedicalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
