import { Component, OnInit } from '@angular/core';

import {  Item, Order, orders } from '../orders/order.data';

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css']
})
export class OrderListComponent implements OnInit {

  orders: Order[];
  selectedOrder: Order;

  constructor() { 
    this.orders = orders;
  }

  ngOnInit() {
  }

  viewDetails(selectedOrder: Order) {
    this.selectedOrder = selectedOrder;
  }

  closeDetails() {
    this.selectedOrder = null;
  }
}
