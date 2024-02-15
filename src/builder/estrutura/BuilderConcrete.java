package builder.estrutura;

public class BuilderConcrete implements Builder {
	
	private Product1 result() {
		return new Product1();
	}
	
	@Override
	public void reset() {
		new Product1();
		System.out.println(".... resetado");
	}

	@Override
	public void buildStepA() {
		System.out.println(".... buildStepA");
	}

	@Override
	public void buildStepB() {
		System.out.println(".... buildStepB");
	}

	@Override
	public void buildStepC() {
		System.out.println(".... buildStepC");
	}
	
	public Product1 getResult() {
		return result();
	}

}
