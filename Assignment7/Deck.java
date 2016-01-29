import java.util.*;

public class Deck{

	private final ArrayList<Card> deck = new ArrayList<Card>();
	public static ArrayList<Card> p1Stack = new ArrayList<Card>();
	public static ArrayList<Card> p2Stack = new ArrayList<Card>();

	public Deck(){ // creates a deck of 52 unique cards
		for(int a = 0; a <= 3; a++){
			for(int b = 0; b <= 12; b++){
				deck.add(new Card(a, b));
			}
		}
	}

	public void shuffle(){ // shuffle the deck
		Collections.shuffle(deck);
	}

	public ArrayList<Card> setP1Stack(){ // deal to p1
		for(int i = 0; i < 26; i++){
			p1Stack.add(deck.get(i));
		}
		return p1Stack;
	}

	public ArrayList<Card> setP2Stack(){ // deal to p2
		for(int i = 26; i < 52; i++){
			p2Stack.add(deck.get(i));
		}
		return p2Stack;
	}
}
