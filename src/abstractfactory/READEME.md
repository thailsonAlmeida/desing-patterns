# Abstract Factory
** O que o abstract factory permite?
- Produzir familias de objetos relacionados sem ter que especificar suas classes concretas.
- Fornece a você uma interface para a criação de objetos de cada classe das famílias de produtos.

** Quando usar o abstract factory? **
- Quando seu código precisa trabalhar com diversas famílias de produtos relacionados.
- Quando você tem uma classe com um conjunto de métodos fábrica que desfoquem sua responsabilidade principal.

** O que fazer quando uma classe lida com multiplos tipos de produtos? **
- pode valer a pena extrair seus métodos fábrica em uma classe fábrica solitária 
- ou uma implementação plena do Abstract Factory.

## Como implementar?

1. Mapeie uma **matriz de tipos de produtos** distintos versus as variantes desses produtos.
1. Declare interfaces de **produto abstratas** para todos os tipos de produto. 
	- Faça todas as classes concretas de produtos implementar essas interfaces.

1. Declare a interface da **fábrica abstrata** com um conjuntos de métodos de criação para todos os produtos abstratos.

1. Implemente um conjunto de **classes fábricas concretas**, uma para cada variante de produto.

1. Crie um código de **inicialização da fábrica** em algum lugar da aplicação. 
	- Ele deve instanciar uma das classes fábrica concretas, dependendo da configuração da aplicação ou do ambiente atual. 
	- Passe esse objeto fábrica para todas as classes que constroem produtos.

1. Escaneie o código e encontre todas as chamadas diretas para construtores de produtos. 
	- Substitua-as por chamadas para o método de criação apropriado no objeto fábrica.