package factorymethod.estrutura.creats;

import factorymethod.estrutura.products.ConcreteProductA;
import factorymethod.estrutura.products.Product;

public class ConcreteCreateA extends Create {
	@Override
	public Product createProduct() {
		return new ConcreteProductA();
	}
}
