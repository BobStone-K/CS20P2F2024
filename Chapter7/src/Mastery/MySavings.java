/*

Program: MySavings.java          Last Date of this Revision: November 24, 2024

Purpose: Create a MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and
quarters into a piggy bank and then prompts the user to make a selection.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;
import java.util.Scanner;
public class MySavings {

	public static void main(String[] args) {
		//created new scanner object and piggybank object
		Scanner input = new Scanner(System.in);
		PiggyBank bank = new PiggyBank();
		// declaring variable for users choice on what to do with piggy bank
		int choice;
		//while loop to let the user do multiple things 
		while (true) {
			//prompting user with 7 choices to do to their piggy bank
			System.out.println("1. Show a total in bank.");
			System.out.println("2. Add a penny.");
			System.out.println("3. Add a nickel");
			System.out.println("4. Add a dime");
			System.out.println("5. Add a quarter");
			System.out.println("6. Take money out of bank");
			System.out.println("Enter 0 to quit");
			System.out.print("Enter your choice: ");
			//recording users choice in choice variable
			choice = input.nextInt();
			//if they picked choice 0 then it will exit out of the while loop which then ends the program
			if (choice == 0) {
				break;
			}
			// if they picked choice 1 to 6 then the corresponding action will run
			switch (choice) {
			// choice 1 will access the show balance method to output the user's piggy bank balance
			case 1:System.out.println("your bank balance is $" + bank.showBalance()); break;
			//choice 2 accesses method which adds penny to user's piggy bank
			case 2:bank.addPenny();
			System.out.println("You added a penny to your balance, the new balance is $" + bank.showBalance());  break;
			//choice 3 accesses method which adds nickel to user's piggy bank
			case 3:bank.addNickel();
			System.out.println("You added a nickel to your balance, the new balance is $" + bank.showBalance());break;
			//choice 4 accesses method which adds dime to user's piggy bank
			case 4:bank.addDime();
			System.out.println("You added a dime to your balance, the new balance is $" + bank.showBalance());break;
			//choice 5 accesses method which adds quarter to user's piggy bank
			case 5:bank.addQuarter();
			System.out.println("You added a quarter to your balance, the new balance is $" + bank.showBalance());break;
			//takes out how much money user wants out of piggy bank only if it is less than or equal to how much is in piggy bank
			case 6:System.out.print("How many dollars would you like to take out: ");
					double takenMoney = input.nextDouble();
					System.out.println(bank.takeMoney(takenMoney) + " your balance is $" + bank.showBalance()); break;
			// if user presses a number that is not within the range 0 to 6 than will be asked to try again, repeating the while loop
			default:System.out.println("You entered a invalid number please try again");
			
			}
		}
	}

}


/* Screen Dump
 
test case 1:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 1
your bank balance is $0.0
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 

test case 2:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 2
You added a penny to your balance, the new balance is $0.01
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 


test case 3:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 3
You added a nickel to your balance, the new balance is $0.05
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 

test case 4:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 4
You added a dime to your balance, the new balance is $0.1
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 

test case 5:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 5
You added a quarter to your balance, the new balance is $0.25
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 

test case 6:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 5
You added a quarter to your balance, the new balance is $0.25
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 6
How many dollars would you like to take out: 1
There is not enough money in the bank to take out that much your balance is $0.25
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 

test case 7:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 5
You added a quarter to your balance, the new balance is $0.25
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 6
How many dollars would you like to take out: 0.2
Money has been taken out your balance is $0.05
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 

test case 8:
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 7
You entered a invalid number please try again
1. Show a total in bank.
2. Add a penny.
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 
 
 */
