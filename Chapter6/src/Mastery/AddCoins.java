/*

Program: AddCoins.java          Last Date of this Revision: November 19, 2024

Purpose: Create an AddCoins application that prompts the user for the number of pennies, nickels, dimes,
and quarters, and then displays their total dollar amount.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AddCoins {
	
	//method to add up dollar amount of coins received in parameters
	public static String getDollarAmount(int quarters ,int dimes ,int nickels ,int pennies) {
		DecimalFormat formatter = new DecimalFormat("#.##");
		// declared variable and initialize it with sum of all the coins at their dollar amount
		String total = String.valueOf((quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01));
	
	//return the value of the total amount of money the coins are worth
		
	return formatter.format(Double.parseDouble(total));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating new scanner object
		Scanner Input = new Scanner(System.in);
		//prompting user to enter how many of each coins they have
		System.out.println("Enter your total coins:");
		// prompting user with each coin and then storing how many they have in variables declared for each coin
		System.out.print("Quarters: ");
		int quarters = Input.nextInt();
		System.out.print("Dimes: ");
		int dimes = Input.nextInt();
		System.out.print("Nickels: ");
		int nickels = Input.nextInt();
		System.out.print("Pennies: ");
		int pennies = Input.nextInt();
		// outputting the user's total by calling method previously made and outputting its return value
		System.out.print("Total: $" + getDollarAmount(quarters, dimes, nickels, pennies));
	}

}

/* Screen Dump
Test case 1:
Enter your total coins:
Quarters: 15
Dimes: 6
Nickels: 4
Pennies: 2
Total: $4.57

Test case 2:
Enter your total coins:
Quarters: 0
Dimes: 9
Nickels: 7
Pennies: 4
Total: $1.29

 
 */
