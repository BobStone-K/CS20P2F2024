package SkillBuilders;
import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner object to record user input
		Scanner input = new Scanner(System.in);
		//declaring variable to record how many students are in the class
		int numStudents;
		//prompting user for how many students are in class then recording answer in previously made variable
		System.out.print("Please enter how many students are in the class: ");
		numStudents = input.nextInt();
		//creating list that can store name of every student in the class
		String[] students = new String[numStudents + 1];
		//for loop to go through every class member to get their name and put it in the list
		for(int i = 1; i<= numStudents; i++) {
			System.out.print("Please enter student " + i + "'s name: ");
			students[i] = input.next();
		}
		//outputting student roster to let user know program is going to output them
		System.out.println("");
		System.out.println("Student Roster: ");
		//for loop to output every students number(order they're names were entered) and their name
		for(int i = 1; i<= numStudents; i++) {
			System.out.println("Student" + i + ": " + students[i]);
		}
		
	}

}
