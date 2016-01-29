import java.util.*;

public class Simulation{
	
	private static int avgBattles = 0;
	private static int avgWars = 0;
	private static int avgDblWars = 0;
	private static int minWars = 999999999;
	private static int maxWars = 0;
	private static int minBattles = 999999999;
	private static int maxBattles = 0;
		
	
	public static void main(String[] args){ // take in number of games to be played from args
		String argNumGames = args[0];
		int numGames = Integer.parseInt(argNumGames);
		simulate(numGames);
			
	}
	
	public Simulation(){
		
	}

	public static void simulate(int numGames){ // tell games to begin playing, print data
		Game g = new Game();
		g.Game(numGames);
		calculate(numGames, g);	
		report();	
	}

	public static void calculate(int numGames, Game g){ // pull total game data
		int[] battles = g.getBattleArray();
		int[] wars = g.getWarArray();
		int[] doubleWars = g.getDoubleWars();
		int totalBattles = 0;
		int totalWars = 0;
		int totalDblWars = 0;
		for (int i = 0; i < numGames; i++)
		{
			totalBattles += battles[i];
			totalWars += wars[i];
			totalDblWars += doubleWars[i];
			if (wars[i] < minWars)
			{
				minWars = wars[i];
			}
			if (wars[i] > maxWars)
			{
				maxWars = wars[i];
			}
			if (battles[i] < minBattles)
			{
				minBattles = battles[i];
			}
			if (battles[i] > maxBattles)
			{
				maxBattles = battles[i];
			}

		}
		avgBattles = totalBattles/numGames;
		avgWars = totalWars/numGames;
		avgDblWars = totalDblWars/numGames;
	}

	public static void report(){ // print it neatly

		System.out.println("Avg number of battles per game: " + avgBattles + "\n" +
				"Avg number of wars per game: " + avgWars + "\n" + 
				"Avg number of double wars per game: " + avgDblWars + "\n" +
				"Max number of battles in a game: " + maxBattles + "\n" +
				"Min number of battles in a game: " + minBattles + "\n" + 
				"Max number of wars in a game: " + maxWars + "\n" +
				"Min number of wars in a game: " + minWars);
	}

}
