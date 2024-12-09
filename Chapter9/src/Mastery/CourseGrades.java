/*

Program: ????.java          Last Date of this Revision: December 7, 2024

Purpose: An application that uses nested for loops to output a table that diplays number in 
 multiples of ten.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;
import java.util.Scanner;
public class CourseGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		GradeBook stuGrades = new GradeBook();
		stuGrades.getGrades();
		stuGrades.showGrades();
		System.out.print("Please enter student whose average you want: ");
		System.out.print(""stuGrades.studentAvg(input.nextInt()));
		
	}

}
