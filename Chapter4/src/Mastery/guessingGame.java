
package Mastery;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class guessingGame {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
       //getting ready to record inputs
     Scanner Input = new Scanner(System.in); 
     //declaring variables
     double computerNum;
     int userNum;
     //prompting to enter number between 1 and 20
     System.out.print("Please enter a number between 1 and 20: ");
     //recording user answer to what was prompted
      userNum = Input.nextInt();
      //generating random number
      computerNum =  (int)((20 - 1 + 1) * Math.random() + 1);
      //outputting both computers random number and number user inputted
      System.out.println("Computers's number:  " + (int)computerNum);
      System.out.println("Player's number:  " + userNum);
      //checking if computer number is the same as the random number from computer
     if (userNum == (int)computerNum){
      //if both numbers are the same then output you win
      System.out.println("You Won!");}
      else {
          //if not output better luck next time
          System.out.println("Better luck next time.");}
	}

}


