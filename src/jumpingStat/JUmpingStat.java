package jumpingStat;

public class JUmpingStat {

	//Jumping Statements: set of keywords used to jump from the current iteration to other iterations.
	
		//There are mainly three different jumping statements available:
		//1. break statement: used to terminate the current loop 
		//2. continue statement: used to skip the current iteration of a loop and transfer execution to the beginning of the next iteration of the loop.
		//3. return statement: used to exit from a method and optionally return a value to the caller.

		public static void main(String[] args) {
			
			for(int i=1; i<=10; i++) {	
				
				if(i==5) {
					// break; //break the loop and come out of the flow // so output is 1,2,3,4,5
					continue; //skip the current iteration and move to next iteration // output = 1 to 10 beacause i<=10
					// return; // it continuees in the Method
				}
				
				System.out.println(i);
			}

		}

}
