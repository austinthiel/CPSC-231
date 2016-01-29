import java.util.Scanner;

public class Ch3Ex6{
	public static void main(String[] args){ // fibonacci sequence example using green crud population

		Scanner in = new Scanner(System.in);
		String exitOrEnter;

		while(true){

			System.out.print("Enter an initial size of a green crud population: ");
			int population = in.nextInt();
			System.out.print("Enter the number of days it is given to reproduce: ");
			int days = in.nextInt();
	
			in.nextLine(); // break to next line
	
			int prevPop = 0;
			System.out.println(population);	// pop after 0 days
	
			for(int i = 5; i <= days; i+=5){ // pop at 5, 10, 15, and 20 days
				population += prevPop;
				prevPop = population - prevPop;
				System.out.println(population);
			}
	
			while(true){ // keep program running until user decides to exit
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
