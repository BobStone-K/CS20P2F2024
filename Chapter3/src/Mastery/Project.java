package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Project {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Getting ready to record user inputs
		Scanner Input = new Scanner(System.in);
		//Getting decimal format ready to format percentages
		DecimalFormat formatter = new DecimalFormat("#.##");
		//declaring needed variables
		double task1, task2, task3, task4, totalTime, task1per, task2per, task3per, task4per;
		//prompting user for time taken on each task and then recording it
		System.out.print("Please enter time taken on designing: ");
		task1 = Input.nextInt();
		System.out.print("Please enter time taken on coding: ");
		task2 = Input.nextInt();
		System.out.print("Please enter time taken on debugging: ");
		task3 = Input.nextInt();
		System.out.print("Please enter time taken on testing: ");
		task4 = Input.nextInt();
		//adding up time of every task and storing it
		totalTime = task1 + task2 + task3 + task4;
		//Finding percentage of total time taken for each task
		task1per = (task1 / totalTime)* 100;
		task2per = (task2 / totalTime)* 100;
		task3per = (task3 / totalTime)* 100;
		task4per = (task4 / totalTime)* 100;
		//Outputting percentage of total time each task took with decimal format
		System.out.println("Task        % Time");
		System.out.println("Designing:  " + formatter.format(task1per) + "%");
		System.out.println("Coding:     " + formatter.format(task2per) + "%");
		System.out.println("Debugging:  " + formatter.format(task3per) + "%");
		System.out.println("Testing:    " + formatter.format(task4per) + "%");
	}

}
