package Mastery;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class quadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // got decimal format and input recorder ready
        DecimalFormat formatter = new DecimalFormat("#.##");
       Scanner Input = new Scanner(System.in); 
       //declared variables like values user will input and roots
        int valA, valB, valC;
        double root1, root2;
        //prompted user for values from a to c and recording them
        System.out.print("Please enter value for a: ");
        valA = Input.nextInt();
        System.out.print("Please enter value for b: ");
        valB = Input.nextInt();
        System.out.print("Please enter value for c: ");
        valC = Input.nextInt();
        //calculated both roots from values given
        root1 = (-valB + Math.sqrt(Math.pow(valB, 2) - (4*valA*valC)))/(2*valA);
        root2 = (-valB - Math.sqrt(Math.pow(valB, 2) - (4*valA*valC)))/(2*valA);
        //outputs value of roots calculated
        System.out.print("The roots are " + formatter.format(root1) + " and " + formatter.format(root2));
       
	}

}
