package SkillBuilders;

public class CirclePart2 {

	private double radius;
	private static final double PI = 3.14;
	
		public CirclePart2() { //constructor method
			radius = 1;
		}
		public CirclePart2(double r) { //constructor method
			radius = r;
		}
		public void setRadius(double newRadius) { //modifier method to change radius of circle object
			radius = newRadius;
		}
		
		public double area(){ //method that returns area of the circle object using its radius
			return(radius * radius * PI);
		}
		
		public double getRadius() { // Accessor method for radius
			 return(radius);
		}
		
		public double circumference(){ //method that returns area of the circle object using its radius
			return(radius * 2 * PI);
		}

}
