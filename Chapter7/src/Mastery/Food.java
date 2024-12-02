package Mastery;

public class Food {
	//creating price variable to keep track of total price of users order
	private double price;
	//constructor method which initializes the total price of the order to zero since nothing has been ordered yet
	public Food(){
		price = 0;
	}
	//method which takes number of burgers, and grams of fat, carbs, and fiber a singular burger has
	public void hamburger(int numBurgers, double fat, double carbs, double fiber) {
		//multiplies number of burgers by its dollar value and adds it to price
		price += (numBurgers * 1.85);
		//takes fat, carbs, and fiber parameters and outputs the nutrition information of a singular burger
		System.out.println("Each hamburger has "+ fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
	}
	
	// method which takes number of salads, and grams of fat, carbs, and fiber a singular salad has
	public void salad(int numSalads, double fat, double carbs, double fiber) {
		//multiplies number of salads by its dollar value and adds it to price
		price += (numSalads * 2);
		//takes fat, carbs, and fiber parameters and outputs the nutrition information of a singular salad
		System.out.println("Each salad has "+ fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
	}
	
	// method which takes number of french fries, and grams of fat, carbs, and fiber a single serving of french fires has 
	public void frenchFries(int numFries, double fat, double carbs, double fiber) {
		//multiplies number of servings of french fries by its dollar value and adds it to price
		price += (numFries * 1.3);
		//takes fat, carbs, and fiber parameters and outputs the nutrition information of a singular serving of french fries
		System.out.println("Each serving of french fries has "+ fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
	}
	
	//method which takes number of soda, and grams of fat, carbs, and fiber a singular soda has
	public void soda(int numSodas, double fat, double carbs, double fiber) {
		//multiplies number of sodas by its dollar value and adds it to price
		price += (numSodas * 0.95);
		//takes fat, carbs, and fiber parameters and outputs the nutrition information of a singular soda
		System.out.println("Each soda has "+ fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
	}
	// method which returns the price variable which holds the dollar value of the user's order
	public double total() {
		return price;
	}
	
}
