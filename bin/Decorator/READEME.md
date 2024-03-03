# DECORATOR

**O que é o DP Decorator?**
- Permite que acople novos comportamentos para objetos ao colocá-los dentro de invólucros de objetos que contém os comportamentos.

**Quando utilizar o DP Decorator?**
- Quando for necessario projetar comportamentos adicionais para objetos em tempo de execução sem quebrar o código que usa esses objetos
- Quando for complicado estender o comportamento de um objeto usando herança

**Como implementar o DP Decorator?**
1. Certifique-se que seu domínio de negócio pode ser representado como um componente primário com múltiplas camadas opcionais sobre ele.

1. Descubra quais métodos são comuns tanto para o componente primário e para as camadas opcionais. 
	- Crie uma interface componente e declare aqueles métodos ali.

1. Crie uma classe componente concreta e defina o comportamento base nela.

1. Crie uma classe decorador base. 
	- Ela deve ter um campo para armazenar uma referência ao objeto envolvido.
	- O campo deve ser declarado com o tipo da interface componente para permitir uma ligação entre os componentes concretos e decoradores. 
	- O decorador base deve delegar todo o trabalho para o objeto envolvido.

1. Certifique-se que todas as classes implementam a interface componente.

1. Crie decoradores concretos estendendo-os a partir do decorador base. 
	- Um decorador concreto deve executar seu comportamento antes ou depois da chamada para o método pai (que sempre delega para o objeto envolvido).

1. O código cliente deve ser responsável por criar decoradores e compô-los do jeito que o cliente precisa.
