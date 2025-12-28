package constructor;

public class Constructor1 {
	
	String blood = "o+ve";
	
	// default constructor
	
	Constructor1(){
		
	}
	int empId=0;	

	
	// Parameterized Constructor
	Constructor1(int id) {
		empId = id;
	}	
	

	//Before parameterized constructor
	void printEmployeeName(int empid, String empname) {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + empname);
	}
	
	void printEmployeeAddress(int empid, String empaddress) {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Address: " + empaddress);
	}
	
	void printEmployeeSalary(int empid, double empsalary) {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Salary: " + empsalary);
	}
	
	// empid is using everyhere in the above parameter so created at top and removed empid at down

	//After parameterized constructor
	void printEmployeeName(String empname) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empname);
	}
	
	void printEmployeeAddress(String empaddress) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Address: " + empaddress);
	}
	
	void printEmployeeSalary(double empsalary) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Salary: " + empsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
