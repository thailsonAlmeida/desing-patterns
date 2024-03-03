package Decorator.estrutura;

public class Client {
	
	public static void main(String[] args) {
		Component a = new ConcreteComponent();
		Component b = new ConcreteDecorators(a);
		Component c = new ConcreteDecorators(b);
		
		c.execute();
		
	}

}
