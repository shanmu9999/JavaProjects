package variables;

public class Variables {
	
	// 1. Local variable
	//2. Instance variable or class level variable
	//3. Static variable
	//4. Parameter variable are arguments
	
	// Local and parameter variable are almost same
	
  String name2 = "Java";
  
  static String name3 = "Python";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Local variable - A variable to create inside the block
//Insatnce variable - A varibale that stores data inside class and outside methods
// Static varible : A work with static that stores inside class and outside method
// Parameter variable - Which is store inside parathesis same as local variable
		
		// local variable
		
		String name = "Selenium";
		System.out.println(name);
		
		// Instance variable and first create the object
		
		Variables obj = new Variables();
		System.out.println(obj.name2);
		
		// Static variable
		System.out.println(name3);
		
		
		 

	}
		
	

}
