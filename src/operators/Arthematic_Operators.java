package operators;

public class Arthematic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables for demonstration
        int a = 10;
        int b = 3;
        boolean x = true;
        boolean y = false;
        
        // --- 1. ARITHMETIC OPERATORS ---
        System.out.println("--- 1. Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b (Integer Division) = " + (a / b)); // Division
        System.out.println("a % b (Remainder) = " + (a % b)); // Modulo
        
        // --- 2. UNARY OPERATORS ---
        System.out.println("\n--- 2. Unary Operators ---");
        int c = 5;
        System.out.println("Original c: " + c); // 5
        System.out.println("c++ (Post-increment): " + (c++)); // Prints 5, then c becomes 6
        System.out.println("c after c++: " + c); // 6
        System.out.println("++c (Pre-increment): " + (++c)); // c becomes 7, then prints 7
        System.out.println("!x (Logical NOT): " + (!x)); // false
        
        // --- 3. ASSIGNMENT OPERATORS ---
        System.out.println("\n--- 3. Assignment Operators ---");
        int d = a; // Simple assignment (=)
        System.out.println("d = a is now: " + d); // 10
        d += 5; // Compound assignment (d = d + 5)
        System.out.println("d += 5 is now: " + d); // 15
        d *= 2; // d = d * 2
        System.out.println("d *= 2 is now: " + d); // 30
        
        // --- 4. RELATIONAL (COMPARISON) OPERATORS ---
        System.out.println("\n--- 4. Relational Operators ---");
        System.out.println("a == b (Equal to): " + (a == b)); // false (10 != 3)
        System.out.println("a != b (Not equal to): " + (a != b)); // true
        System.out.println("a > b (Greater than): " + (a > b)); // true
        System.out.println("a <= b (Less than or equal to): " + (a <= b)); // false
        
        // --- 5. LOGICAL OPERATORS ---
        System.out.println("\n--- 5. Logical Operators ---");
        // x is true, y is false
        System.out.println("x && y (Logical AND): " + (x && y)); // false (true AND false)
        System.out.println("x || y (Logical OR): " + (x || y)); // true (true OR false)
        
        // --- 6. CONDITIONAL (TERNARY) OPERATOR ---
        System.out.println("\n--- 6. Conditional (Ternary) Operator ---");
        String result = (a > b) ? "A is greater" : "B is greater";
        System.out.println("Ternary result: " + result); // A is greater
	}

}
