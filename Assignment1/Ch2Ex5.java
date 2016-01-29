import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch2Ex5{
	public static void main(String[] args){

		DecimalFormat df = new DecimalFormat("0.00");
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Purchase Price: ");
		double purchasePrice = keyboard.nextDouble();

		System.out.print("Salvage Price: ");
		double salvagePrice = keyboard.nextDouble();

		System.out.print("Number of years item was used: ");
		double yearsUsed = keyboard.nextDouble();

		double depreciation = (purchasePrice - salvagePrice) / yearsUsed;
		System.out.println("The yearly depreciation of the item is: $"+ df.format(depreciation) + " per year");

	}
}
