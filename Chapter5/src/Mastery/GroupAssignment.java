package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //getting ready to record inputs
	     Scanner Input = new Scanner(System.in); 
	     //declaring variables
	     String lastName, firstName;
	     char Initial;
	     int groupNum = 0;
	     //prompting user for their first and last name and recording them
	     System.out.print("Enter your first name: ");
	     firstName = Input.next();
	     System.out.print("Enter your first name: ");
	     lastName = Input.next();
	     //taking first initial
	     Initial = Character.toUpperCase(lastName.charAt(0));
	     //checking to see what group, user falls into
	     if (Initial >= 'A' && Initial <= 'I') {
	    	 //if first letter of last name is between A and I then in group 1
	    	 groupNum = 1;}
	      else if (Initial >= 'J' && Initial <= 'S') {
	    	//if first letter of last name is between J and S then in group 2
	    	 groupNum = 2;}
	      else if (Initial >= 'T' && Initial <= 'Z') {
	    	//if first letter of last name is between T and Z then in group 3
	    	  groupNum = 3;}
	     //Outputs user's full name and what group they are in
	     System.out.print(firstName + " " + lastName + " is assigned to group " + groupNum);
	}

}