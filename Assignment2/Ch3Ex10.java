import java.util.Scanner;
import java.util.*;

public class Ch3Ex10{
	public static void main(String[] args){ // plays PIG game between player and AI

		Scanner in = new Scanner(System.in);
		Random rn = new Random();

		int turnScore = 0;
		int totalScore = 0;
		int turnScoreAI = 0;
		int totalScoreAI = 0;
		int die;
		int die2;
		String input = "r";
		char repeat;

		while(totalScore < 100 || totalScoreAI < 100){ // keep looping until someone wins
			do{			
				die = rn.nextInt(6) + 1;
			
				System.out.println("You rolled: " + die);
			
				if(die == 1){ // lost turn, no points
					turnScore = 0;
					System.out.println("You lose your turn!");
					System.out.println("Your total is: " + totalScore);
					break;
				}else{
					turnScore += die;
					System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore);
					System.out.println("If you hold, you will have " + (turnScore + totalScore) + " points.");
					System.out.println("Enter 'r' to roll again, or 'h' to hold.");
					input = in.nextLine();
					repeat = input.charAt(0);

					if(repeat == 'h'){
						break;
					}
				}
			}while(input.equalsIgnoreCase("r") || die != 1);
				
				totalScore += turnScore;
				System.out.println("Your score is " + totalScore);
				turnScore = 0;

			if(totalScore >= 100){ // player wins toString
				System.out.println("Your total Score is " + totalScore);
				System.out.println();
				System.out.println("You win!");
				break;
			}
		
		System.out.println();
		System.out.println("It is the computer's turn.");
		
		// AI GAMEPLAY
		
		do{
			die2 = rn.nextInt(6) + 1;
			System.out.println("The computer rolled: " + die2);

			if(die2 == 1){ // lost turn, no points
				turnScoreAI = 0;
				System.out.print("The computer lost it's turn!");
				System.out.println("Computer's total is: " + totalScoreAI);
				break;
			}else{
				turnScoreAI += die2;
				if((turnScoreAI >= 20) || (totalScoreAI + turnScoreAI >= 100)){ // if AI's turnScore is 20 or AI has won, hold
					System.out.println("The computer holds.");
					break;
				}
			} 
		}while(die2 != 1 || turnScoreAI < 20);
		
		totalScoreAI += turnScoreAI;
		System.out.println("The computer's score is " + totalScoreAI + "\n");
		turnScoreAI = 0;

		if(totalScoreAI >= 100){ // computer wins toString
			System.out.println();
			System.out.println("The computer wins!");
			break;
		}
		}
	}
}
