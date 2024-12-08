package SkillBuilders;
import java.util.Scanner;
public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LOW = 'A'; //smallest possible value
		 final int HIGH = 'Z'; //highest possible value
		 //letting list of letters have the same amount of elements as letters in alphabet
		 int[] letterCounts = new int[HIGH - LOW + 1];
		 Scanner input = new Scanner(System.in);
		 //variables to store phrase user enters, the letters in the phrase, and each letters index place in the array
		 String phrase;
		 char[] phraseLetters;
		 int offset; 
		 //prompting user to enter their phrase
		 System.out.print("Please enter a phrase: ");
		 //turning phrase uppercase so it's unicode is in the range of the low and high constants
		 phrase = (input.nextLine()).toUpperCase();
		 //turning each character in the phrase into a value on an array
		 phraseLetters = phrase.toCharArray();
		 //making sure the characters are letters than putting them into the main array which will be used to display how many of each letter in the phrase the user entered
		 for (char letter: phraseLetters) {
			 if(letter >= LOW && letter <= HIGH) {
				offset = letter - LOW;
				letterCounts[offset] += 1;
			 }
		 }
		 //Outputting how many of each letter is in the phrase
		 for (int i = LOW; i <= HIGH; i++ ) {
			 System.out.println((char)i + ": " + letterCounts[i - LOW]);
		 }
	}

}
