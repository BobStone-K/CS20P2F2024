package SkillBuilders;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner(System.in);
		//Declaration
		double first, second, third, totaldist;
		
		//prompting users for distances and recording them
		System.out.print("Please enter distance for race 1: ");
		first  = UserInput.nextDouble();
		System.out.print("Please enter distance for race 2: ");
		second  = UserInput.nextDouble();
		System.out.print("Please enter distance for race 3: ");
		third  = UserInput.nextDouble();
		
		//Adding races for total distance
		totaldist = first + second + third;
		System.out.print("The total distance is");
		
		
	}

}
