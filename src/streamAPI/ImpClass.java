package streamAPI;

public class ImpClass implements Interface1 {

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sum: " + (a + b));

	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multiply: " + (a * b));

	}

}
