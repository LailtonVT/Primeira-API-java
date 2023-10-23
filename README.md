# Tarefas App
O Tarefas App é uma aplicação simples de gerenciamento de tarefas criada usando Spring Boot. Ele permite que você crie, liste, atualize e exclua tarefas.

## Pré-requisitos
Certifique-se de que você tenha as seguintes ferramentas instaladas antes de executar o projeto:

Java Development Kit (JDK) - Versão recomendada: Java 11 ou superior.
Maven - Gerenciador de dependências e construção.
Spring Boot - O projeto utiliza o Spring Boot.
Como Iniciar
Siga estas etapas para executar o projeto:

### Clone o repositório:


git clone https://seu-repositorio.git


Navegue até o diretório do projeto:


cd tarefas-app
Compile e inicie o aplicativo:


./mvnw spring-boot:run
Acesse o aplicativo no seu navegador em http://localhost:8080.

## Endpoints da API
GET /tarefas: Obtém a lista de tarefas.


GET /tarefas/{id}: Obtém os detalhes de uma tarefa específica.


POST /tarefas: Cria uma nova tarefa.


PUT /tarefas/{id}: Atualiza uma tarefa existente.


DELETE /tarefas/{id}: Exclui uma tarefa.


## Contribuindo
Sinta-se à vontade para contribuir para este projeto. Você pode abrir problemas (issues) ou enviar solicitações de pull (pull requests).