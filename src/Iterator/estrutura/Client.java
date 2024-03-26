package Iterator.estrutura;

public class Client {

	public static void main(String[] args) {
		Iterator concreteIterator = new ConcreteIterator( new ConcreteCollection());
		Iterator concreteIterator2 = new ConcreteIterator( new ConcreteCollection());
		
		concreteIterator.getNext();
		
		System.out.println(concreteIterator.hasMore());
	}

}
