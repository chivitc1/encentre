import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoShowWhenComponent } from './demo-show-when.component';

describe('DemoShowWhenComponent', () => {
  let component: DemoShowWhenComponent;
  let fixture: ComponentFixture<DemoShowWhenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DemoShowWhenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoShowWhenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
