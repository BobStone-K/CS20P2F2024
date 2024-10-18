package SkillBuilders;

import java.util.Scanner;

public class delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting scanner ready to record user inputs
		Scanner Input = new Scanner(System.in);
		// prompting user for width and length of package and recording the values
		System.out.print("Please enter your package's width: ");
		int width = Input.nextInt();
		System.out.print("Please enter your package's length: ");
		int length = Input.nextInt();
		//Figuring out if dimensions are less than or equal to ten
		if (width <= 10 && length <= 10) {
			//outputs accept if one or both dimensions are less than or equal to ten
			System.out.print("Accept");
		}
		else {
			//outputs decline if one or both dimensions bigger than 10
			System.out.print("Decline");
		}
	}

}
