package SkillBuilders;

public class TestCircle1 {

	public static void main(String[] args) {
		//creating circle object
		CirclePart1 spot = new CirclePart1();
		//changing radius of circle object and outputting its area and circumference
		spot.setRadius(6);
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
	}

}
