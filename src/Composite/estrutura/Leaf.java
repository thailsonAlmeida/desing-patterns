package Composite.estrutura;

//02

/*
 * componentes folha acabam fazendo boa parte do verdadeiro trabalho, uma vez que não tem mais ninguém para delegá-lo.
 * */
public class Leaf implements Component {

	@Override
	public void execute() {
		System.out.println("Executando o trabalho!");		
	}

}
