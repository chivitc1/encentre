export class CustomValidator {
    static emailAddressValidator(ctrl) {
        var reg = /^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,4})$/;
        if (ctrl.value.match(reg)) {
            return null;
        } else {
            return {'invalidEmail': true };
        }
    }
}