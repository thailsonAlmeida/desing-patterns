# BUILDER

**O que o padrão de projetos builder permite?**
- Construir **objetos complexos** passo a passo.
- Produzir diferentes **tipos de objetos** usando o mesmo código.
- Produzir diferentes **representações de objetos** usando o mesmo código.

**O que o PP builder sugere?**
- Extrair o código de construção do objeto para fora de sua própria classe.
- Mover o construtor para objetos separados chamados builders.

**Como o PP builder é estruturado?**
1. A interface Builder declara etapas de construção do produto que são comuns a todos os tipos de builders.

1. Builders Concretos provém diferentes implementações das etapas de construção. 
	- Builders concretos podem produzir produtos que não seguem a interface comum.

1. Produtos são os objetos resultantes. 
	- Produtos construídos por diferentes builders não precisam pertencer a mesma interface ou hierarquia da classe.

1. A classe Diretor define a ordem na qual as etapas de construção são chamadas, então você pode criar e reutilizar configurações específicas de produtos.

1. O Cliente deve associar um dos objetos builders com o diretor. 
	- Usualmente isso é feito apenas uma vez, através de parâmetros do construtor do diretor. 
	- O diretor então usa aquele objeto builder para todas as futuras construções. 
	- Contudo, há uma abordagem alternativa para quando o cliente passa o objeto builder ao método de produção do diretor. 
	- Nesse caso, você pode usar um builder diferente a cada vez que você produzir alguma coisa com o diretor.
	
**Quando utilizar o PP Builder?**
- Quando existem muitos paramentros para passar no construtor.
- Quando é for necessario criar diferentes representações do mesmo produto.
	- Exemplo
		-- Casa de pedra
		-- Casa de madeira
- Quando o objeto é complexo. Exige diversos passos/etapas envolvidos.
