import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SportclubComponent } from './sportclub.component';

describe('SportclubComponent', () => {
  let component: SportclubComponent;
  let fixture: ComponentFixture<SportclubComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SportclubComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SportclubComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
