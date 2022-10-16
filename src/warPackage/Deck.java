package warPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {

   public ArrayList <Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();

        String[] suitType = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] cardNum = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        for (int j = 0; j < suitType.length; j++) {
        for (int i = 2; i < cardNum.length + 2; i++) {
            String suits = cardNum[i-2] + " of " + suitType[j];
            cards.add(new Card(suits, i));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}