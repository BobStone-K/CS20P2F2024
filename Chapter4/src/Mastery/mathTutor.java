package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;
public class mathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.##");
		int randNum1 = (int)(((10 - 1 + 1)*Math.random()) + 1);
		int randNum2 = (int)(((10 - 1 + 1)*Math.random()) + 1);
		int randOpNum = 4;//(int)(((4 - 1 + 1)*Math.random()) + 1);
		
		 double answer;
		double userAns;
		switch(randOpNum) {
			case 1: answer = randNum1 + randNum2;
					System.out.print("Whats is " + randNum1 + " + " + randNum2 + ":");
					userAns = Input.nextInt();
					if (userAns == answer) {
						System.out.print("correct");}
					else {
						System.out.print("Incorrect");}
					break;
			case 2:answer = randNum1 - randNum2;
			System.out.print("Whats is " + randNum1 + " - " + randNum2 + ":");
			userAns = Input.nextInt();
			if (userAns == answer) {
				System.out.print("correct");}
			else {
				System.out.print("Incorrect");}
			break;
			case 3:answer = randNum1 * randNum2;
			System.out.print("Whats is " + randNum1 + " * " + randNum2 + ":");
			userAns = Input.nextInt();
			if (userAns == answer) {
				System.out.print("correct");}
			else {
				System.out.print("Incorrect");}
			break;
			case 4: answer = (((Double.valueOf(randNum1) / Double.valueOf(randNum2))));
					String formatAns = formatter.format(answer);
			System.out.print("Whats is " + randNum1 + " / " + randNum2 + " Please answer to the hundreth place rounded: ");
			userAns = Input.nextDouble();
			String formattedUserAns =  formatter.format(userAns);
	
			if (formattedUserAns.equals(formatAns)) {
				System.out.print("correct");}
			else {
				System.out.print("Incorrect");}
			break;
			
		
		
		}
		
	}

}
