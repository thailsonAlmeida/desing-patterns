**O que é o Factory Method?**
- é um padrão criacional de projeto 
	
**O que o factory method fornece?**
- Uma interface para criar objetos em uma superclasse, 
- Permite que as subclasses alterem o tipo de objetos que serão criados.
	
**O que o padrão Factory Method sugere?**
- substituir chamadas diretas de construção de objetos (usando o operador new) por chamadas para um método fábrica especial. 

**Como são chamados os objetos retornados por um método fábrica?**
- produtos.

**Qual limitação a subclasse do factory method**
- as subclasses só podem retornar tipos diferentes de produtos se esses produtos tiverem uma classe ou interface base em comum. 
	
**O que a classe base deve ter?**
- a classe base deve ter seu tipo de retorno declarado como essa interface.

**O que mais saber sobre o código que usa o método fábrica (geralmente chamado de código cliente)?**
- não vê diferença entre os produtos reais retornados por várias subclasses. 
- O cliente trata todos os produtos como um Transporte abstrato. 
- O cliente sabe que todos os objetos de transporte devem ter o método entregar, mas como exatamente ele funciona não é importante para o cliente.