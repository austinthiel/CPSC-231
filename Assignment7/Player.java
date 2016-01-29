import java.util.*;

public class Player{

	public boolean cantWin;
	public boolean hasWon;

	private ArrayList<Card> m_stack = new ArrayList<Card>();
	public ArrayList<Card> cardsInPlay =  new ArrayList<Card>();
	private Card flippedCard;
	private Card warCard;

	public Player(){
		
	}

	public Card flip(){ // flip card off top of deck
		if(m_stack.isEmpty()){
			cantWin = true;
			return null;
		}
		else{
		
			flippedCard = m_stack.get(0);
			collect(flippedCard);
			m_stack.remove(0);
			return flippedCard;
		}
	}

	public void collect(Card c){ // control cards in play
		cardsInPlay.add(c);
	}

	public boolean hasWon(){ // check if someone won
		if(this.m_stack.size() == 52){
			hasWon = true;
			return hasWon;
		}else {
			hasWon = false;
			return hasWon;
		}

	}

	public Card war(){ // duke it out
	try{
		if (this.m_stack.size() >= 4){ // if player has more than 4 cards, normal war
			this.flip();
			this.flip();
			this.flip();
			warCard = this.flip();
			return warCard;
		}
		warCard = this.flip();
		while (warCard != null){ // if less than 4, flip as many as possible
			warCard = this.flip();
		}
		return warCard;
	}catch (Exception e){
		return null;
	}

	}

	public ArrayList<Card> getStack(){
		return this.m_stack;
	}

	public void setStack(ArrayList<Card> myStack)
	{
		this.m_stack = myStack;
	}
}
