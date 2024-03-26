package command.estrutura;

public class Invoker {
	
	private Command command;
	
	public void setCommand(Command setCommand) {
		this.command = setCommand;
	}
	
	public void executeCommand() {
		command.execute();
	}

}
