import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { OrdersComponent } from './orders/orders.component';
import { OrderListComponent } from './order-list/order-list.component';
import { OrderDetailsComponent } from './order-details/order-details.component';
import { TodosComponent } from './todos/todos.component';
import { HighlightDirective } from './todos/highlight.directive';
import { DemoShowWhenComponent } from './demo-show-when/demo-show-when.component';
import { ShowWhenEventDirective } from './demo-show-when/show-when-event.directive';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    OrdersComponent,
    OrderListComponent,
    OrderDetailsComponent,
    TodosComponent,
    HighlightDirective,
    DemoShowWhenComponent,
    ShowWhenEventDirective
  ],
  imports: [
    BrowserModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
