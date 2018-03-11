import { Component, OnInit } from '@angular/core';
import { Item, Order, orders} from "./order.data";
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
