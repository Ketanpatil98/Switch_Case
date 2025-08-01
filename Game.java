//Implement a game system where a user selects a difficulty level (1: Easy, 2: Medium, 3: Hard) and prints a message accordingly.



public class Game {
	public static void main(String args []) {
		
		int game_level = 4;
		 switch (game_level) {
		 
		 case 1 :
			 System.out.println ("Game is easy ");
			 break;
		 case 2 : 
			 System.out.println ("Game is medium");
			 break;
		 case 3 : 
			 System.out.println ("Game is Hard ");
			 break ;
			default :
				System.out.println("No level available");
		 }
		
	}

}
