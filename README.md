# Controle Delivery API

## Passos para execução

1. Clonar o repositório:
   ```bash
   git clone https://github.com/euoseias/controlededeliveryrestaurante.git
   

2. Configurar o banco de dados Firebird no application.properties.

3. Rodar a aplicação com Maven: mvn spring-boot:run
   
4. Acesse a API Swagger em: http://localhost:8080/swagger-ui.html

Endpoints
Clientes:

GET /api/clientes - Listar clientes
POST /api/clientes - Criar cliente
GET /api/clientes/{id} - Buscar cliente
DELETE /api/clientes/{id} - Deletar cliente
Pedidos:

Similar ao de Clientes
Entregas:

Similar ao de Pedidos
