package Mastery;

public class Num {
	//number variable which will store the integer the user enters
	private int number;
	//constructor method to create num object with variable of number which equals the parameter needed to create object
	public Num (int integer) {
		number = integer;
	}
	//accessor method returns the number variable 
	public int wholeNum() {
		return number;
	}
	//accessor method returns ones place of number
	public int onesPlace() {
		return number%10;
	}
	//accessor method returns tens place of number
	public int tensPlace() {
		return (number/10)%10;
	}
	//accessor method returns hundreds place of number
	public int hundredsPlace() {
		return (number/100)%10;
	}
	
}
