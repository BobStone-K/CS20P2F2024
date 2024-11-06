package SkillBuilders;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TimeConverter {
	//method to convert hours to minutes
	public static void hrsToMins() {
		Scanner input = new Scanner(System.in);
		DecimalFormat DCFormat = new DecimalFormat("#.##");
		System.out.print("Enter how many hours you want to convert: ");
		int hours = input.nextInt();
		int mins = hours * 60;
		System.out.println(hours + " hours is " + mins + " minutes.");
	}
	//method to convert days to hours
	public static void daysToHrs() {
		Scanner input = new Scanner(System.in);
		DecimalFormat DCFormat = new DecimalFormat("#.##");
		System.out.print("Enter how many days you want to convert: ");
		int days = input.nextInt();
		int hours = days * 24;
		System.out.println(days + " days is " + hours + " hours.");
	}
	
	//method to convert minutes to hours
	public static void minsToHrs() {
		Scanner input = new Scanner(System.in);
		DecimalFormat DCFormat = new DecimalFormat("#.##");
		System.out.print("Enter how many minutes you want to convert: ");
		int mins = input.nextInt();
		double hours = ((double)mins) / 60 ;
		System.out.println(mins + " minutes is " + DCFormat.format(hours) + " hours.");
	}
	//method to convert hours to days
	public static void hrsToDays() {
		Scanner input = new Scanner(System.in);
		DecimalFormat DCFormat = new DecimalFormat("#.##");
		System.out.print("Enter how many hours you want to convert: ");
		int hours = input.nextInt();
		double days = ((double)hours) / 24 ;
		System.out.println(hours + " hours is " + DCFormat.format(days) + " hours.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner input = new Scanner(System.in);
		System.out.println("1. Hours to minutes");
		System.out.println("2. Days to hours");
		System.out.println("3. Minutes to hours");
		System.out.println("4. Hours to days");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		//switch case to decide which method to use based on what option user chose
		switch(choice) {
		
		case 1: hrsToMins(); break;
		
		case 2: daysToHrs(); break;
		
		case 3: minsToHrs(); break;
		
		case 4: hrsToDays(); break;
		
		}
		
		
	}
}

	
