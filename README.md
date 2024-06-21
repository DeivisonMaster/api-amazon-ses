# API Spring Boot de E-mails

**API Spring Boot 3.x para envio de e-mails utilizando Amazon SES**

## O que foi desenvolvido
**Foi desenvolvido um serviço de envio de emails que recebe os dados de um cliente como destino, assunto e mensagem e envia estes dados ao seu destino.**
**A aplicação foi implantada em uma instância EC2 mas por questões de custos, o serviço esta offline.**

**Foi escolhido o nivel Pleno para o desafio <br/>**
**O Java na versão 17 foi escolhido como linguagem. <br/>**
**Utilizado padrão Restful para o desenvolvimento do serviço. <br/>**
**Dentro do requisito tecnico, foi escolhido a trilha de back-end com um minimo de front-end sendo a documentação via API Docs.**

## Tecnologias

- **Java 17** 
- **Apache Maven** 
- **Spring Boot** 
- **Spring IoC**
- **Swagger** 
- **Devtools**
- **Apache Tomcat** 
- **IDE Spring Tool Suite** 
- **MockMvc**
- **AssertJ** 

## Como rodar a aplicação

**Inicie a aplicação usando qualquer um dos comandos abaixo**

> **Nota:** Para os dois primeiros comandos, é necessario executar dentro da pasta raiz do projeto i.e **email-service** pasta

- **Usando maven** ``` mvn spring-boot:run```

- **A partir de arquivo jar**
  Criar um arquivo jar usando o comando '**mvn clean install**' e então executar 
  <br/>```java -jar target/email-service-0.0.1-SNAPSHOT.jar```


- **Diretamente a partir de uma IDE**
  <br/>```Clicar com o botão direito em EmailServiceApplication.java e então clicar na opção 'Run' ```
  <br/><br/>

> **Nota:** Por padrão aplicações Spring Boot iniciam na porta 8080. 
Se a porta 8080 estiver ocupada em seu sistema, então voce pode mudar o numero da porta atualizando a linha **server.port**  dentro do arquivo 
**application.properties** que esta disponivel dentro da pasta **src > main > resources**.

<br/>

**Envie uma requisição POST para o endpoint '/api/emails' endpoint usando um aplicativo terceiro como o Postman**

## Acesso a API Docs
- **Swagger** ``` http://localhost:8080/swagger-ui.html ```
- **API Docs** ``` http://localhost:8080/v3/api-docs ```

## Como rodar os testes de Unidade

**Rode os casos de testes usando qualquer comando abaixo**

> **Nota:** Estes comandos precisam rodar dentro da pasta raiz do projeto i.e dentro de **email-service**

- **Para rodar todos os testes**
  <br/>```mvn test```


- **Para rodar uma classe de teste em particular**
  <br/>```mvn -Dtest=EnviadorEmailControllerTest test```
  <br/>or
  <br/>```mvn -Dtest=EnviadorEmailControllerTest test```