//Implement a menu-driven program where the user selects a recharge plan (1: Data Plan, 2: Talktime Plan, 3: SMS Pack) and displays the price accordingly.


public class Recharge {
	public static void main (String args []) {
		
		int Recharge = 49;
		
		switch (Recharge) {
		case 49 : 
			System.out.println("Data Plan 6GB");
			break;
		case 99 :
			System.out.println("Talktime for 28Days");
			break;
		case 19 :
			System.out.println("Only For SMS");
			break;
		default: 
			System.out.println("INVALID RECHARGE......");
		}
		}

}
