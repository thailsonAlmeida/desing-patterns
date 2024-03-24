package flyweight.estrutura;

public class FlyweightFactory {
	private Flyweight[] cache;
	
	public Flyweight getFlyweight(int repeatingState) {
		if(cache[repeatingState] == null) {
			cache[repeatingState] = new Flyweight(repeatingState);
		}
		return cache[repeatingState];
	}

}
