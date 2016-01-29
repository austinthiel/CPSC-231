public class Ch1Ex4{
	public static void main(String[] args){

		//aside from sweetenerInSoda, these numbers are arbitrary
		double toKillMouse = 0.005;
		double mouseWeight = 0.5;
		int dieterStartingWeight = 100;
		int dieterEndingWeight = 75;
		double sweetenerInSoda = 0.001;

		double proportionalWeight = dieterEndingWeight / mouseWeight;
		double sweetToKillDieter = toKillMouse * proportionalWeight;
		double sodaToKillDieter = sweetToKillDieter / sweetenerInSoda;

		System.out.println("Dieter's starting weight: " + dieterStartingWeight + "kg");
		System.out.println("Dieter's ending weight: " + dieterEndingWeight + "kg");
		System.out.println("The amount of soda required to kill the dieter: " + sodaToKillDieter + " cans.");

	}
}
