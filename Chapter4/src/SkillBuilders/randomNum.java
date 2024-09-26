package SkillBuilders;

import java.util.Scanner;
import java.lang.Math;
public class randomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting scanner ready to record user inputs
		Scanner Input = new Scanner(System.in);
		// prompting user for min and max values they want for random number then recording them
		System.out.print("Please enter your minimum value for the random number you wanted generated: ");
		int minVal = Input.nextInt();
		System.out.print("Please enter your minimum value for the random number you wanted generated: ");
		int maxVal = Input.nextInt();
		//outputting random number
		System.out.println("Your number random number is: " + (int)(((maxVal - minVal + 1)*Math.random()) + minVal));
	}

}
