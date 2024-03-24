# Chain of Responsibility

Também conhecido como: CoR, Corrente de responsabilidade, Corrente de comando, Chain of command

**Que é padrão de projeto Chain of Responsibility?**
- É um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. 
- Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

**Quando utilizar o Chain of Responsibility?**
- Quando é esperado que seu programa processe diferentes tipos de pedidos em várias maneiras, mas os exatos tipos de pedidos e suas sequências são desconhecidos de antemão.
- Quando é essencial executar diversos handlers em uma ordem específica.
- Quando o conjunto de handlers e suas encomendas devem mudar no momento de execução.

**Como implementar o Chain of Responsibility?**
1. Declare a interface do handler e descreva a assinatura de um método para lidar com pedidos.
	- Decida como o cliente irá passar os dados do pedido para o método. 
	- A maneira mais flexível é converter o pedido em um objeto e passá-lo para o método handler como um argumento.

1. Para eliminar código padrão duplicado nos handlers concretos, pode valer a pena criar uma classe handler base abstrata, derivada da interface do handler.
	- Essa classe deve ter um campo para armazenar uma referência ao próximo handler na corrente. 
	- Considere tornar a classe imutável. Contudo, se você planeja modificar correntes no tempo de execução, você precisa definir um setter para alterar o valor do campo de referência.
	- Você também pode implementar o comportamento padrão conveniente para o método handler, que vai passar adiante o pedido para o próximo objeto a não ser que não haja mais objetos.
	- Handlers concretos irão ser capazes de usar esse comportamento ao chamar o método pai. 
	
1. Um por um crie subclasses handler concretas e implemente seus métodos handler. Cada handler deve fazer duas decisões ao receber um pedido:
	- Se ele vai processar o pedido.
	- Se ele vai passar o pedido adiante na corrente.
	
1. O cliente pode tanto montar correntes sozinho ou receber correntes pré construídas de outros objetos. 
	- Neste último caso, você deve implementar algumas classes fábrica para construir correntes de acordo com a configuração ou definições de ambiente.
	
1. O cliente pode ativar qualquer handler da corrente, não apenas o primeiro. 
	- O pedido será passado ao longo da corrente até que algum handler se recuse a passá-lo adiante ou até ele chegar ao fim da corrente.
	
1. Devido a natureza dinâmica da corrente, o cliente deve estar pronto para lidar com os seguintes cenários:
	- Devido a natureza dinâmica da corrente, o cliente deve estar pronto para lidar com os seguintes cenários:
	- Alguns pedidos podem não chegar ao fim da corrente.
	- Outros podem chegar ao fim da corrente sem terem sido tratados.
