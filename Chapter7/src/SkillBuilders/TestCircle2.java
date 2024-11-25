package SkillBuilders;

public class TestCircle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating two new circle object uses overloaded constructor method
		CirclePart2 spot = new CirclePart2();
		CirclePart2 spot1 = new CirclePart2(3);
		//setting first circle objects radius to new radius
		spot.setRadius(6);
		//outputting area and circumference of both circle objects
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
		System.out.println("Circle radius: " + spot1.area());
		System.out.println("Circle circumference: " + spot1.circumference());
	}

}
