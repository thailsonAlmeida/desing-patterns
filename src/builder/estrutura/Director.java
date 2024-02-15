package builder.estrutura;

public class Director {
	
	
	
	public void DirectorCreateBasic(Builder builder) {
		builder.buildStepA();
	}
	
	public void DirectorCreateMedium(Builder builder) {
		builder.buildStepA();
		builder.buildStepB();
	}
	
	public void DirectorCreatePremium(Builder builder) {
		builder.buildStepA();
		builder.buildStepB();
		builder.buildStepC();
	}
	
	

}
