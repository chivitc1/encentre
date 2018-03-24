import {Employee} from './employee.model';
import { Injectable } from '@angular/core';

@Injectable()
export class EmployeeService {

  private employees: Employee[];
  constructor() {
    this.employees = [
      { empNo: 1, empName: 'Nguyen Van A'},
      { empNo: 2, empName: 'Nguyen Van B'},
      { empNo: 3, empName: 'Nguyen Van C'},
      { empNo: 4, empName: 'Nguyen Van D'}
    ]
   }

   list(): Employee[] {
     return this.employees;
   }

   get(empNo: number): Employee {
      return this.employees.find(x => x.empNo === empNo);
   }

   insert(emp: Employee) {
      if (this.employees.find(x => x.empNo === emp.empNo)) {
        return;
      }
      this.employees.push(emp);
   }
}
