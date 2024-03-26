# ITERATOR

Também conhecido como: Iterador

**Que é o padrão de projeto Iterator?**
- é um padrão de projeto comportamental
- permite a você percorrer elementos de uma coleção sem expor as representações dele (lista, pilha, árvore, etc.)
- A ideia principal do padrão Iterator é extrair o comportamento de travessia de uma coleção para um objeto separado chamado um iterador.

**Quando utilizar o iterator?**
- quando sua coleção tiver uma estrutura de dados complexa por debaixo dos panos, mas você quer esconder a complexidade dela de seus clientes (seja por motivos de conveniência ou segurança).
- Utilize o padrão para reduzir a duplicação de código de travessia em sua aplicação.
- quando você quer que seu código seja capaz de percorrer diferentes estruturas de dados ou quando os tipos dessas estruturas são desconhecidos de antemão.

**Como implementar?**
1. Declare a interface do iterador.
	- Ao mínimo, ela deve ter um método para buscar o próximo elemento de uma coleção. 
	-  Mas por motivos de conveniência você pode adicionar alguns outros métodos, tais como recuperar o elemento anterior, saber a posição atual, e checar o fim da iteração.
	
1. Declare a interface da coleção e descreva um método para buscar iteradores. 
	- O tipo de retorno deve ser igual à interface do iterador. 
	- Você pode declarar métodos parecidos se você planeja ter grupos distintos de iteradores.
	
1. Implemente classes iterador concretas para as coleções que você quer percorrer com iteradores. 
	- Um objeto iterador deve ser ligado com uma única instância de coleção. 
	- Geralmente esse link é estabelecido através do construtor do iterador.
	
1. Implemente a interface da coleção na suas classes de coleção. 
	- A ideia principal é fornecer ao cliente com um atalho para criar iteradores, customizados para uma classe coleção em particular. 
	-  O objeto da coleção deve passar a si mesmo para o construtor do iterador para estabelecer um link entre eles.
	
1. Vá até o código cliente e substitua todo o código de travessia de coleção com pelo uso de iteradores.
	- O cliente busca um novo objeto iterador a cada vez que precisa iterar sobre os elementos de uma coleção.

