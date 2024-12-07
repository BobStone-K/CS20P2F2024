/*

Program: LunchOrder.java          Last Date of this Revision: December 5, 2024

Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french
fries, and sodas and then displays the total for the order. 

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LunchOrder {

	public static void main(String[] args) {

		//creating new Scanner and DecimalFormat objects
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.##");
		//creating food object for each of the for food items
		Food hamburger = new Food(1.85, 9, 33, 1);
		Food salad = new Food(2.00, 1, 11, 5);
		Food frenchFries = new Food(1.30, 11, 36, 4);
		Food soda = new Food(0.95, 0, 38, 0);
		//Variable that will store price of the order
		double orderTotal = 0; 
		//prompting user for how many hamburger they want, then multiplying that number by price of a hamburger and adding that product to orderTotal
		System.out.print("Enter number of hamburgers: ");
		orderTotal += (hamburger.showPrice()*input.nextInt());
		System.out.println("Each hamburger has " + hamburger.showFat() +"g of fat, "+hamburger.showCarbs() +"g of carbs, and "+ hamburger.showFiber()+"g of of fiber");
		System.out.println("");
		//prompting user for how many salads they want, then multiplying that number by price of a salad and adding that product to orderTotal
		System.out.print("Enter number of salads: ");
		orderTotal += (salad.showPrice()*input.nextInt());
		System.out.println("Each salad has " + salad.showFat() +"g of fat, "+salad.showCarbs() +"g of carbs, and "+ salad.showFiber()+"g of of fiber");
		System.out.println("");
		//prompting user for how many French fries they want, then multiplying that number by price of French fries and adding that product to orderTotal
		System.out.print("Enter number of french fries: ");
		orderTotal += (frenchFries.showPrice()*input.nextInt());
		System.out.println("French fries have " + frenchFries.showFat() +"g of fat, "+frenchFries.showCarbs() +"g of carbs, and "+ frenchFries.showFiber()+"g of of fiber");
		System.out.println("");
		//prompting user for how many sodas they want, then multiplying that number by price of a soda and adding that product to orderTotal
		System.out.print("Enter number of sodas: ");
		orderTotal += (soda.showPrice()*input.nextInt());
		System.out.println("Each soda has " + soda.showFat() +"g of fat, "+soda.showCarbs() +"g of carbs, and "+ soda.showFiber()+"g of of fiber");
		System.out.println("");
		//outputting total of user's order as the value of orderTotal
		System.out.println("Your order comes to: $" + formatter.format(orderTotal));
		

	}

}


/* Screen Dump



 
 */
