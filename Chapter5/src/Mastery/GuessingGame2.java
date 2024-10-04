package Mastery;

import java.util.Scanner;

public class GuessingGame2 {

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
