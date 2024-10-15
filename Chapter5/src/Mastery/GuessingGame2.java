/*

Program: GuessingGame.java          Last Date of this Revision: October 8, 2024

Purpose: The GuessingGame application created in Chapter 5 Exercise 8 would be more fun if users could make
as many guesses as necessary to guess the secret number.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20 
 

*/

package Mastery;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //getting ready to record inputs
	     Scanner Input = new Scanner(System.in); 
	     //declaring variables
	     double computerNum;
	     int userNum;
	     boolean correct = false;
	   //generating random number
	      computerNum =  (int)((20 - 1 + 1) * Math.random() + 1);
	      //This will run a loop of letting the user answer again infinitely until they get the right answer
	     while (!(correct)){
	    	 //prompting to enter number between 1 and 20
		     System.out.print("Please enter a number between 1 and 20: ");
	    	//recording user answer to what was prompted
		      userNum = Input.nextInt();
		      //checking if user guessed right
		      if (userNum == computerNum) {
		    	  // if right then will output a you won message and break out of loop
		    	  correct = true;
				 System.out.println("You won!");
		    	 break;}
		      else {
		    	  // if false user will be asked to try again and loop will repeat
		    	  System.out.println("Try again");}  
		 
	     }

	}

}

/* Screen Dump
 
Paste the output of your code here:

 Please enter a number between 1 and 20: 1
Try again
Please enter a number between 1 and 20: 2
Try again
Please enter a number between 1 and 20: 3
You won!

 */