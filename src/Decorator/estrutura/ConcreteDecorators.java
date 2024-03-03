package Decorator.estrutura;


/*04
 * 
 * Os Decoradores Concretos definem os comportamentos adicionais que podem ser adicionados aos componentes dinamicamente. 
 * Os decoradores concretos sobrescrevem métodos do decorador base e executam seus comportamentos tanto antes como depois de chamarem o método pai.
 * 
 * */


public class ConcreteDecorators extends BaseDecorator {

	public ConcreteDecorators(Component c) {
		super(c);
	}
	
	@Override
	public void execute() {
		System.out.println("ConcreteDecorators. ");
	}
	
	public void extra() {
		System.out.println("Extra. ConcreteDecorators. ");
	}

}
