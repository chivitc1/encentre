import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { OrdersComponent } from './orders/orders.component';

@Component({
  selector: "orders-app",
  template: `<app-orders></app-orders>`
})
export class OrdersAppComponent {}
@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    OrdersComponent,
    OrdersAppComponent
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [OrdersAppComponent]
})
export class AppModule { }
