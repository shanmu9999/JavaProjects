package exceptionHandling;

public class ThrowAnCustomException {

	public static void main(String[] args) throws Exception { // we need to fail the program on my own
		int age =17;

		if (age < 18) {
			throw new Exception("Not Eligible to Vote"); // thow new exceptions is used to fail the program
		} else {
			System.out.println("Eligible to Vote"); // if we give grater than 18 then the Syso will be printed
		}

		System.out.println("Execution Completed");

	}
	

}
