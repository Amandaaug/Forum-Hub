# 📌 FórumHub - API REST

API REST para a gestão de tópicos de um fórum. O projeto foi desenvolvido como parte do desafio FórumHub, com o objetivo de implementar uma API completa, seguindo as melhores práticas do modelo REST e utilizando as principais ferramentas do ecossistema Spring Boot.

[![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)  
[![Maven](https://img.shields.io/badge/Maven-3.9.6-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)  
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?logo=mysql&logoColor=white)](https://www.mysql.com/)  
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](./LICENSE)  
---
✨ Funcionalidades

✅ Criar um novo tópico
✅ Listar todos os tópicos
✅ Detalhar um tópico por ID
✅ Atualizar um tópico existente
✅ Excluir um tópico

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3.x**
* **Maven**
* **Spring Web**: para a construção da API REST.
* **Spring Data JPA**: para a camada de persistência de dados.
* **MySQL Driver**: conector para o banco de dados MySQL.
* **Spring Security**: para autenticação e autorização.
* **Lombok**: para reduzir o código boilerplate (getters, setters, etc.).
* **Validation**: para validação de dados de entrada.

---

## 📂 Estrutura do Projeto

A estrutura de pacotes foi organizada para separar as responsabilidades da aplicação (Controller, Domain, Repository).

- forumhub
  - pom.xml
  - src
    - main
      - java
        - com
          - seuusuario
            - forumhub
              - ForumHubApplication.java
              - controller
                - TopicoController.java
              - domain
                - topico
                  - Topico.java
                  - StatusTopico.java
              - dto
                - DadosCadastroTopico.java
                - DadosAtualizacaoTopico.java
              - repository
                - TopicoRepository.java
      - resources
        - application.properties

---

## ▶️ Como Rodar o Projeto

▶️ Como Rodar o Projeto

### 🔧 Pré-requisitos

* Java JDK 17+
* Maven
* MySQL 8.0+

### ⚙️ Configuração

No arquivo application.properties, configure o banco de dados:

spring.datasource.url=jdbc:mysql://localhost:3306/forumhub?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=SUA_SENHA_AQUI
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ Executando

No terminal, dentro da pasta do projeto:

mvn spring-boot:run

A API estará disponível em:
👉 http://localhost:8080

---

### 📬 Exemplos de Requisição

* ➕ Criar um novo tópico

POST /topicos

{
  "titulo": "Meu primeiro tópico",
  "mensagem": "Essa é a mensagem do tópico",
  "status": "NAO_RESPONDIDO"
}


### 📖 Próximos Passos

* 🔐 Implementar autenticação com Spring Security + JWT
* 📄 Paginação e ordenação nos endpoints
* 🧪 Testes unitários e de integração

### 📜 Licença

Este projeto está licenciado sob a MIT License
.


## 👨‍💻 Autor

Projeto desenvolvido por **Amanda A. da Silva** para estudos e aplicação prática de conceitos de Spring Boot.
