package flyweight.estrutura;

public class Flyweight {
	private int repeatingState;
	
	public Flyweight(int repeatingState){
		this.repeatingState = repeatingState;
	}
	
	public void operation(int uniqueState) {
		System.out.print("Operation: " + uniqueState + this.repeatingState);
		
	}
}
