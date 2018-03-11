import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  helloMsg: string;
  constructor() {
    this.helloMsg = "Xin chao, day la Component Hello";
   }

  ngOnInit() {
  }

  sayHello() {
    console.log("Hello, from the method");
  }

}
