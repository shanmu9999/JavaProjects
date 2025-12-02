package classandObjects;

public class Inheritanceclass extends Mainclass  {

	public static void main(String[] args) {  // Heap to metaspace to access that reason we are using object
		// TODO Auto-generated method stub
		
		// Here we are creating the object for the Child class
		
		// Here we can use the Parent class also in the object along with child class
		
		Mainclass obj = new Inheritanceclass();
		
		System.out.println(obj.empanme);
		System.out.println(obj.id);

	}

}
