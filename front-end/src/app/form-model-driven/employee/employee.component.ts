import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Employee } from './employee.model';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor() {
    this.emp = new Employee("0", "", 0, "", "");
    this.form = new FormGroup({
      'empNo': new FormControl(this.emp.empNo),
      'empName': new FormControl(this.emp.empName),
      'salary': new FormControl(this.salary),
      'deptName': new FormControl(this.deptName),
      'designation': new FormControl(this.emp.designation)
    });
    this.employees = [];
    this.helpText = "Tax Rules";
    this.helpLink = "./app/from-model-deiven/employee/texthelper.html";
    this.frmSubmitted = false;
   }

  ngOnInit() {
  }

  form: FormGroup;
  emp: Employee;
  empNo: FormControl;
  empName: FormControl;
  salary: FormControl;
  deptName: FormControl;
  designation: FormControl;

  employees: Employee[];
  helpLink: string;
  helpText: string;
  frmSubmitted: boolean;
  pattern: RegExp;

  clear() {
    this.emp = new Employee("0", "", 0, "", "");
  }

  save() {
    if (this.emp.empName.length > 0 && this.emp.deptName.length > 0) {
      this.employees.push(this.emp);
      this.frmSubmitted = true;
      this.emp = new Employee("0", "", 0, "", "");
    }
  }

  loadForm() {
    this.emp = new Employee("0", "", 0, "", "");
    this.frmSubmitted = false;
  }

  setDesignation() {
    if (this.emp.salary >= 1000 && this.emp.salary <= 12000) {
      this.emp.designation = "Jr. Programmer";
    }
  }
}
