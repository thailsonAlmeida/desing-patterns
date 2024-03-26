package Iterator.estrutura;

/*01
 * A interface Iterador declara as operações necessárias para percorrer uma coleção: 
 * buscar o próximo elemento, pegar a posição atual, recomeçar a iteração, etc.
 * */

interface Iterator {
	public void getNext();
	public boolean hasMore();
}
