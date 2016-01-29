import java.text.DecimalFormat;

public class Ch1Ex6{
	public static void main(String[] args){

		DecimalFormat df = new DecimalFormat("0.00");
	
		int gearSize = 100;
		int cadence = 90;
		double pi = 3.14;
		double speedMPH = gearSize * pi * (1/12.0) * (1/5280.0) * cadence * 60; //added .0 to denominators of fractions so they equal floats instead of 0

		System.out.println("Speed (MPH) for a bike with Cadence 90 and Gear Size 100: " + df.format(speedMPH)); 
	
	}
}
