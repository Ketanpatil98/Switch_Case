//Take the class type (1: General, 2: Sleeper, 3: AC) as input and print the fare details for each class.



public class Seattype {
	public static void main (String args[]) {
		
		int type = 1;
		
		switch(type) {
		
		case 1 : 
			System.out.println ("YOU BOOKED GENERALSLEEPER TICKET");
			break;
		case 2 : 
			System.out.println ("YOU BOOKED SLEEPER TICKET");
			break;
		case 3 : 
			System.out.println ("YOU BOOKED AC TICKET");
			break;
		default : 
				System.out.println (" seat not available ");
		}
			
		
		
	}

}
