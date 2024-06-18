<h1> API de envio de e-mails </h1>
Api desenvolvida como parte de resolução de desafio back-end Uber <br/>
https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md
<br/><br/>

<h2>Proposta</h2>
Desenvolver Serviço de envio de e-mails utilizando o serviço Amazon SES.
<br/><br/>

<h2>Requisitos Técnicos</h2>
Arquitetura RESTful com entradas e saídas em JSON <br/>
Testes <br/>
Documentação <br/>
Implantação Cloud<br/>
<br/><br/>

<h2>O que foi desenvolvido</h2>
Foi desenvolvido um serviço de envio de emails que recebe os dados de um cliente como destino, assunto e mensagem e envia estes dados ao seu destino.
A aplicação foi implantada em uma instância EC2 mas por questões de custos, o serviço esta offline.

Foi escolhido o nivel Pleno para o desafio técnico. <br/>
O Java na versão 17 foi escolhido como linguagem. <br/>
Utilizado padrão Restful para o desenvolvimento do serviço. <br/>
Dentro do requisito tecnico, foi escolhido a trilha de back-end com um minimo de front-end sendo a documentação via API Docs.


<h2>Como testar</h2>
<h4>Pré-requisitos</h4>
É necessario possuir um registro de email configurado no Amazon SES para envio de emails. <br/>
É necessario também chaves de acessos geradas pelo serviço Amazon SES configuradas em application.properties </br>

<h4>Iniciando o App</h4>
1. clonar o repositorio <br/>
2. importar o projeto em alguma IDE de preferencia ou gerar versão da aplicação com o maven: mvn package <br/>
3. executar o jar da aplicação com o comando: java -jar target/email-service-0.0.1-SNAPSHOT.jar <br/>
4. com aplicativos clientes como postman ou insomnia, criar nova requisição POST para o endpoint dominio_local:8080/api/email <br/>
Obs: ver exemplo de requisição com API Docs em: http://localhost:8080/swagger-ui.html

<br/>

<h4>Resultados</h4>
Requisição Postman: <br/>
![Screenshot](docs/postman.JPG)

Email recebido: <br/>
![Screenshot](docs/email.JPG)
  
<h2>Padrão de Arquitetura</h2>
MVC

<br/>

<h2>Testes Realizados</h2>
Testes de unidade do Controller - Testes de unidade no Endpoint

<br/>

Executar o comando: mvn test 

<br/>
<h2>Endpoint:</h2>
http://localhost:8080/api/email

<h2>Tecnologias Aplicadas</h2>
<p>Java 17</p>
<p>Apache Maven</p>
<p>Spring Boot</p>
<p>Spring IoC</p>
<p>Swagger</p>
<p>Devtools</p>
<p>Apache Tomcat</p>
<p>IDE Spring Tool Suite</p>
<p>MockMvc</p>
<p>AssertJ</p>

Acesso Open API doc:
1. http://localhost:8080/swagger-ui.html
2. http://localhost:8080/v3/api-docs
<br/>

![Screenshot](docs/api-docs.JPG)

<br/>
  


