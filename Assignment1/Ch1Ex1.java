import java.text.DecimalFormat;

public class Ch1Ex1{
	public static void main(String[] args){

		DecimalFormat df = new DecimalFormat("0.00");

		double lbsToKg = 150/2.2;		
		
		System.out.println("Number of calories burned doing the following activities...");

		System.out.print("Running 6MPH for 30 minutes: ");
		double running = 0.0175 * 10 * lbsToKg * 30;
		System.out.println(df.format(running));

		System.out.print("Playing Basketball for 30 Minutes: ");
		double basketball = 0.0175 * 8 * lbsToKg * 30;
		System.out.println(df.format(basketball));

		System.out.print("Sleeping for 6 hours: ");
		double sleeping = 0.0175 * lbsToKg * 360; //MET is equal to 1, so it's not needed in the equation
		System.out.println(df.format(sleeping));

		System.out.print("Total number of calories burned: ");
		System.out.println(df.format(running + basketball + sleeping));
	}
}
