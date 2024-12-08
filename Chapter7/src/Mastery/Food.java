spackage Mastery;

public class Food {
	//creating variables to record food's price, fat, carbohydrates, fiber.
	private double price, fat, carbs, fiber;
	
	//constructor method which how much of the item the user wants, it's price, fat, carbohydrates, and fiber as parameters and uses those values to initialize the variables made before.
	public Food( double foodPrice, double foodFat, double foodCarbs, double foodFiber ){
		price = foodPrice;
		fat = foodFat;
		carbs = foodCarbs;
		fiber = foodFiber;
	}
	
	//method returns fat value of object
	public double showFat() {
		return fat;
	}
	
	//method returns carbohydrates value of object
	public double showCarbs() {
		return carbs;
	}
	//method returns fiber value of object
	public double showFiber() {
		return fiber;
	}
	//method returns price value of object
	public double showPrice() {
		return price;
	}
	
	
	
}
