package desingpatterns.factorymethod.estrutura.products;

public class ConcreteProductA implements Product {
	@Override
	public void doStuff() {
		System.out.println("Sou o produto A e tenho minhas ações especificas" + (50+20));		
	}

}
