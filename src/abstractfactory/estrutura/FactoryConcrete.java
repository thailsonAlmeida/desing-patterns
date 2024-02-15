package abstractfactory.estrutura;

public class FactoryConcrete implements FactoryAbstract {

	@Override
	public ProductConcrete createProduct() {		
		return new ProductConcrete();
	}

}
