package chainofResponsibility.estrutura;

/*02
 * O Handler Base é uma classe opcional onde você pode colocar o código padrão que é comum a todas as classes handler.
 * Geralmente, essa classe define um campo para armazenar uma referência para o próximo handler. 
 * Os clientes podem construir uma corrente passando um handler para o construtor ou setter do handler anterior.
 * A classe pode também implementar o comportamento padrão do handler: pode passar a execução para o próximo handler após checar por sua existência.
 * */
public class BaseHandler implements Handler {
	private Handler next;

	@Override
	public void setNext(Handler h) {
		this.next = h;
	}

	@Override
	public void handle(String request) {
		if(next != null) {
			next.handle(request);
		}
		
	}	

}
