package Composite.pseudocodigo;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic {
	List<Graphic> children = new ArrayList<>();
	
	public void add(Graphic child) {
		children.add(child);
	}
	
	public void remove(Graphic child) {
		children.remove(child);
	}
	
	public void move(double x, double y) {
		System.out.println("Movendo");		
	}
	
	public void drae() {
		System.out.println("Desenhando");
	}
}
