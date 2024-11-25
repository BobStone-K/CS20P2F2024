package SkillBuilders;

public class TestCircle3 {

	public static void main(String[] args) {
		//creating two new circle object uses overloaded constructor method
		CirclePart3 spot = new CirclePart3();
		CirclePart3 spot1 = new CirclePart3(3);
		//setting first circle objects radius to new radius
		spot.setRadius(6);
		//outputting area and circumference of both circle objects
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
		System.out.println("Circle radius: " + spot1.area());
		System.out.println("Circle circumference: " + spot1.circumference());
		//outputting formula for the area of circle using class method
		CirclePart3.displayAreaFormula();

	}

}
