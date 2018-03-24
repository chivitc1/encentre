# Form template driven
## When to use this aproach?
- Simple form with simple logic (like login form, contact)

## Explainations
- Use template ref variable to ngForm
  <form (ngSubmit)="save()" #empForm="ngForm" novalidate>

And 

    <div class="form-group">
      <input type="button" (click)="clear()" value="Clear" class="btn btn-danger">
      <input type="submit" value="Submit" class="btn btn-success" [disabled]="!empForm.valid">
    </div>
    
- Use template ref variable to ngModel
    <div class="form-group">
      <label for="empNo">EmpNo</label>
      <input type="text" class="form-control" [(ngModel)]="emp.empNo" name="empNo" #empNo="ngModel" required pattern="[0-9]+">

      <div [hidden]="empNo.valid || empNo.pristine" class="alert alert-danger">
        Employee number is mandatory and is numeric
      </div>
    </div>
    <div class="form-group">
      <label for="empName">Emp Name</label>
      <input type="text" class="form-control" [(ngModel)]="emp.empName" name="empName" #empName="ngModel" required>
      <div [hidden]="empName.valid || empName.pristine" class="alert alert-danger">
        Employee name is mandatory
      </div>
    </div>

## Import FormsModule in AppModule
  imports: [
    BrowserModule,    
    FormsModule,
    NgbModule.forRoot()
  ]

