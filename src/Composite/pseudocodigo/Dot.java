package Composite.pseudocodigo;

public class Dot implements Graphic {
	protected double x;
	protected double y;
	
	public Dot() {}
	
	public Dot(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.println("Desenhando");		
	}
	

}
