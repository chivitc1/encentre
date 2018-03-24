import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { Employee } from './employee.model';

import { CustomValidator } from './custom-validator';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor(fEmp: FormBuilder) {
    this.emp = new Employee("0", "", 0, "", "", "");
    this.employees = [];
    this.helpText = "Tax Rules";
    this.helpLink = "./app/from-model-deiven/employee/texthelper.html";
    this.frmSubmitted = false;
   }

  ngOnInit() {
    this.form = new FormGroup({
      'empNo': new FormControl(this.emp.empNo, 
        Validators.compose([Validators.required, Validators.pattern('[0-9]+')])),
      'empName': new FormControl(this.emp.empName, 
        Validators.compose([Validators.required])),
      'salary': new FormControl(this.emp.salary, 
        Validators.compose([Validators.required, Validators.pattern('[0-9]+')])),
      'deptName': new FormControl(this.emp.deptName,
        Validators.compose([Validators.required, Validators.pattern('[a-zA-Z]+')])),
      'designation': new FormControl(this.emp.designation),
      'email': new FormControl(this.emp.email,
        Validators.compose([Validators.required, CustomValidator.emailAddressValidator]))
    })
  }

  form: FormGroup;
  emp: Employee;
  empNo: FormControl;
  empName: FormControl;
  salary: FormControl;
  deptName: FormControl;
  designation: FormControl;
  email: FormControl;

  employees: Employee[];
  helpLink: string;
  helpText: string;
  frmSubmitted: boolean;
  pattern: RegExp;

  clear() {
    this.emp = new Employee("0", "", 0, "", "", "");
  }

  save() {
    if (this.emp.empName.length > 0 && this.emp.deptName.length > 0) {
      this.employees.push(this.emp);
      this.frmSubmitted = true;
      this.emp = new Employee("0", "", 0, "", "", "");
    }
  }

  loadForm() {
    this.emp = new Employee("0", "", 0, "", "", "");
    this.frmSubmitted = false;
  }

  setDesignation() {
    if (this.emp.salary >= 1000 && this.emp.salary <= 12000) {
      this.emp.designation = "Jr. Programmer";
    }
  }
}
