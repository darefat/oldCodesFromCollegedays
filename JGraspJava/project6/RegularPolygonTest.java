package project6;

/*
Excercise 9.9Test
   Project 6
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/


public class RegularPolygonTest {
	/** Main method */
	public static void main(String[] args) {
		// Create three RegularPolygon objects
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

		// Display perimeter and area of each object
		
		System.out.println("A regular polygon with " + regularPolygon1.getPerimeter() + " has an Area "
      + regularPolygon1.getArea());
      System.out.println("A regular polygon with " + regularPolygon2.getPerimeter() + " has an Area "
      + regularPolygon2.getArea());
      System.out.println("A regular polygon with " + regularPolygon3.getPerimeter() + " has an Area "
      + regularPolygon3.getArea());


		
  	}
}