package desingpatterns.factorymethod.estrutura.products;

public class ConcreteProductB implements Product {
	@Override
	public void doStuff() {
		System.out.println("Sou o produto B e tenho minhas ações especificas" + (90-25));		
	}

}
