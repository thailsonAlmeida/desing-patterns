package chainofResponsibility.estrutura;

/*01
 * O Handler declara a interface, comum a todos os handlers concretos.
 * Ele geralmente contém apenas um único método para lidar com pedidos, 
 * mas algumas vezes ele pode conter outro método para configurar o próximo handler da corrente.
 * */
public interface Handler {
	
	public void setNext(Handler h);
	public void handle(String request);

}
