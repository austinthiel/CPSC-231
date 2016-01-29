import java.util.Scanner;

public class Ch3Ex3{
	public static void main(String[] args){ // determines height of child based on child's gender and heights of parents

			Scanner in = new Scanner(System.in);
			String genderChild;
			int motherHeightTotalInches;
			int fatherHeightTotalInches;
			int motherHeightFeet;
			int motherHeightInches;
			int fatherHeightFeet;
			int fatherHeightInches;
			int childHeight;
			int childHeightFeet;
			int childHeightInches;
			String exitOrEnter = "full";

		while(true){ 
			System.out.print("Are you a male or female? Type M/F: ");
			genderChild = in.nextLine();
	
			System.out.print("How tall is your mother? (Feet): ");
			motherHeightFeet = in.nextInt();
			System.out.print("How tall is your mother? (Inches): " );
			motherHeightInches = in.nextInt();
			motherHeightTotalInches = (motherHeightFeet * 12) + motherHeightInches;
	
			System.out.print("How tall is your father? (Feet): ");
			fatherHeightFeet = in.nextInt();
			System.out.print("How tall is your father? (Inches): " );
			fatherHeightInches = in.nextInt();
			fatherHeightTotalInches = (fatherHeightFeet * 12) + fatherHeightInches;


			if(genderChild.equals("M")){
				childHeight = ((motherHeightTotalInches * 13/12) + fatherHeightTotalInches)/2;
			}else if(genderChild.equals("F")){
				childHeight = ((fatherHeightTotalInches * 12/13) + motherHeightTotalInches)/2;
			}else{
				System.out.println("You entered something incorrectly. Please try again.");
				in.nextLine(); // consumes end of line from nextInt() command
				continue;
			}
	
			childHeightFeet = childHeight / 12;
			childHeightInches = childHeight % 12;
			System.out.println("Your predicted height is : " + childHeightFeet + " feet " + childHeightInches + " inches.");
	
			in.nextLine(); // consumes end of line from nextInt() command

			while(true){ // asks user if they want to run again or terminate
				System.out.print("Press enter to continue or type 'exit' to quit: ");
				exitOrEnter = in.nextLine();
				if(exitOrEnter.equals("exit")){
					System.exit(0);
				}else if (exitOrEnter.equals("")){
					break;
				}else{
					continue;
				}
			}
		}
	}
}	
