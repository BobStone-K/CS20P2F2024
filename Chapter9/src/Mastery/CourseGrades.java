/*
Program: CourseGrades.java          Last Date of this Revision: December 7, 2024

Purpose: Tests GradeBook class.
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



/* Screen Dump

test case 1:
Student 1
Please enter grade for test 1: 50
Please enter grade for test 2: 76
Please enter grade for test 3: 58
Please enter grade for test 4: 75
Please enter grade for test 5: 69
Student 2
Please enter grade for test 1: 68
Please enter grade for test 2: 79
Please enter grade for test 3: 99
Please enter grade for test 4: 100
Please enter grade for test 5: 80
Student 3
Please enter grade for test 1: 23
Please enter grade for test 2: 56
Please enter grade for test 3: 37
Please enter grade for test 4: 79
Please enter grade for test 5: 56
Student 4
Please enter grade for test 1: 89
Please enter grade for test 2: 98
Please enter grade for test 3: 87
Please enter grade for test 4: 68
Please enter grade for test 5: 99
Student 5
Please enter grade for test 1: 90
Please enter grade for test 2: 95
Please enter grade for test 3: 96
Please enter grade for test 4: 97
Please enter grade for test 5: 99
Student 6
Please enter grade for test 1: 36
Please enter grade for test 2: 75
Please enter grade for test 3: 45
Please enter grade for test 4: 69
Please enter grade for test 5: 78
Student 7
Please enter grade for test 1: 54
Please enter grade for test 2: 65
Please enter grade for test 3: 57
Please enter grade for test 4: 70
Please enter grade for test 5: 52
Student 8
Please enter grade for test 1: 56
Please enter grade for test 2: 78
Please enter grade for test 3: 98
Please enter grade for test 4: 67
Please enter grade for test 5: 56
Student 9
Please enter grade for test 1: 48
Please enter grade for test 2: 68
Please enter grade for test 3: 67
Please enter grade for test 4: 95
Please enter grade for test 5: 65
Student 10
Please enter grade for test 1: 23
Please enter grade for test 2: 46
Please enter grade for test 3: 74
Please enter grade for test 4: 56
Please enter grade for test 5: 80
Student 11
Please enter grade for test 1: 56
Please enter grade for test 2: 76
Please enter grade for test 3: 78
Please enter grade for test 4: 45
Please enter grade for test 5: 60
Student 12
Please enter grade for test 1: 90
Please enter grade for test 2: 90
Please enter grade for test 3: 99
Please enter grade for test 4: 99
Please enter grade for test 5: 13
Student 1
Grade for test 1: 50%
Grade for test 2: 76%
Grade for test 3: 58%
Grade for test 4: 75%
Grade for test 5: 69%
Student 2
Grade for test 1: 68%
Grade for test 2: 79%
Grade for test 3: 99%
Grade for test 4: 100%
Grade for test 5: 80%
Student 3
Grade for test 1: 23%
Grade for test 2: 56%
Grade for test 3: 37%
Grade for test 4: 79%
Grade for test 5: 56%
Student 4
Grade for test 1: 89%
Grade for test 2: 98%
Grade for test 3: 87%
Grade for test 4: 68%
Grade for test 5: 99%
Student 5
Grade for test 1: 90%
Grade for test 2: 95%
Grade for test 3: 96%
Grade for test 4: 97%
Grade for test 5: 99%
Student 6
Grade for test 1: 36%
Grade for test 2: 75%
Grade for test 3: 45%
Grade for test 4: 69%
Grade for test 5: 78%
Student 7
Grade for test 1: 54%
Grade for test 2: 65%
Grade for test 3: 57%
Grade for test 4: 70%
Grade for test 5: 52%
Student 8
Grade for test 1: 56%
Grade for test 2: 78%
Grade for test 3: 98%
Grade for test 4: 67%
Grade for test 5: 56%
Student 9
Grade for test 1: 48%
Grade for test 2: 68%
Grade for test 3: 67%
Grade for test 4: 95%
Grade for test 5: 65%
Student 10
Grade for test 1: 23%
Grade for test 2: 46%
Grade for test 3: 74%
Grade for test 4: 56%
Grade for test 5: 80%
Student 11
Grade for test 1: 56%
Grade for test 2: 76%
Grade for test 3: 78%
Grade for test 4: 45%
Grade for test 5: 60%
Student 12
Grade for test 1: 90%
Grade for test 2: 90%
Grade for test 3: 99%
Grade for test 4: 99%
Grade for test 5: 13%
Please enter student whose average you want: 4
Their average is: 88.2%
Please which test's average you want to see: 5
The average is: 67.0%


 
 */