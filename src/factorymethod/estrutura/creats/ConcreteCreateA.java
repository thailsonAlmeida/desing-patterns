package desingpatterns.factorymethod.estrutura.creats;

import desingpatterns.factorymethod.estrutura.products.ConcreteProductA;
import desingpatterns.factorymethod.estrutura.products.Product;

public class ConcreteCreateA extends Create {
	@Override
	public Product createProduct() {
		return new ConcreteProductA();
	}
}
