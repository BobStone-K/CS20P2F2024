package SkillBuilders;
import java.util.Scanner;
public class hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting ready to accept inputs
		Scanner Input= new Scanner(System.in);
		//prompting user to ask what number category hurricane they want to know about
		System.out.print("Please enter hurricane category you want to know about: ");
		//recording what category they want
		int hurricaneCategory = Input.nextInt();
		//output info on which hurricane category user wants to know about
		switch(hurricaneCategory) {
		case 1: System.out.print("74-95 mph or 64-82 kt or 119-153 km/hr"); break;
		case 2: System.out.print("96-110 mph or 83-95 kt or 154-177 km/hr"); break;
		case 3: System.out.print("111-130 mph or 96-113 kt or 178-209 km/hr"); break;
		case 4: System.out.print("131-155 mph or 114-135 kt or 210-249 km/hr"); break;
		case 5: System.out.print("greater than 155 mph or 135 kt or 249 km/hr"); break;
		}
				
	}

}
