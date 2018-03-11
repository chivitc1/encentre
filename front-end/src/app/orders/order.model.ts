export interface OrderLine {
    itemId: string;
    count: number;
}

import {Item, items} from "./item.model"
export class Order {
    constructor(public orderId: number,
        public orderDate: Date,
        public delivered: boolean,
        public deliveryDate: Date,
        public items: OrderLine[]) {}
        
    get DeliveryStatus(): string {
        return this.delivered ? "YES" : "NO";
    }

    totalPrice() : number {
        var totalPrice : number = 0;
        for (let orderLine of this.items) {
            for (let item of items) {
                if(orderLine.itemId == item.itemId) {
                    totalPrice += orderLine.count * item.unitPrice;
                    break;
                }
            }
        }
        return totalPrice;
    }

    getItemsOrdered() : Item[] {
        var itemsOrdered : Item[] = [];

        for (let orderLine of this.items) {
            for (let item of items) {
                if (orderLine.itemId === item.itemId) {
                    itemsOrdered.push(item);
                    break;
                }
            }
        }
        return itemsOrdered;
    }
}

export var orders : Order[] = [];
orders.push(new Order(1, new Date("2016-04-20"), true, new Date('2016-04-22'), 
    [{itemId: "I001", count: 1},
    {itemId: "I002", count: 1},
    {itemId: "I004", count: 2}]));

orders.push(new Order(2, new Date("2016-04-22"), true, new Date('2016-04-23'), 
    [{itemId: "I001", count: 1},
    {itemId: "I002", count: 2},
    {itemId: "I003", count: 2}]));

    orders.push(new Order(3, new Date("2016-04-24"), true, new Date('2016-04-25'), 
    [{itemId: "I001", count: 1},
    {itemId: "I002", count: 1},
    {itemId: "I004", count: 2}]));

    orders.push(new Order(4, new Date("2016-04-25"), true, new Date('2016-04-27'), 
    [{itemId: "I001", count: 1},
    {itemId: "I002", count: 1},
    {itemId: "I004", count: 2}]));