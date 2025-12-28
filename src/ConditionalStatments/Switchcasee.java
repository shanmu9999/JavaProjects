package ConditionalStatments;

public class Switchcasee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Select school dress based on day
		// MOnday to friday it was regualr dress
		// on saturday it was white dress
		// on sunday it was civil dress
		
		String day ="Friday";
		
		switch (day) {
		case "monday":
			System.out.println("Regualr dress");
			break;
		case "tuesday":
			System.out.println("Regualr dress");
			break;
		case "Wednesday":
			System.out.println("Regualr dress");
			break;
		case "Thursday":
			System.out.println("Regualr dress");
			break;
		case "Friday":
			System.out.println("Regualr dress");
			break;
		case"Saturday":
			System.out.println("White dress");
			break;
		case"Sunday":
			System.out.println("Civil dress");
			break;
			default:
				System.out.println("School holiday");
			
		}
	}

}
