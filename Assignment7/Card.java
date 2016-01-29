import java.util.*;

public class Card{
	
	private int type, value;
	private String[] suit = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	Card(int types, int values){ // separate rank and suit
		this.type = types;
		this.value = values;
	}

	public String getRank(){ return this.rank[value]; }
	public String getSuit(){ return this.suit[type]; }
	public String toString(){ return rank[value] + " of " + suit[type]; }	
}
