# COMMAND

Também conhecido como: Comando, Ação, Action, Transação, Transaction

**Que é padrão de projeto COMMAND?**
- É um padrão de projeto comportamental.
- Transforma um pedido em um objeto independente que contém toda a informação sobre o pedido.

**Quando utilizar?**
- quando você quer parametrizar objetos com operações.
- quando você quer colocar operações em fila, agendar sua execução, ou executá-las remotamente.
- quando você quer implementar operações reversíveis.

**Como implementar?**
1. Declare a interface comando com um único método de execução.

1. Comece extraindo pedidos para dentro de classes concretas comando que implementam a interface comando. 
	- Cada classe deve ter um conjunto de campos para armazenar os argumentos dos pedidos junto com uma referência ao objeto destinatário real. 
	- Todos esses valores devem ser inicializados através do construtor do comando.
	
1. Identifique classes que vão agir como remetentes. 
	- Adicione os campos para armazenar comandos nessas classes. 
	- Remetentes devem sempre comunicar-se com seus comandos através da interface comando. 
	- Remetentes geralmente não criam objetos comando por conta própria, mas devem obtê-los do código cliente.
	
1. Mude os remetentes para que executem o comando ao invés de enviar o pedido para o destinatário diretamente.

1. O cliente deve inicializar objetos na seguinte ordem:
	- Crie os destinatários.
	- Crie os comandos, e os associe com os destinatários se necessário.
	- Crie os remetentes, e os associe com os comandos específicos.