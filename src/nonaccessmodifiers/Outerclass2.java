package nonaccessmodifiers;

public class Outerclass2 {

public static void main(String[] args) {
		
	Outterclass outer = new Outterclass(); 
		// Outterclass.InnerClass innerClass = outer.new InnerClass();
		Outterclass.InnerClass innerClass =  new Outterclass().new InnerClass();
		System.out.println(innerClass.value);
		
		//create an instance of StaticInnerClass (if static class)
		Outterclass.StaticInnerClass staticInnerClass = new Outterclass.StaticInnerClass();
		System.out.println(staticInnerClass.value);

	}

}
