package chainofResponsibility.estrutura;

/*04
 * O Cliente pode compor correntes apenas uma vez ou compô-las dinamicamente, dependendo da lógica da aplicação.
 * Note que um pedido pode ser enviado para qualquer handler na corrente—não precisa ser ao primeiro.
 * */
public class Client {

	public static void main(String[] args) {
		Handler h1 = new BaseHandler();
		h1.setNext(h1);
		h1.handle(null);

	}

}
