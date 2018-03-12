import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-show-when',
  templateUrl: './demo-show-when.component.html',
  styleUrls: ['./demo-show-when.component.css']
})
export class DemoShowWhenComponent implements OnInit {

  value: number = 0;

  increment() {
    this.value++;
  }
  constructor() { }

  ngOnInit() {
  }

}
