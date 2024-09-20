package SkillBuilders;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner(System.in);
		double first, second, third, fourth, fifth, gradeAvg = 0;
		System.out.print("Please enter first grade percent: ");
		first = UserInput.nextDouble();
		gradeAvg += first;
		System.out.print("Please enter second grade percent: ");
		second = UserInput.nextDouble();
		gradeAvg += second;
		System.out.print("Please enter third grade percent: ");
		third = UserInput.nextDouble();
		gradeAvg += third;
		System.out.print("Please enter fourth grade percent: ");
		fourth = UserInput.nextDouble();
		gradeAvg += fourth;
		System.out.print("Please enter fifth grade percent: ");
		fifth = UserInput.nextDouble();
		gradeAvg += fifth;
		gradeAvg = gradeAvg / 5;
		System.out.print("Your grade average is : " + gradeAvg + "%");
	}

}
