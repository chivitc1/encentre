import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { Employee } from './employee.model';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers: [EmployeeService]
})
export class EmployeeComponent implements OnInit {

  constructor(private empService: EmployeeService) {
    this.emp = new Employee(0, "");
    this.frmSubmitted = false;
   }

  ngOnInit() {
    this.refreshEmployees();
  }

  emp: Employee;
  frmSubmitted: boolean;
  employees: Employee[];

  refreshEmployees() {
    this.employees = this.empService.list();
  }
  clear() {
    this.emp = new Employee(0, "");
  }

  save() {
    if (this.emp.empNo > 0 && this.emp.empName.length > 0) {
      alert(JSON.stringify(this.emp));
      this.empService.insert(this.emp);
      this.emp = new Employee(0, "");
      this.refreshEmployees();
    }
  }
}
