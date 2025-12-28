package exceptionHandling;

public class ThrowsDeclaration {

	public static void main(String[] args) throws InterruptedException{ // we need to get the Interreputedexception
		System.out.println("Shanmukh");
		Thread.sleep(2000); // after 2 sec i want to print bharath
		System.out.println("Bharath");
		Thread.sleep(3000); // after 3 sec i want print the Sundar
		System.out.println("Sundar");
	}

}
