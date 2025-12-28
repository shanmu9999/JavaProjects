package Loopstat;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print the name 5 times
		
		// Post increment		
				for (int i=1;i<=5;i++) {
					System.out.println("Sai");
				}
		// Post increment and Pre Increment both are some there is no difference		
				
		System.out.println("------Pre Increment------");
				for (int i=1;i<=5;++i) {
					System.out.println("Sai Shanmukha");
				}
			System.out.println("-----------------------------------");	
			
			// For Loop with the Array
				String[] name = new String[3];
				name[0]="sai";
				name[1]="sai1";
				name[2]="sai2";
				
				// For loop for the array
				
				for(int i=0;i<name.length;i++) {
					System.out.println(name[i]);
				}
		 System.out.println("----------For Each Loop ------------");
				
				// For each loop
				 for(String nameperson : name) {
					 System.out.println(nameperson);
				 }
				
				
				
				

	}

}
