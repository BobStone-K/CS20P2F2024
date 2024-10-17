           /*

Program: PrimeNumberPartA.java          Last Date of this Revision: October 8, 2024

Purpose: Create a PrimeNumber application that prompts the user for a number and then displays a
message indicating whether the number is prime or not.
Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20 
 

*/

package Mastery;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating new scanner to record user input
		Scanner Input = new Scanner(System.in);
		//prompt user to enter a number
		System.out.print("Please enter a number: ");
		//record number entered
		int userNum = Input.nextInt();
		// initializing variable that will record whether number entered is prime or not
		boolean prime = true;
		//checking if number is 1 or 0 as these won't work in for loop as they are lower than 2
		if (userNum == 0 || userNum == 1) {
		//if 1 or 0 then set prime as false
			prime = false;}
			
		// for loop to divide number entered by every number from 2 to half of the number 
		for (int i = 2; i <= (userNum/2); i++) {
			// checking if number is fully divisible
			if (userNum % i == 0) {
			// if it is fully divisible by a number then set prime to false
				prime = false;}
			}
		// checking if prime is true or not
		if (prime) {
		// if prime is true then number was a prime number and will output that to user
		System.out.print(userNum + " is a prime number");}
		// if prime is false then number was not a prime number and will output that to user
		else {System.out.print(userNum + " is not a prime number");}
			
}
}


/* Screen Dump
 test case 1:
Please enter a number: 37
37 is a prime number
Paste the output of your code here
 test case 2: 
Please enter a number: 16
16 is not a prime number
 */