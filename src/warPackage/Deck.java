package warPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {

   public ArrayList <Card> cards;
//deck method
    public Deck() {
        cards = new ArrayList<Card>();
//lists all cards types
        String[] suitType = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] cardNum = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
//loops through each card, adds value to cards arraylist
        for (int j = 0; j < suitType.length; j++) {
        for (int i = 2; i < cardNum.length + 2; i++) {
            String suits = cardNum[i-2] + " of " + suitType[j];
            cards.add(new Card(suits, i));
            }
        }
    }
//shuffles class by sorting
    public void shuffle() {
        Collections.shuffle(cards);
    }
//removes and returns top card
    public Card draw() {
        return cards.remove(0);
    }
}