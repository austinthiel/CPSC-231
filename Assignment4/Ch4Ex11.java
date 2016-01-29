public class Ch4Ex11{
	public static void main(String[] args){ // instantiate objects and print results
	
		Pizza p1 = new Pizza("Large", 1, 1, 2);
		Pizza p2 = new Pizza("Small", 0, 3, 0);
		Pizza p3 = new Pizza("Medium", 1, 0, 1);
		System.out.println(p1.getDescription());
		System.out.println(p2.getDescription());
		System.out.println(p3.getDescription());

	}

	public static class Pizza{
		
		// instance variables	
		private String size;
		private int numCheese;
		private int numPepperoni;
		private int numHam;
		
		public Pizza(String instSize, int instNumCheese, int instNumPepperoni, int instNumHam){ // constructor
			this.size = instSize;
			this.numCheese = instNumCheese;
			this.numPepperoni = instNumPepperoni;
			this.numHam = instNumHam;
		}

		// getters and setters	
		public void setSize(String newSize){
			this.size = newSize;
		}
		public String getSize(){
			return this.size;
		}
		public void setNumCheese(int newNumCheese){
			this.numCheese = newNumCheese;
		}
		public int getNumCheese(){
			return this.numCheese;			
		}
		public void setNumPepperoni(int newNumPepperoni){
			this.numPepperoni = newNumPepperoni;
		}
		public int getNumPepperoni(){
			return this.numPepperoni;			
		}
		public void setNumHam(int newNumHam){
			this.numHam = newNumHam;
		}
		public int getNumHam(){
			return this.numHam;			
		}

		public double calcCost(){ // inputs single pizza size and toppings, and returns total cost
			int sizePrice = 0;
			int totalToppings = this.numCheese + this.numPepperoni + this.numHam;
			int toppingPrice = totalToppings * 2;
			this.size = this.size.toLowerCase();
			if(this.size.equals("small")){
				sizePrice = 10;
			}else if (this.size.equals("medium")){
				sizePrice = 12;
			}else if (this.size.equals("large")){
				sizePrice = 14;
			}else{
				System.out.println("ERROR: Invalid pizza size. Terminating...");
				System.exit(1);
			}

			double totalCost = sizePrice + toppingPrice;
			return totalCost;		
		}
		
		public String getDescription(){ // returns info about the pizza and its price
			return ("Size: " + this.getSize() + "\n" +
				"Cheese: " + this.getNumCheese() + "\n" +
				"Pepperoni: " + this.getNumPepperoni() + "\n" +
				"Ham: " + this.getNumHam() + "\n" +
				"Price: $" + this.calcCost()) + "0\n";
		}
	}
}
