package accessmodifiers1;

// here are also we need ton change the public and default and private and protected

public class Accessmodifiers1 {

	// Modifiers which are used to control the java elements.

	/*
	 * Modifier Visibility Accessible From... Primary Use public = Anywhere with in
	 * the project protected = access within the Same package and in subclass (even
	 * in different package). Default (No keyword)= within the same package Only
	 * private Class = Only within the class where it is defined.
	 */
	// public : anywhere in project
	// Protected: used withih the same package but with extends we can use outpackage too
	// default : no keyword within same package (No other options)
	// private : only in the parent class

	public String name = "sai";

	public void printEmpID() {
		// TODO Auto-generated method stub
		System.out.println("Employee id is 12345");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accessmodifiers1 am = new Accessmodifiers1();
		System.out.println("Access modifier:" + am.name);
		am.printEmpID();

	}

}
