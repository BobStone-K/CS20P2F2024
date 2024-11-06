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
