package Decorator.estrutura;

/*03
 * 
 * A classe Decorador Base tem um campo para referenciar um objeto envolvido. 
 * O tipo do campo deve ser declarado assim como a interface do componente para que possa conter ambos os componentes concretos e os decoradores. 
 * O decorador base delega todas as operações para o objeto envolvido.
 * 
 * */

public class BaseDecorator implements Component {
	protected Component wrappee;
	
	public BaseDecorator(Component c) {
		this.wrappee = c;
	}

	@Override
	public void execute() {
		wrappee.execute();
	}
}
