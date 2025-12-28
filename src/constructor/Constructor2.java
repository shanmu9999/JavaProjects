package constructor;

public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor1 obj = new Constructor1();
		
		System.out.println("The Person blood group is:" + obj.blood);
		
			obj.printEmployeeName(101, "John Doe");
		obj.printEmployeeAddress(101, "123 Main St, Cityville");
		obj.printEmployeeSalary(101, 75000.00);
		
		// Parameter after declare
		
		Constructor1 obj2 = new Constructor1(101);//creating object of Constructor1 class (parameterized constructor)
		obj2.printEmployeeName("John Doe");
		obj2.printEmployeeAddress("123 Main St, Cityville");
		obj2.printEmployeeSalary(75000.00);	
		
		
		Constructor1 obj3 = new Constructor1(101);

	}

}
