/*

Program: GroupAssignment.java          Last Date of this Revision: October 8, 2024

Purpose: Create a GroupAssignment application that prompts the user
Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20 
 

*/

package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //getting ready to record inputs
	     Scanner Input = new Scanner(System.in); 
	     //declaring variables
	     String lastName, firstName;
	     char initial;
	     int groupNum = 0;
	     //prompting user for their first and last name and recording them
	     System.out.print("Enter your first name: ");
	     firstName = Input.next();
	     System.out.print("Enter your last name: ");
	     lastName = Input.next();
	     //taking first initial
	     initial = Character.toUpperCase(lastName.charAt(0));
	     //checking to see what group, user falls into
	     if (initial >= 'A' && initial <= 'I') {
	    	 //if first letter of last name is between A and I then in group 1
	    	 groupNum = 1;}
	      else if (initial >= 'J' && initial <= 'S') {
	    	//if first letter of last name is between J and S then in group 2
	    	 groupNum = 2;}
	      else if (initial >= 'T' && initial <= 'Z') {
	    	//if first letter of last name is between T and Z then in group 3
	    	  groupNum = 3;}
	     //Outputs user's full name and what group they are in
	     System.out.print(firstName + " " + lastName + " is assigned to group " + groupNum);
	}

}


/* Screen Dump
 
Paste the output of your code here
Test Case 1:
 Enter your first name: Youdis
Enter your last name: Acharya
Youdis Acharya is assigned to group 1

Test Case 2: 
Enter your first name: Bob
Enter your last name: Money
Bob Money is assigned to group 2

Test Case 3: 
Enter your first name: Teddy
Enter your last name: Zygarde
Teddy Zygarde is assigned to group 3
 */