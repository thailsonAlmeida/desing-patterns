package builder.estrutura;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		BuilderConcrete builderConcrete = new BuilderConcrete();
		
		director.DirectorCreateBasic(builderConcrete);
		
		Product1 product1 = builderConcrete.getResult();
		System.out.println("Produto criado: " + product1);

	}

}
