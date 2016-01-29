public class Ch4Ex12 extends Ch4Ex11{

	public static void main(String[] args){ // instantiate pizza objects and place orders, print totals

		Pizza pizza1 = new Pizza("Large", 1, 0, 1);
		Pizza pizza2 = new Pizza("Medium", 2, 2, 0);
		pizzaOrder order = new pizzaOrder(pizza1, pizza2);
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		double total = order.calcTotal();
		System.out.println(total);
	}

	public static class pizzaOrder {

		//instance variables
		private Pizza pizza1;
		private Pizza pizza2;
		private Pizza pizza3;
		private int numPizzas;

		public pizzaOrder(Pizza instPizza1){ // constructor
			this.pizza1 = instPizza1;
		}

		public pizzaOrder(Pizza instPizza1, Pizza instPizza2){ // overloaded constructor
			this.pizza1 = instPizza1;
			this.pizza2 = instPizza2;
		}

		public pizzaOrder(Pizza instPizza1, Pizza instPizza2, Pizza instPizza3){ // overloaded constructor
			this.pizza1 = instPizza1;
			this.pizza2 = instPizza2;
			this.pizza3 = instPizza3;
		}

		// getters and setters
		public void setNumPizzas(int numPizzas){
			this.numPizzas = numPizzas;
		}

		public void setPizza1(Pizza pizza1){
			this.pizza1 = pizza1;
		}

		public void setPizza2(Pizza pizza2){
			this.pizza2 = pizza2;
		}

		public void setPizza3(Pizza pizza3){
			this.pizza3 = pizza3;
		}

		// return total cost of order
		public double calcTotal(){
			double orderTotal = 0.0;
			if(this.numPizzas == 1){
				orderTotal = this.pizza1.calcCost();
			}else if(this.numPizzas == 2){
				orderTotal = this.pizza1.calcCost() + this.pizza2.calcCost();
			}else if(this.numPizzas == 3){
				orderTotal = this.pizza1.calcCost() + this.pizza2.calcCost() + this.pizza3.calcCost();
			}
			return orderTotal;
		}
	}
}
