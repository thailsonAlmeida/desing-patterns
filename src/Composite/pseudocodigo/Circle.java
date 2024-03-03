package Composite.pseudocodigo;

public class Circle extends Dot {
	private double radius;
	
	public Circle() {}
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
