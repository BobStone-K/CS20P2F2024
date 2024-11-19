/*

Program: MetricConversion.java          Last Date of this Revision: November 19, 2024

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts
the user to choose a conversion.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 

*/
package Mastery;
import java.text.DecimalFormat;
import java.util.Scanner;
public class MetricConversion {
	//Methods
	//Converts inches to Cm by taking parameter of inches and returns centimeters
	public static double inToCm(double inches) {
		
	return inches * 2.54;
	}
	//Converts feet to Cm by taking parameter of feet and returns centimeters
	public static double feetToCm(double feet) {
	
	return feet * 30;
	}
	//Converts yards to meters by taking parameter of yards and returns meters
	public static double ydsToM(double yards) {
	
	return yards * 0.91;
	}
	//Converts miles to kilometers by taking parameter of kilometers and returns kilometers
	public static double mileToKm(double miles) {
	
	return miles * 1.6;
	}
	//Converts Cm to inches by taking parameter of cm and returns inches
	public static double cmToIn(double cm) {
		
	return cm / 2.54;
	}
	//Converts Cm to feet by taking parameter of cm and returns feet
	public static double cmToFt(double cm) {
		
	return cm / 30;
	}
	//Converts meters to yards by taking parameter of meters and returns yards
	public static double mToYds(double meters) {
		
	return meters / 0.91;
	}
	//converts kilometers to miles by taking parameter of kilometers and returns miles
	public static double kmToMile(double km) {
	
	return km / 1.6;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask user to enter number of unit they want to convert and record answer
		DecimalFormat formatter = new DecimalFormat("#.##");
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int valueToConvert = Input.nextInt();
		//gives user options on which units to convert and record their answer
		System.out.print("1.Inches to Centimeters");
		System.out.println("   5.Centimeters to Inches");
		System.out.print("2.Feet to Centimeters");
		System.out.println("     6.Centimeters to Feet");
		System.out.print("3.Yards to Meters");
		System.out.println("         7.Meters to Yards");
		System.out.print("4.Miles to Kilometers");
		System.out.println("     8.Kilometers to Miles");
		
		System.out.print("Enter your choice: ");
		int choice = Input.nextInt();
	
		
		//will use method depending on their answer and use the amount of unit they entered first as parameter to be converted
		switch (choice) {
		
	    case 1:
	        System.out.println(valueToConvert + " inches equals " + formatter.format(inToCm(valueToConvert)) + " centimeters");
	        break;

	    case 2:
	    	System.out.println(valueToConvert + " feet equals " + formatter.format(feetToCm(valueToConvert)) + " centimeters");
	        
	        break;

	    case 3:
	    	System.out.println(valueToConvert + " yards equals " + formatter.format(ydsToM(valueToConvert)) + " meters");
	       
	        break;

	    case 4:
	    	System.out.println(valueToConvert + " miles equals " + formatter.format(mileToKm(valueToConvert)) + " kilometers");
	  
	        break;

	    case 5:
	    	System.out.println(valueToConvert + " centimeters equals " + formatter.format(cmToIn(valueToConvert)) + " inches");
	      
	        break;

	    case 6:
	        System.out.println(valueToConvert + " centimeters equals " + formatter.format(cmToFt(valueToConvert)) + " feet");
	        break;

	    case 7:
	    	System.out.println(valueToConvert + " meters equals " + formatter.format(mToYds(valueToConvert)) + " yards");
	        
	        break;

	    case 8:
	        System.out.println(valueToConvert + " kilometers equals " + formatter.format(kmToMile(valueToConvert)) + " miles");
	        break;
	}
		
	}







}

/* Screen Dump
Test case 1:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 1
15 inches equals 38.1 centimeters

Test case 2:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 2
15 feet equals 450.0 centimeters

Test case 3:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 3
15 yards equals 13.65 meters

Test case 4:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 4
15 miles equals 24.0 kilometers

Test case 5:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 5
15 centimeters equals 5.91 inches

Test case 6:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 6
15 centimeters equals 0.5 feet

Test case 7:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 7
15 meters equals 16.48 yards

Test case 8:
Enter a number: 15
1.Inches to Centimeters   5.Centimeters to Inches
2.Feet to Centimeters     6.Centimeters to Feet
3.Yards to Meters         7.Meters to Yards
4.Miles to Kilometers     8.Kilometers to Miles
Enter your choice: 8
15 kilometers equals 9.38 miles


 
 */

