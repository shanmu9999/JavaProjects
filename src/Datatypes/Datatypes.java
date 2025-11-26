package Datatypes;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Category,Data Type,Size
		 * Integers  - byte = -128 to +127, short, int, long
		 * Floting   - float,double
		 * Character - char
		 * Boolean   - boolean
		 */
		
		// 1. BOOLEAN: Stores true or false
        boolean isJavaFun = true;
        System.out.println("Boolean (isJavaFun): " + isJavaFun);
        
        // 2. BYTE: Very small integer range (-128 to 127)
        byte level = 100;
        System.out.println("Byte (level): " + level);
        
        // 3. SHORT: Small integer
        short shortDistance = 5000;
        System.out.println("Short (shortDistance): " + shortDistance);
        
        // 4. INT: Standard integer
        int populationCount = 1000000;
        System.out.println("Int (populationCount): " + populationCount);
        
        // 5. LONG: Very large integer (must end with 'L')
        long worldLightYears = 9223372036854775807L; 
        System.out.println("Long (worldLightYears): " + worldLightYears);
        
        // --- FLOATING-POINT (Decimal Numbers) ---
        // 6. FLOAT: Single-precision decimal (must end with 'f')
        float temperature = 98.6f;
        System.out.println("Float (temperature): " + temperature);
        
        // 7. DOUBLE: Double-precision decimal (default for decimals)
        double piValue = 3.1415926535;
        System.out.println("Double (piValue): " + piValue);
        
        // 8. CHAR: Single Unicode character (must use single quotes)
        char grade = 'A';
        System.out.println("Char (grade): " + grade);
        
        System.out.println();
        
        System.out.println("---Non Primitive dataypes-----------");
        
       String name = "Shanmukha sai";
       String Password = "Shanmu@1998";
       System.out.println("String name:"+name);
       System.out.println("String phone:"+Password);
	}

}
