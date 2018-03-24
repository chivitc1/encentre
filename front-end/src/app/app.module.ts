import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { OrdersComponent } from './orders/orders.component';
import { EmployeeComponent } from './form-model-driven/employee/employee.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: "orders-app",
  template: `<app-orders></app-orders>`
})
export class OrdersAppComponent {}
@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule,    
    FormsModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
