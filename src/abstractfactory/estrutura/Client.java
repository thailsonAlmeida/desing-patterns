package abstractfactory.estrutura;

public class Client {	
	public static void main(String[] args) {
		FactoryAbstract factory = new FactoryConcrete();
		ProductAbstract chair;
				
		chair = factory.createProduct();
		chair.move();
		chair.on();
		chair.off();
		
		
		
	}
}

