package command.estrutura;

public class ConcreteCommand1 implements Command {
	
	private Receiver receiver;
	private int[] params;
	
	public void command1(Receiver setReceiver, int[] setParams) {
		this.receiver = setReceiver;
		this.params = setParams;
	}

	@Override
	public void execute() {	
		receiver.operation(params);
	}
	
	

}
