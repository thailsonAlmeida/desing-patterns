package desingpatterns.factorymethod.estrutura.creats;

import desingpatterns.factorymethod.estrutura.products.ConcreteProductB;
import desingpatterns.factorymethod.estrutura.products.Product;

public class ConcreteCreateB extends Create {
	@Override
	public Product createProduct() {
		return new ConcreteProductB();
	}
}
