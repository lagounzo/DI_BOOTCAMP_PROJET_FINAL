import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllergieComponent } from './allergie.component';

describe('AllergieComponent', () => {
  let component: AllergieComponent;
  let fixture: ComponentFixture<AllergieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllergieComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllergieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
