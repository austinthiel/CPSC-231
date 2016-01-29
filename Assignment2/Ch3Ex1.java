import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch3Ex1{
	public static void main(String[] args){ // Find Square root of a number

		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Please enter a number you would like to know the square root of: ");
		double n = in.nextDouble();

		double guess = n;
		double r = 0.0;
	
		while(r != guess){
			r = n / guess;
			guess = (guess + r) / 2;
		}
		System.out.println("The square root of " + df.format(n) + " is: " + df.format(guess)); // format numbers to 2 decimal places and print
	}
}
