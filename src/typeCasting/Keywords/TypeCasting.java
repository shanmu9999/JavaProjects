package typeCasting.Keywords;

public class TypeCasting {
	
	//Data Conversion: Converting one datatype to another datatype.
	
		//Type Casting : Converting one datatype to similar datatype.

		public static void main(String[] args) {
			
			
			byte marks = 98;
			int newMarks =marks ; // we can store based onm the values storage
			// If we want to store the value more than data size so we cannot store
			System.out.println(newMarks);// Auto casting or Widening casting.
			
			int population = 10; // we can accomdate only 1 byte memory in byte so int value should be byte value
			byte newPopulation =(byte)  population; // Narrowing casting or Explicit casting.
			System.out.println(newPopulation);
		}

}
