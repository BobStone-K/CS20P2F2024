package SkillBuilders;

public class SpanishNumbers {

	//method that returns a Spanish number up to ten corresponding to the number it is provided via parameter
	public static String spanishConvert(int num) {
		String[] spanishNums = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
		
		return spanishNums[num];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// loops through numbers one and 10 and inserts them into the method
		for(int i = 0; i <= 9; i++) {
			//prints out every number from one to ten as it is inserted into the method
			System.out.println((i + 1) + ": " + spanishConvert(i));
		}

	}

}
