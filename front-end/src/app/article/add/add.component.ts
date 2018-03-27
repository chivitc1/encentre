import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent {
  _title: string;
  _body: string;
  constructor(private _http: HttpClient) { }

  onAdd() {
    const requestBody = {
      
    }
  }

}
