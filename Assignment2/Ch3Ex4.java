import java.util.Scanner;

public class Ch3Ex4{
	public static void main(String[] args){ // computes cost of an item after a given amount of years and given rate of inflation

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the cost of the item (ex 34.99): ");
		double originalCost = in.nextDouble();

		double totalCost = originalCost; // the total cost is the original cost after 0 years of inflation
		System.out.print("How many years from now will the item be purchased?: ");
		int yearsUntilPurchase = in.nextInt();

		System.out.print("Enter the rate of inflation (ex for 35%, enter 35): ");
		double rateOfInflation = in.nextDouble();

		double convertedPercentage = rateOfInflation / 100.0;

		for(int i = 0; i < yearsUntilPurchase; i++){ // adds inflation per year to the original cost of the item
			totalCost += (totalCost * convertedPercentage);
		}

		System.out.println("The total cost of a " + originalCost + " item in " + yearsUntilPurchase + " years is: " + totalCost); 
	}
}
