package oOPS;

public class PolyClass2 extends PolyClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here method overriding is we are using the same method and same arguments not changed anything
		PolyClass1 obj = new PolyClass1();
		obj.add(10, 20); // Calls the overridden method in PolyClass2
	}

}
