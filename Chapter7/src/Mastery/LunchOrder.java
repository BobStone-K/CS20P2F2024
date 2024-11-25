/*

Program: LunchOrder.java          Last Date of this Revision: November 24, 2024

Purpose: An application that uses nested for loops to output a table that displays number in 
 multiples of ten.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LunchOrder {

	public static void main(String[] args) {
		//creating new Scanner, Food, and DecimalFormat object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.##");
		Food order = new Food();
		//asking user for how many burgers, salds, fries, and sodas they would like while providing nutrition values for each
		//entering amount of each item user wants in the corresponding methods first parameter so they can calculate total price
		//entering amount of fat and carbs and fiber each item has in the other parameters so the method can output nutrition values to user
		System.out.print("Enter number of hamburgers: ");
		order.hamburger(input.nextInt(), 9, 33, 1);
		System.out.println("");
		System.out.print("Enter number of salads: ");
		order.salad(input.nextInt(), 1, 11, 5);
		System.out.println("");
		System.out.print("Enter number of french fries: ");
		order.frenchFries(input.nextInt(), 11, 36, 4);
		System.out.println("");
		System.out.print("Enter number of sodas: ");
		order.soda(input.nextInt(), 0, 38, 0);
		System.out.println("");
		//outputs total amount of money user owes for the food by accessing it through total method
		System.out.println("Your order comes to: $" + formatter.format(order.total()));
		

	}

}


/* Screen Dump

Test case 1:
Enter number of hamburgers: 1
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber

Enter number of salads: 1
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber

Enter number of french fries: 1
Each serving of french fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber

Enter number of sodas: 1
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber

Your order comes to: $6.1

Test case 2:

 
 */
