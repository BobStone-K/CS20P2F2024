package SkillBuilders;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating array to keep ten elements which values are the same as their index
		int[] numberOrder = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//outputting countdown to let user know count down is going to be outputted
		System.out.println("Countdown");
		//outputting array in a reverse order starting from last index of nine and going down to inex 0 while printing each index's value in new line
		for (int i = 9; i >= 0; i--) {
			System.out.println(numberOrder[i]);		}
		
	}

}
