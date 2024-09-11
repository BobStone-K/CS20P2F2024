package SkillBuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{	
		Scanner UserInput = new Scanner(System.in);
		//Declaration and Initialization
		System.out.print("Please enter a length vaule: ");
		int length = UserInput.nextInt();
		System.out.print("Please enter a width vaule: ");
		int width = UserInput.nextInt();
		int perimeter = 2*(length + width);
		
		System.out.print("The perimeter of the rectangle is: "+ perimeter);
	}

}
