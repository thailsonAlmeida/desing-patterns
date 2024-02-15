package singleton.estrutura;

public class Singleton {	
		
	private static Singleton singletonInstance;
	public String name;
	
	private Singleton(String name) {
		this.name = name;
	}
	
	public static Singleton getInstance(String name) {
		if(singletonInstance == null) {
			singletonInstance = new Singleton(name);
		}
		return singletonInstance;
	}

}
