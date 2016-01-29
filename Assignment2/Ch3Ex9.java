import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch3Ex9{
	public static void main(String[] args){ // take inputs for (points out of total points) on x assignments and calculates percentage, ex: 5/10 + 4/10 = 45%

		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##%"); // convert to percentage

		System.out.print("How many exercises to input?: ");
		int toIterate = in.nextInt();
		
		int score;
		int totalScore = 0;
		int possible;
		int totalPossible = 0;
		double percentage = 0.0;
	
		for(int i = 0; i < toIterate; i++){ // iterates x times for x exercises
			System.out.print("Score received for exercise " + (i+1) + ": ");
			score = in.nextInt();
			totalScore += score;
			System.out.print("Total points possible for exercise " + (i+1) + ": ");
			possible = in.nextInt();
			totalPossible += possible;
		}
		percentage = ((double)(totalScore) / (double)(totalPossible));
		System.out.println("Your total is " + totalScore + " out of " + totalPossible + ", or " + df.format(percentage));
	}
}
