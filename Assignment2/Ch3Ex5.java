public class Ch3Ex5{
	public static void main(String[] args){ // compute cost and how long it will take to pay off a $1000 debt at 1.5% interest with $50/month

		double costOfStereo = 1000.00;
		double monthlyPayment = 50.00;
		double monthlyInterest = 0.015; // 1.5% converted
		double totalInterestCost = 0.0;
		double interestCost = 0.0;
		int months = 0;
		double toPayDebt;

		while(costOfStereo >= 0){ // pays interest with the $50, and pays a portion of the debt with the remaining cash until it is paid off completely
			interestCost = costOfStereo * monthlyInterest;
			toPayDebt = monthlyPayment - interestCost;
			totalInterestCost += interestCost;
			costOfStereo -= toPayDebt;
			months++; // track the amount of months needed to pay off the debt
		}
		System.out.println("Months to clear debt: " + months);
		System.out.println("Total amount of interest paid: " + totalInterestCost);
	}
}
