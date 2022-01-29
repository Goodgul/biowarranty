import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageDemarrageComponent } from './page-demarrage.component';

describe('PageDemarrageComponent', () => {
  let component: PageDemarrageComponent;
  let fixture: ComponentFixture<PageDemarrageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageDemarrageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PageDemarrageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
