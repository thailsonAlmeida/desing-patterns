package Decorator.estrutura;

/*02
 * 
 * O Componente Concreto é uma classe de objetos sendo envolvidos. 
 * Ela define o comportamento básico, que pode ser alterado por decoradores.
 * 
 * */

public class ConcreteComponent implements Component {

	@Override
	public void execute() {
		System.out.println("ConcreteComponent. ");
	}

}
