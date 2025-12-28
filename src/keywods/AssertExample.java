package keywods;

public class AssertExample {

	//assert : assert is a keyword we are going to use to implement assertions in Java.
		//Assertions will be used to compare the expected result versus the actual result, basically.

		public static void main(String[] args) {
			
			// Rin ther program by -ea so the program will be failed at line number 154 itself
			
			int age = 17; // Actual value
			
			assert age >= 18 : "Age is not valid to vote"; // expected value her it is not matching so error printed

			System.out.println("You are eligible to vote.");

		}

}
