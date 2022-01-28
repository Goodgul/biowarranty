import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NousConnaitreComponent } from './nous-connaitre.component';

describe('NousConnaitreComponent', () => {
  let component: NousConnaitreComponent;
  let fixture: ComponentFixture<NousConnaitreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NousConnaitreComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NousConnaitreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
