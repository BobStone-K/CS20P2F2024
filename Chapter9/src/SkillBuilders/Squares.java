package SkillBuilders;
public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creaitng list to store 5 elements
		int[] indexSquares = new int[5];
		//storing the sqaure of each index's number in that index for the 5 elements
		for(int i = 0; i < 5; i++) {
			indexSquares[i] = (int) Math.pow(i, 2);
		}
		
		
		//printing out every element's index's value which is the index number squared
		for(int i = 0; i < 5; i++) {
			System.out.println("Sqaure of index " + i + ": " + indexSquares[i]);
		}
	}

}
