package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {
	//method to that takes a base and power and returns the answer of that base to the power its given
	public static int powerOf(int base, int power){
		
		int powNum = (int) Math.pow(base, power);
		return powNum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prompting user for their base and exponent number and recording it
		Scanner Input = new Scanner(System.in);
		System.out.print("Please enter your base number: ");
		int base = Input.nextInt();
		System.out.print("Please enter your exponent number: ");
		int power = Input.nextInt();
		//calls method with base and exponent number to output answer to user
		System.out.print("The result of exponentiation is " + powerOf(base, power));
	}
}
