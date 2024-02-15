package factorymethod.estrutura.creats;

import factorymethod.estrutura.products.ConcreteProductB;
import factorymethod.estrutura.products.Product;

public class ConcreteCreateB extends Create {
	@Override
	public Product createProduct() {
		return new ConcreteProductB();
	}
}
