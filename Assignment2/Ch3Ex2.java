import java.util.Random;

public class Ch3Ex2{
	public static void main(String[] args){ // plays 10,000 games of craps and returns overall odds of winning

		int wins = 0;
		int losses = 0;
		int total;
		int die1;
		int die2;
		int thePoint;
		

		for(int i = 0; i < 10000; i++){
			die1 = (int)(Math.random() * 6) + 1; // roll 6 sided die
			die2 = (int)(Math.random() * 6) + 1;
			total = die1 + die2;
			
			switch(total){ // empty cases fall through to proceeding statement, ex: a 2 is a loss and 7 is a win
				case 2:
				case 3:
					losses += 1;
					break;
				case 7:
				case 11:
					wins += 1;
					break;
				case 12:
					losses += 1;
					break;
				default: // if any other number is rolled
					thePoint = total;
					do{
						die1 = (int)(Math.random() * 6) + 1;
						die2 = (int)(Math.random() * 6) + 1;
						total = die1 + die2;
					}while(total != thePoint && total != 7);
					switch(total){
						case 7:
							losses += 1;
							break;
						default:
							wins += 1;
							break;
					}
				break;
			}
		}
		float oddsOfWinning = (wins / (float)(wins + losses)) * 100; // calculate win-loss ratio
		System.out.print("Probability of winning : ");
		System.out.printf("%.2f", oddsOfWinning); // round to 2 decimal places
		System.out.println("%");
	}
}
