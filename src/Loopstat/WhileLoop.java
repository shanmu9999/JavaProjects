package Loopstat;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		// While Loop
		while(i>0) {
			
			System.out.println("Refresh the page");
			break;
		}
		
	System.out.println("-----------------------------------");
		// Do while Loop
		do {
			System.out.println("refresh the page"); // here first syso begins after condition
			i++;
		}while(i<0);

	}

}
