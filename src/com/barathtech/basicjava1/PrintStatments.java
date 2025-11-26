package com.barathtech.basicjava1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatments {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		// Statment with println
		System.out.println("Hello world");
		System.out.println("-------------------------------");
		
		// Statment with only print
		System.out.print("Hello");
		System.out.print("World!");
		
		// Statment with printf
		System.out.printf(" === Hello %s your percentage is %f and id is %d and you attendence is %b","sai",71.07,1541052,true);
		System.out.println();
		
		// Statment with println
		System.out.println(" -- Next line if we use println");
		
		// Statment with printf
		System.out.printf("Hello %s your percentage is %f and id is %d and you attendence is %b","sai",71.07,1541052,true);
		System.out.println();
		
		//Statment with error 
		System.out.println("------------------");
		System.err.println("Threre is a error at line number 27");
		System.out.println("--------------------------");
		
		// All parts are "appended" together into one String before printing
		
		String name = "Alice";
		int age = 30;

		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		// Output: Hello, my name is Alice and I am 30 years old.
		
	    // print the logs
	    // the logs will include the time stamps
	   	
		System.out.println("------------------");
		Logger logger = Logger.getLogger("Barathtech");
		logger.info("the line 35 is working fine now");
		System.out.println();
		logger.warning("the line 25 still need a fix");
		
		// print and export the logs into text file
		
		PrintWriter logs = new PrintWriter("D:\\eclipse\\Workspace\\LogsPrint.txt");
		logs.println("the line 35 is  executed");
		logs.println("Program executesd successfully");
		logs.println("These is the Log export we need to do");
		logs.close();
	}

}
