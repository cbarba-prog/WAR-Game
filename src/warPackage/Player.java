package warPackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	String name;
	int score;

	public Player(String name) {
		
        this.score = 0;
        this.name = name;
	}
	
	 public void describe() {
	        System.out.println(name + "'s hand:");
	        for (int i = 0; i < hand.size(); i++) {
	            hand.get(i).describe();
	        }
	    }
	
	public Card flip() {
        return hand.remove(0);
    }
	
	public void draw(Deck deck) {
        hand.add(deck.draw());
    }
	public void incrementScore() {
        score++;
    }
  
}
