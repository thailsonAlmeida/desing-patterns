package factorymethod.estrutura.creats;

import factorymethod.estrutura.products.Product;

public abstract class Create {	
	Product prod = createProduct();
	
	public void someOperation() {
		System.out.println("Está é uma lógica da classe create");
		prod.doStuff();
	}
	
	public abstract Product createProduct();

}
