# Demo use async service call in component
- ES6 Promise<T>
- Value is available when Promise is resolved
   list(): Promise<Employee[]> {
     return Promise.resolve(this.employees);
   }

- Client code of Promise call then(x => { }) to handle data

  refreshEmployees() {
    this.empService.list()
      .then(list => {
        this.employees = list;
      });
  }