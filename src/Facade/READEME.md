# FACADE

**O que é o DP Facade?**
	- Padrão de projeto estrutural
	- Fornece uma interface simplificada para uma biblioteca, framework, ou qualquer conjunto complexo de classe 
	- fornecendo um atalho para as funcionalidades mais usadas do subsistema que corresponde aos requerimentos do cliente.
	
**Quando utilizar DP Facade?**
	- Quando for necessario uma interface limitada, mas simples para um subsistema complexo 
	- Quando for necessario estruturar um subsistema em camadas
	
**Como implementar o DP Facade?**

1. Verifique se é possível providenciar uma interface mais simples que a que o subsistema já fornece.
	- Você está no caminho certo se essa interface faz o código cliente independente de muitas classes do subsistema.
	
1. Declare e implemente essa interface em uma nova classe fachada. 
	- A fachada deve redirecionar as chamadas do código cliente para os objetos apropriados do subsistema. 
	- A fachada deve ser responsável por inicializar o subsistema e gerenciar seu ciclo de vida a menos que o código cliente já faça isso.
	
1. Para obter o benefício pleno do padrão, faça todo o código cliente se comunicar com o subsistema apenas através da fachada. 
	- Agora o código cliente fica protegido de qualquer mudança no código do subsistema. 
	- Por exemplo, quando um subsistema recebe um upgrade para uma nova versão, você só precisa modificar o código na fachada.
	
1. Se a fachada ficar grande demais, considere extrair parte de seu comportamento para uma nova e refinada classe fachada.