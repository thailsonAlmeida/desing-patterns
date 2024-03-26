package command.estrutura;

public class Receiver {
	
	public void operation(int[] params) {
		for (int i : params) {
			i = i + i;
			System.out.print(i);
		}		
	}

}
