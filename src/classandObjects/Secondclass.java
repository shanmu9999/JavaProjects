package classandObjects;

public class Secondclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mainclass obj = new Mainclass();
		
		System.out.println(obj.empanme);
		System.out.println(obj.id);
		System.out.println(obj.grade);
		System.out.println(obj.status);
		
		// Directly calling the Static keyword without using Object
		
		System.out.println(Mainclass.age);

	}

}
