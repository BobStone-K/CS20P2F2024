/*

Program: Palindrome.java          Last Date of this Revision: December 7, 2024

Purpose:Create a Palindrome application that prompts the user for a string and then displays a message
indicating whether or not the string is a palindrome.

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 20
 
*/
package Mastery;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		//creating scanner object to record users input
		Scanner input = new Scanner(System.in);
		//creatiing variables to store users phrase and an array to store all the character of the phrase individually.
		String phrase;
		char[] phraseLetters;
		//used to keep track of whether the phrase is a palindrome or not
		boolean isPalindrome = true;
		//prompting user to enter their phrase
		System.out.print("Please enter your phrase: ");
		//turning all the letters in the phrase to lower case so it is easier when we have to check if the reverse of the phrase is the same as the normal version
		phrase = (input.nextLine()).toLowerCase();
		//getting rid of all the spaces to make it so program doesn't make a mistake when comparing same letter but ones is lower case and the other is upper case when checking every character with its counter part when reversed.
		phrase = phrase.replaceAll("[^a-z]", "");
		//puting each character of the phrase into it's own element in an array
		phraseLetters = phrase.toCharArray();
		//checking if phrase is palindrome by checking if each character equals its counter part if the word was reversed.
		for(int i = 0; i < phraseLetters.length; i++) {
			//is one character doesn't equal its reversed counterpart than the variable made from becomes false
			if(phraseLetters[i] != phraseLetters[phraseLetters.length - i-1]) {
				isPalindrome = false;
			}
	}
		//if the variable made to keep track of whether the phrase is a palindrome is false then will output the phrase isn't a palindrome
		if (isPalindrome == false) {
			System.out.print("Your phrase is not a palindrome");
		} else { //if the variable is true than will output that the phrase is a palindrome
			System.out.print("Your phrase is a palindrome");
		}

}
}

/* Screen Dump
test case 1:
Please enter your phrase: Never odd or even
Your phrase is a palindrome

test case 2:
Please enter your phrase: hey
Your phrase is not a palindrome
 
 */