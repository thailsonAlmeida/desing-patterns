# COMPOSITE

**Que é o DP Composite?**
- É um PD estrutural.
- Permite compor objetos em estruturas de árvores.

**O que a estrutura de árvores de objetos permite?**
- Trabalhar como se as estruturas fossem objetos individuais.

**Quando utilizar o composite?**
- Quando for necessario implementar uma estrutura de objetos tipo árvore.
- Quando você quer que o código cliente trate tanto os objetos simples como os compostos de forma uniforme.

**Como implementar o composite?**
1. Certifique-se que o modelo central de sua aplicação possa ser representada como uma estrutura de árvore. 
- Tente quebrá-lo em elementos simples e contêineres. 
- Lembre-se que contêineres devem ser capazes de conter tanto elementos simples como outros contêineres.

1. Declare a interface componente com uma lista de métodos que façam sentido para componentes complexos e simples.

1. Crie uma classe folha que represente elementos simples. 
- Um programa pode ter múltiplas classes folha diferentes.

1. Crie uma classe contêiner para representar elementos complexos. 
- Nessa classe crie um vetor para armazenar referências aos sub-elementos. 
- O vetor deve ser capaz de armazenar tanto folhas como contêineres, então certifique-se que ele foi declarado com um tipo de interface componente.
- Quando implementar os métodos para a interface componente, lembre-se que um contêiner deve ser capaz de delegar a maior parte do trabalho para os sub-elementos.

1. Por fim, defina os métodos para adicionar e remover os elementos filhos no contêiner.
- Tenha em mente que essas operações podem ser declaradas dentro da interface componente. 
- Isso violaria o princípio de segregação de interface porque os métodos estarão vazios na classe folha. 
- Contudo, o cliente será capaz de tratar de todos os elementos de forma igual, mesmo ao montar a árvore.