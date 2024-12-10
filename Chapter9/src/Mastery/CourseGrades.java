/*

Program: CourseGrades.java          Last Date of this Revision: December 7, 2024

Purpose: tests GradeBook class.
Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;
import java.util.Scanner;
public class CourseGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner object to record inputs
		Scanner input = new Scanner(System.in);
		//Creating GradeBook object
		GradeBook stuGrades = new GradeBook();
		//using getGrades method to prompt the user for the 5 test grades for each of the 12 students
		stuGrades.getGrades();
		//showgGrades method to display the grades of all the students
		stuGrades.showGrades();
		//prompting user for which student's average they want to see
		System.out.print("Please enter student whose average you want: ");
		//putting users answer as parameter for studentAvg method, then will print the return statement of that method as the students's average
		System.out.print("Their average is: " + stuGrades.studentAvg(input.nextInt())+ "%");
		System.out.println("");
		//prompting user for which test's average they want to see
		System.out.print("Please which test's average you want to see: ");
		//putting users answer as parameter for testAvg method, then will print the return statement of that method as the test's average
		System.out.println("The average is: " + stuGrades.testAvg(input.nextInt()) + "%");
		
	}

}
