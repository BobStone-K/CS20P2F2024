/*

Program: DigitExtractor.java          Last Date of this Revision: November 24, 2024

Purpose: Create a DigitExtractor application that prompts the user for an integer and then displays the ones,
tens, and hundreds digit of the number.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//created new scanner object and num object by asking user for integer to use as parameter for num object constructor method
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		Num number = new Num(input.nextInt());
		// declaring variable for users choice on what to do with integer
		String choice;
		//while loop to let the user do multiple things with integer 
		while (true) {
			//prompting user with 5 choice on what to do with integer
			System.out.println("Show (W)hole number.");
			System.out.println("Show (O)nes place number.");
			System.out.println("Show (T)ens place number.");
			System.out.println("Show (H)undreds place number.");
			System.out.println("(Q)uit");

			System.out.print("Enter your choice: ");
			//recording users choice in choice variable
			choice = input.next();
			//making it lower case to the choice isn't case sensitive
			choice = choice.toLowerCase();
			//if they picked choice q then it will exit out of the while loop which then ends the program
			if (choice.equals("q")) {
				break;
			}
			// if they picked choice W,O,T, or H then the corresponding action will run
			switch (choice) {
			// choice W will output the whole integer
			case "w":System.out.println("your integer is " + number.wholeNum()); break;
			//choice O accesses method which outputs ones places of number
			case "o": System.out.println("The ones place digit is: " + number.onesPlace());  break;
			//choice T accesses method which outputs ten place of number
			case "t":System.out.println("The tens place digit is: " + number.tensPlace());break;
			//choice H accesses method which outputs hundreds place of number
			case "h":System.out.println("The hundreds place digit is: " + number.hundredsPlace()); break;
			//if user enters a choice that is not displayed then will tell user to try again
			default:System.out.println("You entered a invalid choice please try again");
			
			}
		}
	}
	}

/* Screen Dump

test case 1:
Enter an integer: 123
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: w
your integer is 123
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is: 3
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: t
The tens place digit is: 2
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is: 1
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: 1
You entered a invalid choice please try again
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: q

test case 2:
Enter an integer: 768
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: w
your integer is 768
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is: 8
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: t
The tens place digit is: 6
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is: 7
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: 2
You entered a invalid choice please try again
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: q


 */

