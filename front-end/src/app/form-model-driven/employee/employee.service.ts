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

   list(): Promise<Employee[]> {
     return Promise.resolve(this.employees);
   }

   get(empNo: number): Promise<Employee> {
      return Promise.resolve(this.employees.find(x => x.empNo === empNo));
   }

   insert(emp: Employee) {
      if (this.employees.find(x => x.empNo === emp.empNo)) {
        return;
      }
      this.employees.push(emp);
   }
}
