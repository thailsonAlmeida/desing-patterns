package Adapter.pseudocodigo;

public class SquarePeg {
	
	private double width;
	
	public SquarePeg(double width) {
		this.width = width;
	}
	
	public SquarePeg() {}
	
	public double getWidth() {
		double result;
		result = Math.pow(this.width, 2);
		return result;
	}

}
