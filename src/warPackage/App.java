package warPackage;

public class App {
	
	public static void main(String[] args) {
				//set player names
		 	Player player1 = new Player("Luke");
	        Player player2 = new Player("Chewie");
	        //sets a new deck and shuffle
	        Deck deck = new Deck();
			deck.shuffle();
			
			System.out.println("Let's play a game of WAR!\n");			
//loops through all 52 cards
			 for(int i = 0; i < 52; i++) {
			      if(i % 2 == 0) {
		                player1.draw(deck);
		            } else {
		                player2.draw(deck);
			      }
			    }
			
			System.out.println("Player 1: " + player1.name + " v. " + "Player 2: " + player2.name);
			//loops 26 cards for each player
			for(int i = 0; i < 26;i++) {
				
				
				//sets a new card per round
				Card player1Card = player1.flip();
				Card player2Card = player2.flip();
			
				//describes which card is being played for each player
				System.out.println("======================================");
				System.out.println("ROUND " + (i + 1));
				player1.describe();
				System.out.println(player1Card.describe());
				System.out.println("");
				player2.describe();
				System.out.println(player2Card.describe());
				
				//increments player score based on card value
				if(player1Card.getValue() > player2Card.getValue()) {
					System.out.println("\nPlayer 1 Scores!");
					player1.incrementScore();
					
				} else if(player2Card.getValue() > player1Card.getValue()) {
					System.out.println("\nPlayer 2 Scores!");
					player2.incrementScore();
					
				} else {
					System.out.println("\nDRAW !");
					player1.incrementScore();
					player2.incrementScore();
					}
				//keeps track of each round score
				System.out.println("\nPlayer 1 score: " + player1.score);
				System.out.println("Player 2 score: " + player2.score);
			}
			
			//displays final score and which player wins, or draws
			System.out.println("======================================");
			System.out.println("Final Score:\n" + player1.name + ": " + player1.score + " - "+ player2.name +": "+ player2.score);
			if(player1.score > player2.score) {
				System.out.println("\nWinner! " + player1.name);
			} else if(player1.score < player2.score) {
				System.out.println("\nWinner! " + player2.name);
			} else {
				System.out.println("\nDraw!");
			}
	}
}
		
		
		
	
