
package Mastery;
import java.text.DecimalFormat;
public class PiggyBank {
	//bank variable which will store all the money the user has and adds
		private double bank;
		private DecimalFormat formatter = new DecimalFormat("#.##");
		//constructor method to create piggy bank giving bank a value of zero
		public PiggyBank() {
			bank = 0;
		}
		//accessor method will return value of bank as value of money in the piggy bank
		public double showBalance() {
			return Double.parseDouble(formatter.format(bank));
			
		}
		// method to add dollar value of a penny to piggy bank
		public void addPenny() {
			bank += 0.01;
		}
		// method to add dollar value of a nickel to piggy bank
		public void addNickel() {
			bank += 0.05;
		}
		// method to add dollar value of a dime to piggy bank
		public void addDime() {
			bank += 0.10;
		}
		// method to add dollar value of a quarter to piggy bank
		public void addQuarter() {
			bank += 0.25;
		}
		// method to take out money from bank with a parameter of how much to take out
		public String takeMoney(double money) {
			//checking if balance of piggy bank has enough to take out how much money the user wants to
			if (bank >= money) {
				bank -= money;
				return ("Money has been taken out");
			} else {
				return("There is not enough money in the bank to take out that much");
			}
			
		}
}
