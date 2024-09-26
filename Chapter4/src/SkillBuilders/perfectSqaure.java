package SkillBuilders;

import java.util.Scanner;
import java.lang.Math;
public class perfectSqaure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting scanner ready to record user inputs
		Scanner Input = new Scanner(System.in);
		// prompting user for number to square root and recording it
		System.out.print("Please enter the number you want to know the square root of: ");
		double num = Input.nextInt();
		//checking if number given is perfect square
		if (Math.sqrt(num) % 1 == 0) {
			//if number is perfect square then will output saying its a perfect square and the square root number
			System.out.print("Number is a perfect square, square root is: " + Math.sqrt(num));}
		else {
			//if number is not a perfect square then will output saying its not a perfect square
			System.out.print("Number is not a perfect square, square root is: " + Math.sqrt(num));
		}
}
}