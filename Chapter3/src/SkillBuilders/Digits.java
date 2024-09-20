package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner(System.in);
		//Declaration and Initialization
		System.out.print("Please enter a 2 digit number: ");
		int numEntered = UserInput.nextInt();
		int baseOne = numEntered % 10;
		int baseTen = numEntered / 10;
		System.out.println("Your base ten is: " + baseTen);
		System.out.println("Your base one is: " + baseOne);

	}

}
