package Mastery;

import java.util.Scanner;

public class digitsV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Getting ready to record user inputs
		Scanner input = new Scanner(System.in);
		//Declaration of variables
		int entNum, baseHundred, baseTen, baseOne;
		
		
		
		//prompt user to enter 3 digit number
		System.out.print("Please enter a 3 digit number: ");
		//Recording userinput into entNum by declaring the value into it
		entNum = input.nextInt();
		
		
		
		
		//Declaring values of baseHundred, baseTen, and baseOne by finding out bases of entNum
		baseHundred = entNum / 100;
		baseTen = (entNum - (baseHundred*100)) / 10;
		baseOne = entNum % 10;
		
		
		// output the bases of the number the user entered
		System.out.println("Your base hundred is: " + baseHundred);
		System.out.println("Your base ten is: " + baseTen);
		System.out.println("Your base one is: " + baseOne);
	}

}
