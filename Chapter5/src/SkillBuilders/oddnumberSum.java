package SkillBuilders;

import java.util.Scanner;

public class oddnumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		//prompt user to enter a number
		System.out.print("Please enter a number: ");
		//record number entered
		int userNum = Input.nextInt();
		//declare and initialize sum of all numbers
		int sum = 0;
		// add one to i which is one until equal to number user entered
		for(int i =1; i<= userNum; i++) {
	 // will output every number in between 1 and number user entered
	 System.out.println(i);
	 //adding all the number in between 1 and number user entered
	 sum += i;
 }
 //outputs sum
 System.out.println(sum);
	}

}

	}

}
