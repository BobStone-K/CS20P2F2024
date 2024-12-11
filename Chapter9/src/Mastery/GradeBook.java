/*
Program: CourseGrades.java          Last Date of this Revision: December 7, 2024

Purpose: Create a CourseGrades application that simulates a grade book for a class with 12 students that each have
5 test scores.
Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
*/

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
	//loops through every student's array of 5 test grades and outputs them below an output statement of the student whos grades are being displayed
	public void showGrades() {
		for(int student = 0; student< grades.length; student++) {
			System.out.println("Student " + (student + 1));
			for (int test = 0; test< grades[test].length; test++) {
				System.out.println("Grade for test " + (test + 1) + ": " + grades[student][test] + "%");
			}
		
		}
	}
	//Takes parameter of student num to indicate which student it is then adds up all their tests grades and returns that sum divided by 5 which is their average
	public double studentAvg(int studentNum) {
		double avg = 0;
		for (int test = 0; test<grades[studentNum-1].length; test++) {
			avg += grades[(studentNum-1)][test];
		}
		return (avg/5);
			
		
	}
	//Takes parameter of which test number then adds all of the students grades on that test and divides by 12 to get the average and returns that quotient 
	public double testAvg(int testNum) {
		int avg = 0;
		for(int student = 0; student < grades.length; student++) {
			avg += grades[student][testNum-1];
			
		}
		
		return (avg/12);
	}
	
	
}
