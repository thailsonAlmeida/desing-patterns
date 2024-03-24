package flyweight.estrutura;

public class Context {
	private int uniqueState;
	private Flyweight flyweight;
	private FlyweightFactory factory;
	
	public Context(int repeatingState, int uniqueState) {
		this.uniqueState = uniqueState;
		this.flyweight = factory.getFlyweight(repeatingState);		
	}
	
	public void operation() {
		flyweight.operation(this.uniqueState);
	}

}
