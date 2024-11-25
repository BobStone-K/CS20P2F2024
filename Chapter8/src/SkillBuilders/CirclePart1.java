package SkillBuilders;

public class CirclePart1 {

	private double radius;
	private static final double PI = 3.14;
	
		public CirclePart1() { //constructor method
			radius = 1;
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
