package Composite.estrutura;

//04

/*
 * O Cliente trabalha com todos os elementos através da interface componente. 
 * Como resultado, o cliente pode trabalhar da mesma forma tanto com elementos simples como elementos complexos da árvore.
 * */

public class Client {
	
	public static void main(String[] args) {
			
		Component componentLeaf = new Leaf();
		componentLeaf.execute();
		
		Composite composite = new Composite();
		composite.add(componentLeaf);
		composite.execute();
		
		System.out.print(composite.getChildren());
		
	}
	
}
