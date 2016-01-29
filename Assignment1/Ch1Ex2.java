public class Ch1Ex2{
	public static void main(String[] args){

		int couponsWon = 2143843;
		int getCandyBars = couponsWon/10;
		int getGumballs = (couponsWon % 10) / 3;
	
		System.out.println("Number of tickets won : " + couponsWon);
		System.out.println("Number of candy bars gotten : " + getCandyBars);
		System.out.println("Number of gumballs gotten : " + getGumballs);
	
	}
}
