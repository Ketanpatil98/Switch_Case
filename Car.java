//Create a program where the user enters the number of wheels (2, 3, 4, 6) and displays the type of vehicle (Bike, Auto-Rickshaw, Car, Truck).



public class Car {
	
	public static void main (String args[]) {
		
		int wheels = 4;
		
		switch (wheels) {
		
		case 2 :
			System.out.println ("The vehicle type is two wheeler (e.g BIKE)");
			break;
		case 3 :
			System.out.println ("The vehicle type is three wheeler (e.g AUTO)");
			break;
		case 4 :
			System.out.println ("The vehicle type is four wheeler (e.g CAR)");
			break;
		case 6 :
			System.out.println ("The vehicle type is six wheeler (e.g TRUCK)");
			break;
		default :
			System.out.println ("THAT'S YOUR VEHICLE");
			
		}
	}

}
