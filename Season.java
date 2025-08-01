//Take a season (1: Summer, 2: Winter, 3: Rainy) as input and print the appropriate advisory message (Stay Hydrated, Wear Warm Clothes, Carry an Umbrella).


public class Season {
	public static void main (String args []) {
		
		String a = "Rainy";
		
		switch (a) {
		
		case "Summer" :
			System.out.println("Stay Hydrated");
			break;
		case "Rainy" :
			System.out.println("Carry an Umbrella");
			break;
		case "Winter" :
			System.out.println("Wear a Warm Clothes");
			break;
		default :
			System.out.println("This Season is not affect to health, so don't worry guys ");


			
		}
	}

}
