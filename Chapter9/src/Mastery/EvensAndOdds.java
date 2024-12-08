/*

Program: EvensAndODDs.java          Last Date of this Revision: December 7, 2024

Purpose: Create an EvensAndOdds application that generates 25 random integers between 0 and 99 and then
displays all the evens on one line and all the odds on the next line.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;
import java.lang.Math;
public class EvensAndOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating array to store random 25 integers
		int[] numbers = new int[25];
		//creating range of 0 to 99 for the 25 integers
		final int MAX = 99;
		final int MIN = 0;
		final int RANGE = MAX - MIN + 1;
		//generating the 25 integers randomly using range and assigning them in the array made to store them
		for( int i = 0; i<25; i++) {
			numbers[i] = (int)(Math.random() * RANGE);
		}
		//Prompting user to let them know all odd numbers of the random integers are going to be displayed
		System.out.println("ODD:");
		//checking from every number in the array to see which ones are odd, if odd they will be outputted to the user under the odd statement
		for( int i = 0; i<25; i++) {
			if ((numbers[i] % 2) != 0) {
				System.out.print(numbers[i]);
				System.out.print(" ");
			}
		}
		
		//Blank output to space the even output from the odd numbers output
		System.out.println("");
		//Prompting user to let them know all even numbers of the random integers are going to be displayed
		System.out.println("EVEN:");
		//checking from every number in the array to see which ones are even, if even they will be outputted to the user under the even statement
		for( int i = 0; i<25; i++) {
			if ((numbers[i] % 2) == 0) {

				System.out.print(numbers[i]);
				System.out.print(" ");
			}
		}
	}

}


/* Screen Dump

test case 1: 
ODD:
47 11 11 43 3 73 97 87 17 75 1 
EVEN:
38 38 26 30 66 32 16 90 84 96 58 14 74 46 
 
 */