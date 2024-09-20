package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Getting ready to record user inputs
		Scanner Input = new Scanner(System.in);
		//Getting decimal format ready to format percentages
		DecimalFormat formatter = new DecimalFormat("#.##");
		//declaring needed variables
		int trumpNYVotes, kamalaNYVotes, trumpNJVotes, kamalaNJVotes, trumpConVotes, kamalaConVotes;
		int trumpTotVotes, kamalaTotVotes, totVotes;
		double trumpPer, kamalaPer;
		//prompting user for votes in each state and recording them
		System.out.print("Please enter amount of Votes Trump got in New York: ");
		trumpNYVotes = Input.nextInt();
		System.out.print("Please enter amount of Votes Kamala got in New York: ");
		kamalaNYVotes = Input.nextInt();
		System.out.print("Please enter amount of Votes Trump got in New Jersey: ");
		trumpNJVotes = Input.nextInt();
		System.out.print("Please enter amount of Votes Kamala got in New Jersey: ");
		kamalaNJVotes = Input.nextInt();
		System.out.print("Please enter amount of Votes Trump got in Connecticut: ");
		trumpConVotes = Input.nextInt();
		System.out.print("Please enter amount of Votes Kamala got in Connecticut: ");
		kamalaConVotes = Input.nextInt();
		//add up all the votes to get each candidates total from the three states
		trumpTotVotes = trumpNYVotes + trumpNJVotes + trumpConVotes;
		kamalaTotVotes = kamalaNYVotes + kamalaNJVotes + kamalaConVotes;
		//Add totals of both candidates to get total votes
		totVotes = trumpTotVotes + kamalaTotVotes;
		//get the percentage of votes each candidate got out of total votes
		trumpPer = (Double.valueOf(trumpTotVotes)/Double.valueOf(totVotes)) * 100;
		kamalaPer = (Double.valueOf(kamalaTotVotes)/Double.valueOf(totVotes)) * 100 ;
		//outputting each candidates total votes, their percentage, and the total votes
		System.out.println("Election results for New York:");
		System.out.println("Trump: " + trumpNYVotes);
		System.out.println("Kamala: " + kamalaNYVotes);
		System.out.println("Election results for New Jersey:");
		System.out.println("Trump: " + trumpNJVotes);
		System.out.println("Kamala: " + kamalaNJVotes);
		System.out.println("Election results for Conneticut:");
		System.out.println("Trump: " + trumpConVotes);
		System.out.println("Kamala: " + kamalaConVotes);
		//outputting each candidates total votes, their percentage, and the total votes
		System.out.println("Candidate     Votes  Percentage");
		System.out.println("Trump:        " + trumpTotVotes + "    "+ formatter.format(trumpPer) + "%");
		System.out.println("Kamala:       " + kamalaTotVotes + "   "+ formatter.format(kamalaPer) + "%");
		System.out.println("TOTAl VOTES:   " + totVotes);
		
		
		
	}

}