package SkillBuilders;

public class TestRectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating 2 boxes using rectangle class with first method and overloaded method
		RectanglePart2 box = new RectanglePart2();
		RectanglePart2 box2 = new RectanglePart2(5, 7);
		//set new length and width for first box
		box.setLength(8);
		box.setWidth(9);
		//outputs length, width, area, and perimeter for both boxes
		System.out.println("box length is " + box.getLength());
		System.out.println("box width is " + box.getWidth());
		System.out.println("box2 length is " + box2.getLength());
		System.out.println("box2 width is " + box2.getWidth());
		System.out.println("box area is " + box.area());
		System.out.println("box perimeter is " + box.perimeter());
		System.out.println("box2 area is " + box2.area());
		System.out.println("box2 perimeter is " + box2.perimeter());
		//outputs formula for area of an rectangle
		RectanglePart2.displayAreaFormula();
	}

}
