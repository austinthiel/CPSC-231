import java.util.*;

public class Game{

	Deck myDeck = new Deck();
	Player p1 = new Player();
	Player p2 = new Player();
	ArrayList<Card> pile = new ArrayList<Card>();
	private int card1;
	private int card2;
	private int parsedCard;
	private int battles = 0;
	private int wars = 0;
	private int avgBattles = 0;
	private int avgWars = 0;
	private int avgDoubleWars = 0;
	private int doubleWars = 0;
	private int[] battleArray;
	private int[] warArray;
	private int[] dblWarArray;

	public void Game(int numGames){ // play x amount of games
		battleArray = new int[numGames];
		warArray = new int[numGames];
		dblWarArray = new int[numGames];
		for(int i = 0; i < numGames; i++){
			myDeck = new Deck();
			p1 = new Player();
			p2 = new Player();
			pile = new ArrayList<Card>();
			myDeck.shuffle();
			p1.setStack(myDeck.setP1Stack());
			p2.setStack(myDeck.setP2Stack());
			play();
			battleArray[i] = this.battles;
			warArray[i] = this.wars;
			dblWarArray[i] = this.doubleWars;
			this.battles = 0;
			this.wars = 0;
			this.doubleWars = 0;
		}
	}

	public void play(){ // start flipping and comparing cards
		while (p1.hasWon() == false && p2.hasWon() == false && p1.cantWin == false && p2.cantWin == false){
			compare(p1.flip(), p2.flip());
	
		}
	}

	public void compare(Card p1c, Card p2c){ // battle, compares 2 cards
		battles++;
		try{
		card1 = parseCard(p1c.getRank());
		card2 = parseCard(p2c.getRank());
		}catch(NullPointerException e){
			if(p1.cantWin == true || p2.cantWin == true){
				return;
			} 
		}
		if(card1 > card2){
			pileToP1();
		}else if(card1 < card2){
			pileToP2();
		}else{
			wars++;
			goToWar();
		}
	}

	public void pileToP1(){ // player 1 wins the battle/war
		p1.cardsInPlay.addAll(p2.cardsInPlay);
		Collections.shuffle(p1.cardsInPlay);
		p1.getStack().addAll(p1.cardsInPlay);
		p1.cardsInPlay.clear();
		p2.cardsInPlay.clear();
	}

	public void pileToP2(){ // player 2 wins the battle/war
		p2.cardsInPlay.addAll(p1.cardsInPlay);
		Collections.shuffle(p2.cardsInPlay);
		p2.getStack().addAll(p2.cardsInPlay);
		p1.cardsInPlay.clear();
		p2.cardsInPlay.clear();
	}

	public void goToWar(){ // calls war function, checks for double wars
		try{
			card1 = parseCard(p1.war().getRank());
			card2 = parseCard(p2.war().getRank());
		}catch(NullPointerException e){
			if(p1.cantWin == true || p2.cantWin == true){
				return;
			} 
		}
			if (card1 == card2){
				doubleWars++;
				goToWar();
			}else{
				compare(p1.war(),p2.war());
			}
	}

	public int parseCard(String strCardValue){ // parse card object for value
		switch(strCardValue){
			case "1": 
				parsedCard = 1;
				break;
			case "2": 
				parsedCard = 2;
				break;
			case "3": 
				parsedCard = 3;
				break;
			case "4": 
				parsedCard = 4;
				break;
			case "5": 
				parsedCard = 5;
				break;
			case "6": 
				parsedCard = 6;
				break;
			case "7": 
				parsedCard = 7;
				break;
			case "8": 
				parsedCard = 8;
				break;
			case "9": 
				parsedCard = 9;
				break;
			case "10": 
				parsedCard = 10;
				break;
			case "Jack":
				parsedCard = 11;
				break;
			case "Queen":
				parsedCard = 12;
				break;
			case "King":
				parsedCard = 13;
				break;
			case "Ace":
				parsedCard = 14;
				break;
		}
		return parsedCard;
	}

	public int getAvgBattles(){
		return this.avgBattles;
	}
	public int getAvgWars(){
		return this.avgWars;
	}
	public int getAvgDoubleWars(){
		return this.avgDoubleWars;
	}
	public int[] getBattleArray(){
		return this.battleArray;
	}
	public int[] getWarArray(){
		return this.warArray;
	}
	public int[] getDoubleWars(){
		return this.dblWarArray;
	}
}
