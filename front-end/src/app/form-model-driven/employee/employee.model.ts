export class Employee {
	constructor(
		public empNo: string, 
		public empName: string, 
		public salary: number, 
		public deptName: string, 
		public designation: string, 
		public email: string) { }
}

// export class Employee {
//     private _empNo: string;
//     private _empName: string;
//     private _salary: number;
//     private _deptName: string;
// 	private _designation: string;
// 	private _email: string;


// 	constructor(empNo: string, empName: string, 
// 		salary: number, deptName: string, 
// 		designation: string, email: string) {
// 		this._empNo = empNo;
// 		this._empName = empName;
// 		this._salary = salary;
// 		this._deptName = deptName;
// 		this._designation = designation;
// 		this._email = email;
// 	}
    

// 	public get empNo(): string {
// 		return this._empNo;
// 	}

// 	public set empNo(value: string) {
// 		this._empNo = value;
// 	}
    

// 	public get empName(): string {
// 		return this._empName;
// 	}

// 	public set empName(value: string) {
// 		this._empName = value;
// 	}
    

// 	public get salary(): number {
// 		return this._salary;
// 	}

// 	public set salary(value: number) {
// 		this._salary = value;
// 	}

// 	public get deptName(): string {
// 		return this._deptName;
// 	}

// 	public set deptName(value: string) {
// 		this._deptName = value;
// 	}

// 	public get designation(): string {
// 		return this._designation;
// 	}

// 	public set designation(value: string) {
// 		this._designation = value;
// 	}
	
// 	public get email(): string {
// 		return this._email;
// 	}

// 	public set email(value: string) {
// 		this._email = value;
// 	}
    
// }
