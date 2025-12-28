package exceptionHandling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] empNames = new String[3]; // This can hold 3 employee names.
		
		try {   // we hve the try, CAtch and Finally which nned to write
			empNames[0] = "Bharath";
			empNames[1] = "ABC";
			empNames[2] = "Bharath";
			empNames[3] = "Shanmukh";
		} 
		catch (Exception e) 
		{
			System.out.println("Array Index is Exceeded. Please provide the valid index.");			
		} 
		finally // It was an optional thing need to write
		{ // finally block will be executed always, irrespective of exception occurred or not.
			System.out.println("Execution Completed Successfully.");
		}

	}

}
