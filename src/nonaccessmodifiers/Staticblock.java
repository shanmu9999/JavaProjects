package nonaccessmodifiers;

public class Staticblock {

	//static block: a block of code which is executed when the class is loaded in the memory
	
		static {
			System.out.println("I'm a static method. I'll execute always at the beginning.");		
		}
		
		int i = 10;

		public static void main(String[] args) {
			Staticblock obj = new Staticblock();
			System.out.println("Value of i: " + obj.i);
		
		}

}
