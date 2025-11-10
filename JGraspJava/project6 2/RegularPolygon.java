package project6;

/*
Excercise 9.9
   Project 6
   CS130 - Introduction to JAVA 
   Fatai D. Sule

*/
public class RegularPolygon {
	// class fields 
	private int n;
	private double side;
	private double x;
	private double y;

	//Constructor1 with default values  
	RegularPolygon() {
		n = 3;
		side = 1;
		x = y = 0;
	}
   
   // constructor2 with x and y coordinates at 0
	RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
		x = y = 0;
	}

	// constructor3 
   RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}

	// mutator number of sides
	public void setN(int newN) {
		n = newN;
	}

	// mutator length of sides 
	public void setSide(double newSide) {
		side = newSide;
	}

	// mutator x-coordinate 
	public void setX(double newX) {
		x = newX;
	}

	  // mutator y-coordinate
	public void setY(double newY) {
		y = newY;
	}

	 // accessor number of sides
	public int getN() {
		return n;
	}

	// accessor length of the side
	public double getSide() {
		return side;
	}

	// accessor x-coordinate 
	public double getX() {
		return x;
	}

	// accessor y-coordinate 
	public double getY() {
		return y;
	}

	// accessor perimeter of polygon
	public double getPerimeter() {
		return side * n;
	}

	// accessor area 
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}
