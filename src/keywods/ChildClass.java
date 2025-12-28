package keywods;

public class ChildClass extends ParentClass {
	
int marks = 95;//child
	
	public void printMarks(int marks) {//method local
		System.out.println("Marks: " + marks);
//		System.out.println("Marks: " + new ChildClass().marks);  // get back 95 marks
//		System.out.println("Marks: " + new ParentClass().marks); // get back the parent 90 marks
		System.out.println("Marks: " + this.marks); // Current class object
		System.out.println("Marks: " + super.marks); // Parent class object
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.printMarks(100);  
	}

}
