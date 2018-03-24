import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { Employee } from './employee.model';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor() {
    this.emp = new Employee(0, "");
    this.frmSubmitted = false;
   }

  ngOnInit() {
  }

  emp: Employee;
  frmSubmitted: boolean;

  clear() {
    this.emp = new Employee(0, "");
  }

  save() {
    if (this.emp.empNo > 0 && this.emp.empName.length > 0) {
      alert(JSON.stringify(this.emp));
    }
  }
}
