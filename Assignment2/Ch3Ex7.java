import java.util.Scanner;
import java.lang.Math;

public class Ch3Ex7{
	public static void main(String[] args){ // calculate e^x to different levels of accuracy using x^n/n!
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter an integer: ");
			int x = in.nextInt();
		
			in.nextLine(); // cut to next line

			double factorial = 1.0;
	
			double total10 = 1.0;
			for(int i = 1; i < 11; i++){
				factorial *= i;
				total10 += (Math.pow((double)x, (double)i))/factorial;
				System.out.println("e^" + x + " using factorial " + i + ": " + total10); // prints results for factorials 1 through 10
			}
	
			factorial = 1.0; // reset for next calculation 		
		
			double total50 = 1.0;
			for(int i = 1; i < 51; i++){
				factorial *= i; 
				total50 += (Math.pow((double)x, (double)i))/factorial;		
			}
			System.out.println("e^" + x + " using factorial 50: " + total50);
	
			factorial = 1.0; // reset for next calculation
	
			double total100 = 1.0;	
			for(int i = 1; i < 101; i++){
				factorial *= i;
				total100 += (Math.pow((double)x, (double)i))/factorial;
			}
			System.out.println("e^" + x + " using factorial 100: " + total100); 
	
			String exitOrEnter;			

			while(true){ // keeps program running until user decides to terminate
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
