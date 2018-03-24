# Form validation

# Turn off HTML5 validation
<form novalidate>

## Using HTML form attributes
- required
- pattern (regex)
- minlength
- maxlenth

## Using ngModel for databinding

## Using angular CSS classes to validate
- ng-valid: true when control value is valid
- ng-invalid: true when control value is invalid
- ng-dirty: true when control value is changed
- ng-pristine: true when control value is unchanged
## Validation error message display
<div *ngIf="form.controls.empNo.dirty && !form.controls.empNo.valid"
    class="alert alert-danger">
    <p *ngIf="form.controls.empNo.errors.required">
    Employee number is mandatory
    </p>
    <p *ngIf="form.controls.empNo.errors.pattern">
    Employee number must be numeric
    </p>
</div>

## Disable input submit button when validation error
<input type="submit"
            value="Submit" class="btn btn-success"
            [disabled]="!form.valid">
