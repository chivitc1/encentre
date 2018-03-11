import { Component, OnInit, Input, OnChanges, Output, EventEmitter } from '@angular/core';
import { Order, Item } from '../orders/order.data';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent implements OnInit, OnChanges {

  @Input()
  order: Order;

  @Output()
  close = new EventEmitter();

  itemsInSelectedOrder: Item[];

  constructor() { }

  ngOnInit() {
  }

  ngOnChanges(changes): void {
    if (this.order) {
      this.itemsInSelectedOrder = this.order.getItemsOrdered();
    } else {
      this.itemsInSelectedOrder = null;
    }
  }

  closeDetails() {
    this.close.emit(null);
  }
}
