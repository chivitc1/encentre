# Demo use service in component
- Declare @Injectable() in service class
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

- Declare service in component provider or module provider, and inject service in component constructor args

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
