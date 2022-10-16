package warPackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	String name;
	int score;
//adds values of each data type
	public Player(String name) {
		
        this.score = 0;
        this.name = name;
	}
	//Used to turn describe class, details of card
	 public void describe() {
	        System.out.println(name + "'s hand:");
	        for (int i = 0; i < hand.size(); i++) {
	            hand.get(i).describe();
	        }
	    }
	//returns first card in deck
	public Card flip() {
        return hand.remove(0);
    }
	//draws card from deck used in arraylist hand
	public void draw(Deck deck) {
        hand.add(deck.draw());
    }
	//keeps track of score for each player
	public void incrementScore() {
        score++;
    }
  
}
