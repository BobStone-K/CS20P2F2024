package Mastery;
import java.util.Scanner;
public class MetricConversion {
	//Methods
	//Converts inches to Cm by taking parameter of inches and returns centimeters
	public static double inToCm(double inches) {
		
	return inches * 2.54;
	}
	//Converts feet to Cm by taking parameter of feet and returns centimeters
	public static double feetToCm(double feet) {
	
	return feet * 30.48;
	}
	//Converts yards to meters by taking parameter of yards and returns meters
	public static double ydsToM(double yards) {
	
	return yards * 0.9144;
	}
	//Converts miles to kilometers by taking parameter of kilometers and returns kilometers
	public static double mileToKm(double miles) {
	
	return miles * 1.60934;
	}
	//Converts Cm to inches by taking parameter of cm and returns inches
	public static double cmToIn(double cm) {
		
	return cm / 2.54;
	}
	//Converts Cm to feet by taking parameter of cm and returns feet
	public static double cmToFt(double cm) {
		
	return cm / 30.48;
	}
	//Converts meters to yards by taking parameter of meters and returns yards
	public static double mToYds(double meters) {
		
	return meters / 0.9144;
	}
	//converts kilometers to miles by taking parameter of kilometers and returns miles
	public static double kmToMile(double km) {
	
	return km / 1.60934;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask user to enter number of unit they want to convert and record answer
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int valueToConvert = Input.nextInt();
		//gives user options on which units to convert and record their answer
		System.out.print("1.Inches to Centimeters");
		System.out.println("   2. Feet to Centimeters");
		System.out.print("3.Yards to Meters");
		System.out.println("         4.Miles to Kilometers");
		System.out.print("5.Centimeters to Inches");
		System.out.println("   6. Centimeters to Feet");
		System.out.print("7.Meters to Yards");
		System.out.println("         8.Kilometers to Miles");
		
		System.out.print("Enter your choice: ");
		int choice = Input.nextInt();
	
		
		//will use method depending on their answer and use the amount of unit they entered first as parameter to be converted
		switch (choice) {
		
	    case 1:
	        System.out.println(valueToConvert + " inches equals " + inToCm(valueToConvert) + " centimeters");
	        break;

	    case 2:
	        System.out.println(valueToConvert + " centimeters equals " + cmToIn(valueToConvert) + " inches");
	        break;

	    case 3:
	        System.out.println(valueToConvert + " feet equals " + feetToCm(valueToConvert) + " centimeters");
	        break;

	    case 4:
	        System.out.println(valueToConvert + " centimeters equals " + cmToFt(valueToConvert) + " feet");
	        break;

	    case 5:
	        System.out.println(valueToConvert + " yards equals " + ydsToM(valueToConvert) + " meters");
	        break;

	    case 6:
	        System.out.println(valueToConvert + " meters equals " + mToYds(valueToConvert) + " yards");
	        break;

	    case 7:
	        System.out.println(valueToConvert + " miles equals " + mileToKm(valueToConvert) + " kilometers");
	        break;

	    case 8:
	        System.out.println(valueToConvert + " kilometers equals " + kmToMile(valueToConvert) + " miles");
	        break;
	}
}







}
