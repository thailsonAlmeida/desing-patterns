package chainofResponsibility.estrutura;

/*03
 * Handlers Concretos contém o código real para processar pedidos. 
 * Ao receber um pedido, cada handler deve decidir se processa ele e, adicionalmente, se passa ele adiante na corrente.
 * Os handlers são geralmente auto contidos e imutáveis, aceitando todos os dados necessários apenas uma vez através do construtor.
 * */

public class ConcreteHandlers extends BaseHandler {
	
	@Override
	public void handle(String request) {
		
		if(canHandle(request)) {
			
		}else {
			handle(request);
		}
		
	}

	private boolean canHandle(String request) {
		if(request == null) {
			return false;
		}
		return false;
	}

}
