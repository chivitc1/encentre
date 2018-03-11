#Multi components - communications
app-order-list use app-order-details

##When user select an item in order-list, bind that item to order-details property
<app-order-details [order]="selectedOrder" ...>

##order-details need @Input() property to accept the input from order-list
  @Input()
  order: Order;

##order-details have close button, need emit close event to order-list using @Output()
  @Output()
  close = new EventEmitter();

##order-list need attach close event to order-details it using
<app-order-details [order]="selectedOrder"
  (close)="closeDetails()"></app-order-details>

##order-list update selectedOrder on the close event
  closeDetails() {
    this.selectedOrder = null;
  }
Then order-details will disapear

##order-list need highlight the current selected item
  <tr *ngFor="let order of orders"
    [class.selected-order]="order === selectedOrder">

