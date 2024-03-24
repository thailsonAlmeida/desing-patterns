package proxy.estrutura;

/*3
 * A classe Proxy tem um campo de referência que aponta para um objeto do serviço. 
 * Após o proxy finalizar seu processamento (por exemplo: inicialização preguiçosa, acesso, acessar controle, colocar em cache, etc.), ele passa o pedido para o objeto do serviço.
 * Geralmente os proxies gerenciam todo o ciclo de vida dos seus objetos de serviço.
 * */
public class Proxy implements ServiceInterface {
	
	private Service realService;
	
	public Proxy(Service s) {
		this.realService = s;
	}
	
	public boolean checkAccess() {
		if(realService == null) {
			return false;
		}
		return true;
	}

	@Override
	public void operation() {
		System.out.println("Proxy:: gerenciando o serviço");
		if(checkAccess()) {
			realService.operation();
		}
	}
	
	

}
