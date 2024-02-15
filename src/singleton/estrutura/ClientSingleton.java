package singleton.estrutura;

public class ClientSingleton {
	
	public static void main(String[] args) {
		
		Singleton hp = Singleton.getInstance("HP");
		Singleton epson = Singleton.getInstance("Epson");
		
		System.out.println(hp);
		System.out.println(epson);
		
	}

}
