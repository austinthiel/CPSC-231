import java.lang.Math.*;

public class Ch3Ex11{
	public static void main(String[] args){ // Give 3 prizes away to 3 people (30 to choose from), nobody can win more than once
	
		double winner1 = Math.random(); // grab first winner
		winner1 = (int)((winner1 * 30) + 1);
		
		double winner2 = Math.random();
		winner2 = (int)((winner2 * 30) + 1);
		while(winner2 == winner1){ // grab second winner and check for duplicates
			winner2 = Math.random();
			winner2 = (int)((winner2 * 30) + 1);		
		}

		double winner3 = Math.random();
		winner3 = (int)((winner3 * 30) + 1);
		while(winner3 == winner2 || winner3 == winner1){ // grab third winner and check for duplicates
			winner3 = Math.random();
			winner3 = (int)((winner3 * 30) + 1);
		}

		System.out.println("The first prize goes to: Finalist " + (int)winner1);
		System.out.println("The second prize goes to: Finalist " + (int)winner2);
		System.out.println("The third prize goes to: Finalist " + (int)winner3);

	}
}
