package Mastery;
import java.util.Scanner;
public class GradeBook {
	//array to store each of the 12 students 5 test grades
	int[][] grades;
	//creating scanner object to record inputs of user
	Scanner input = new Scanner(System.in);
	//constructor method to initialize the array with 12 students and 5 test grades for each student
	public GradeBook() {
		grades = new int[12][5];
	}
	//loop through every student and ask user to enter each students 5 test grades then store its in the array
	public void getGrades() {
		for(int student = 0; student< grades.length; student++) {
			System.out.println("Student " + (student + 1));
			for (int test = 0; test< grades[test].length; test++) {
				System.out.print("Please enter grade for test " + (test + 1) + ": " );
				grades[student][test] = input.nextInt();
			}
			
		}
	}
	public void showGrades() {
		for(int student = 0; student< grades.length; student++) {
			System.out.println("Student " + (student + 1));
			for (int test = 0; test< grades[test].length; test++) {
				System.out.println("Grade for test " + (test + 1) + ": " + grades[student][test] );
			}
		
		}
	}
	
	public double studentAvg(int studentNum) {
		double avg = 0;
		for (int test = 0; test<grades[studentNum].length; test++) {
			avg += grades[(studentNum-1)][test];
		}
		return (avg/5);
			
		
	}
	
	
}
