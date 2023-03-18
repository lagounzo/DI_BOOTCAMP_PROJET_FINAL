import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SpecialiteHopitalDrComponent } from './specialite-hopital-dr.component';

describe('SpecialiteHopitalDrComponent', () => {
  let component: SpecialiteHopitalDrComponent;
  let fixture: ComponentFixture<SpecialiteHopitalDrComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SpecialiteHopitalDrComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SpecialiteHopitalDrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
