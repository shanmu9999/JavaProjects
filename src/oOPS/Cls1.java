package oOPS;

public class Cls1 {
	
	private int age =30;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cls1 obj = new Cls1();
		obj.setAge(35);
		System.out.println("The new age is: " + obj.getAge());
	
	}

}
