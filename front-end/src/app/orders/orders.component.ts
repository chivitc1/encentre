import { Component, OnInit } from '@angular/core';
import {Order, orders} from "./order.model";
import { Item } from "./item.model";
@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})

export class OrdersComponent implements OnInit {

  orders: Order[];
  itemsInSelectedOrder: Item[];

  constructor() { 
    this.orders = orders;
  }

  ngOnInit() {
  }

  viewDetails(order: Order) {
    this.itemsInSelectedOrder = order.getItemsOrdered();
  }
}
