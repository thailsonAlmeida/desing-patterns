# Flyweight

**Que é o padrão de projeto Flyweight?**
- É estrutural.

**Que o PDP flyweight permite?**
- Colocar mais objetos na quantidade de RAM disponível ao compartilhar partes comuns de estado entre os múltiplos objetos ao invés de manter todos os dados em cada objeto.

**Quando utilizar o flyweight?**
- Apenas quando seu programa deve suportar um grande número de objetos que mal cabem na RAM disponível.

**Quando o flyweight é mais útil?**
- uma aplicação precisa gerar um grande número de objetos similares

**Como implementar o flyweight?**
1. Divida os campos de uma classe que irá se tornar um flyweight em duas partes:

	- o estado intrínseco: os campos que contém dados imutáveis e duplicados para muitos objetos
	- o estado extrínseco: os campos que contém dados contextuais únicos para cada objeto

1. Deixe os campos que representam o estado intrínseco dentro da classe, mas certifique-se que eles sejam imutáveis. Eles só podem obter seus valores iniciais dentro do construtor.

1. Examine os métodos que usam os campos do estado extrínseco. Para cada campo usado no método, introduza um novo parâmetro e use-o ao invés do campo.

1. Opcionalmente, crie uma classe fábrica para gerenciar o conjunto de flyweights. Ela deve checar por um flyweight existente antes de criar um novo. Uma vez que a fábrica está rodando, os clientes devem pedir flyweights apenas através dela. Eles devem descrever o flyweight desejado ao passar o estado intrínseco para a fábrica.

1. O cliente deve armazenar ou calcular valores para o estado extrínseco (contexto) para ser capaz de chamar métodos de objetos flyweight. Por conveniência, o estado extrínseco junto com o campo de referência flyweight podem ser movidos para uma classe de contexto separada.

