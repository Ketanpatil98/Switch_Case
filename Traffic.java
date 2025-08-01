//Write a program that takes a color (Red, Yellow, Green) as input and prints the corresponding action (Stop, Slow Down, Go).


public class Traffic {
	public static void main (String args[]) {
		
		String  signal = "Yellow";
		
		switch (signal) {
		
		case "red": 
			System.out.println ("Stop the  Vehicles ");
		break;
		case "Yellow" :
			System.out.println ("Start the Vehicles");
		break;
		case "Green" :
			System.out.println ("Now Vehicles can Go");
		break;
		default:
			System.out.println ("Invalid Signal");
		}
	}

}
