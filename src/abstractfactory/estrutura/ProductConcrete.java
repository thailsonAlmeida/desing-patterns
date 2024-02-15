package abstractfactory.estrutura;

public class ProductConcrete implements ProductAbstract {

	@Override
	public void move() {
		System.out.println("Product moving");		
	}
	
	@Override
	public void on() {
		System.out.println("Turn on");	
	}
	
	@Override
	public void off() {
		System.out.println("Turn off");	
	}

}
