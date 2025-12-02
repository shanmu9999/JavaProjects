package Datatypes;

public class Arrayies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// i started the one company with 3 employess
		
		String [] empname = {"sai","madhu","Sathya"};
		System.out.println(empname[0]);
		System.out.println(empname[1]);
		System.out.println(empname[2]);
		
		// i want to give id to them with memory allocation first
		
		int[] empid = new int[3];
		System.out.println(empid[0]=100);
		System.out.println(empid[1]=101);
		System.out.println(empid[2]=102);
		
		// if i have 2 companies with 6 emplyees set of 3 in 1 organisation // 2D Array
		
		String [][] empname2 = {{"sam","ram","kam"},{"bam","ham","pm"}};
		System.out.println(empname2[0][0]);
		System.out.println(empname2[1][0]);
		
		int[][] empid2 = new int [2][3];
		System.out.println(empid2[0][0]=200);
		System.out.println(empid2[0][1]=300);
		System.out.println(empid2[0][2]=300);
		System.out.println(empid2[1][0]=400);
		System.out.println(empid2[1][1]=500);
		System.out.println(empid2[1][2]=600);
		
		// if i have  3 Projects  with 9 Employees set of 3 with one organisation // 3D Array
		// all together One Organisdations - 0
		// 012 (Three square barckets malli 012 (daata)
		
		String[][][] empname3 = {{{"qw","qe","qr"},{"as","ad","af"},{"zx","zc","zv"}}};
		System.out.println(empname3[0][1][1]);
		System.out.println(empname3[0][0][2]);
		System.out.println(empname3[0][2][1]);
		

       //Two organizations. In each organization, three projects. In each project, four employees

       // Organisation 1 (0)
       // (0) //Project 1: John(0), Smith(1), David(2), Peter(3)
       // (1) //Project 2:Linda, Alice, Bob, Charlie
       // (2) //Project 3: Tom, Jerry, Harry, Ron

       // Organisation 2 (1)
       // (0) //Project 1: Sam(0), Max(1), Leo(2), Jack(3)
       // (1) //Project 2: Mia, Zoe, Ava, Eva
       // (2) //Project 3: Kim, Lee, Jay, Kay

	   // 2 organisations 3 projects 4 employess
		
		String [][][] empid3 = new String [2][3][4];
		System.out.println(empid3[0][1][2] = "Bob");
		System.out.println(empid3[1][2][0] = "Kim");
		
	}

}
