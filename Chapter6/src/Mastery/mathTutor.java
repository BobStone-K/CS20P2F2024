package Mastery;
import java.text.DecimalFormat;
import java.util.Scanner;
public class mathTutor {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        // Create a Scanner object to take input from the user
	        Scanner Input = new Scanner(System.in);
	
	        // Create a DecimalFormat object to format answers to two decimal places
	        DecimalFormat formatter = new DecimalFormat("#.##");
	// Generate two random numbers between 1 and 10 
	int randNum1 = (int)(((10 - 1 + 1)*Math.random()) + 1);
	int randNum2 = (int)(((10 - 1 + 1)*Math.random()) + 1);
	
	// Set the operation type (1: +, 2: -, 3: *, 4: /) - currently always division
	int randOpNum = (int)(((4 - 1 + 1)*Math.random()) + 1);
	
	double answer, userAns;  
	 
	
	// Use a switch statement to choose the operation based on randOpNum
	switch(randOpNum) {
	    // Case 1: Addition
	    case 1: 
	        // Calculate sum
	        answer = randNum1 + randNum2;  
	        //Prompt user for their answer then record what they input
	        System.out.print("What is " + randNum1 + " + " + randNum2 + ": ");
	        userAns = Input.nextInt();  
	        
	        // Check if the user's answer is correct
	        if (userAns == answer) {
	            System.out.print("correct");
	        } else {
	            System.out.print("Incorrect");
	        }
	        break;
	
	    // Case 2: Subtraction
	    case 2: 
	        // Calculate difference
	        answer = randNum1 - randNum2;  
	        //Prompt user for their answer then record what they input
	        System.out.print("What is " + randNum1 + " - " + randNum2 + ": ");
	        userAns = Input.nextInt();  
	        
	        // Check if the user's answer is correct
	        if (userAns == answer) {
	            System.out.print("correct");
	        } else {
	            System.out.print("Incorrect");
	        }
	        break;
	
	    // Case 3: Multiplication
	    case 3: 
	        // Calculate product
	        answer = randNum1 * randNum2;  
	        //Prompt user for their answer then record what they input
	        System.out.print("What is " + randNum1 + " * " + randNum2 + ": ");
	        userAns = Input.nextInt();  
	        
	        // Check if the user's answer is correct
	        if (userAns == answer) {
	            System.out.print("correct");
	        } else {
	            System.out.print("Incorrect");
	        }
	        break;
	
	    // Case 4: Division
	    case 4: 
	        // Calculate quotient with division of two numbers as double values
	        answer = (((Double.valueOf(randNum1) / Double.valueOf(randNum2))));
	
	        // Format the correct answer to two decimal places
	        String formatAns = formatter.format(answer);
	
	        // Ask the user for the quotient and remind them to round to hundredth place
	        System.out.print("What is " + randNum1 + " / " + randNum2 + " Please answer to the hundredth or tenth place rounded if needed: ");
	        userAns = Input.nextDouble();  
	
	        // Format the user's answer to two decimal places
	        String formattedUserAns = formatter.format(userAns);
	        
	        // Compare correct answer with  user answer
	        if (formattedUserAns.equals(formatAns)) {
	            System.out.print("correct");
	        } else {
	            System.out.print("Incorrect");
	        }
	        break;
			
		
		
		}
		
	}

}
