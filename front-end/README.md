# Implement custom form validation using formControlName
- formControlName object is used to define field to bind with DOM ele
# Custom validator class
export class CustomValidator {
    static emailAddressValidator(ctrl) {
        var reg = /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,4})$/;
        if (ctrl.value.match(reg)) {
            return null;
        } else {
            return {'invalidEmail': true };
        }
    }
# Component using custom validator
  ngOnInit() {
    this.form = new FormGroup({
      'empNo': new FormControl(this.emp.empNo, 
        Validators.compose([Validators.required, Validators.pattern('[0-9]+')])),
      'empName': new FormControl(this.emp.empName, 
        Validators.compose([Validators.required])),
      'salary': new FormControl(this.emp.salary, 
        Validators.compose([Validators.required, Validators.pattern('[0-9]+')])),
      'depName': new FormControl(this.emp.deptName,
        Validators.compose([Validators.required, Validators.pattern('[a-zA-Z]+')])),
      'email': new FormControl(this.emp.email,
        Validators.compose([Validators.required, CustomValidator.emailAddressValidator]))
    })
  }
# Template display error message when not validate
      <tr>
        <td>Email</td>
        <td>
          <input type="text" class="form-control"
            [(ngModel)]="emp.email"
            formControlName="email">
        </td>
        <div *ngIf="form.controls.email.dirty && !form.controls.email.valid"
          class="alert alert-danger">
          <p *ngIf="form.controls.email.errors.required">
            Email address is mandatory
          </p>
          <p *ngIf="form.controls.email.errors.invalidEmail">
            Email must be valid with all character in lower case
          </p>
        </div>
      </tr>
