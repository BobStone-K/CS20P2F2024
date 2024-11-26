package SkillBuilders;
import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numStudents;
		System.out.print("Please enter how many students are in the class: ");
		numStudents = input.nextInt();
		String[] students = new String[numStudents + 1];
		for(int i = 1; i<= numStudents; i++) {
			System.out.print("Please enter student " + i + "'s name: ");
			students[i] = input.next();
		}
		
		
	}

}
