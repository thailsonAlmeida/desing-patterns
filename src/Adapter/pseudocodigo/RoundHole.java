package Adapter.pseudocodigo;

public class RoundHole {
	
	private int radius;
	
	public RoundHole(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public Boolean fits(RoundPeg peg) {
		boolean result;
		result = (this.getRadius() >= peg.getRadius());
		return result;
	} 

}
