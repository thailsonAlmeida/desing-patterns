package Iterator.estrutura;

import java.util.ArrayList;
import java.util.List;

/*02
 * Iteradores Concretos implementam algoritmos específicos para percorrer uma coleção. 
 * O objeto iterador deve monitorar o progresso da travessia por conta própria. 
 * Isso permite que diversos iteradores percorram a mesma coleção independentemente de cada um.
 * */
public class ConcreteIterator implements Iterator {
	
	private List<ConcreteCollection> concreteCollections = new ArrayList<>();
	private boolean iterationState;
	
	public ConcreteIterator(){}
	
	public ConcreteIterator(ConcreteCollection setConcreteColletion) {
		concreteCollections.add(setConcreteColletion);
		this.iterationState = true;
	}

	@Override
	public void getNext(){
		System.out.print(concreteCollections.iterator());
	}

	@Override
	public boolean hasMore() {
		if(concreteCollections.isEmpty()) {
			return false;
		}
		return true;
	}

}
