package Composite.estrutura;

import java.util.ArrayList;
import java.util.List;

//03

/*
 * O Contêiner (ou composite) é o elemento que tem sub-elementos: folhas ou outros contêineres. 
 * Um contêiner não sabe a classe concreta de seus filhos. 
 * Ele trabalha com todos os sub-elementos apenas através da interface componente. 
 * 
 * Ao receber um pedido, um contêiner delega o trabalho para seus sub-elementos, 
 * processa os resultados intermediários, 
 * e então retorna o resultado final para o cliente.
 * */
public class Composite {
	private List<Component> children = new ArrayList<Component>();
	
	public void add(Component c) {
		children.add(c);
	}
	
	public void remove(Component c) {
		children.remove(c);
	}
	
	public List<Component> getChildren(){
		return children;
	}
	
	public void execute() {
		System.out.println("Delega para os componentes filhos");
	}

}
