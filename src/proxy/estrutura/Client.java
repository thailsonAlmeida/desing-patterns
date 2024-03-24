package proxy.estrutura;

public class Client {

	public static void main(String[] args) {
		Service service = new Service();
		ServiceInterface serviceInterfaceProxy = new Proxy(service);
		
		serviceInterfaceProxy.operation();

	}

}
