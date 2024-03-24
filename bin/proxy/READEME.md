# Proxy

**Que é padrão de projeto proxy?**
- É um padrão de projeto estrutural.

**O que o padrão de projeto proxy permite?**
- Fornece um substituto ou um espaço reservado para outro objeto.
- Controla o acesso ao objeto original.

**Quando utilizar o proxy?**
- Inicialização preguiçosa (proxy virtual).
- Controle de acesso (proxy de proteção). 
- Execução local de um serviço remoto (proxy remoto). 
- Registros de pedidos (proxy de registro).
- Cache de resultados de pedidos (proxy de cache).
- Referência inteligente. 

**Como implementar o proxy?**
1. Se não há uma interface do serviço pré existente, crie uma para fazer os objetos proxy e serviço intercomunicáveis. 
	- Extrair a interface da classe serviço nem sempre é possível, porque você precisaria mudar todos os clientes do serviço para usar aquela interface. 
	- O plano B é fazer do proxy uma subclasse da classe serviço e, dessa forma, ele herdará a interface do serviço.
	
1. Crie a classe proxy.
	- Ela deve ter um campo para armazenar uma referência ao serviço.
	- Geralmente proxies criam e gerenciam todo o ciclo de vida de seus serviços.
	- Em raras ocasiões, um serviço é passado ao proxy através do construtor pelo cliente.
	
1. Implemente os métodos proxy de acordo com o propósito deles. 
	- Na maioria dos casos, após realizar algum trabalho, o proxy deve delegar o trabalho para o objeto do serviço.
	
1. Considere introduzir um método de criação que decide se o cliente obtém um proxy ou serviço real.
	- Isso pode ser um simples método estático na classe do proxy ou um método factory todo implementado.
	
1. Considere implementar uma inicialização preguiçosa para o objeto do serviço.