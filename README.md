# 📌 FórumHub - API REST

API REST para a gestão de tópicos de um fórum. O projeto foi desenvolvido como parte do desafio FórumHub, com o objetivo de implementar uma API completa, seguindo as melhores práticas do modelo REST e utilizando as principais ferramentas do ecossistema Spring Boot.

---

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

## ⚙️ Funcionalidades (Endpoints)

A API implementa todas as operações CRUD para a entidade `Tópico`.

| Verbo HTTP | Endpoint            | Descrição                      |
|------------|---------------------|--------------------------------|
| `POST`     | `/topicos`          | Cria um novo tópico.           |
| `GET`      | `/topicos`          | Lista todos os tópicos.        |
| `GET`      | `/topicos/{id}`     | Detalha um tópico específico.  |
| `PUT`      | `/topicos/{id}`     | Atualiza um tópico existente.  |
| `DELETE`   | `/topicos/{id}`     | Deleta um tópico.              |

---

## 📂 Estrutura do Projeto

A estrutura de pacotes foi organizada para separar as responsabilidades da aplicação (Controller, Domain, Repository).

forumhub/
├─ pom.xml
├─ src/
│ └─ main/
│   ├─ java/
│   │ └─ com/alura/forohub/
│   │   ├─ domain/
│   │   │ ├─ topico/
│   │   │ │ ├─ Topico.java
│   │   │ │ ├─ TopicoRepository.java
│   │   │ │ └─ validacoes/
│   │   │ │     └─ StatusTopico.java
│   │   │ └─ ForumHubApplication.java
│   └─ resources/
│     └─ application.properties
└─ README.md

---

## ▶️ Como Rodar o Projeto

### Pré-requisitos
* **Java JDK 17+**: Certifique-se de que a versão 17 está instalada.
* **Maven**: Geralmente já vem com a sua IDE.
* **MySQL 8.0+**: Instale e configure o banco de dados.

### Configuração
1.  Clone o repositório (substitua pelo seu):
    `git clone https://github.com/SEU_USUARIO/forohub.git`
2.  Abra o projeto no VS Code.
3.  Ajuste o arquivo `src/main/resources/application.properties` com as suas credenciais do MySQL:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/forohub?createDatabaseIfNotExist=true
    spring.datasource.username=root
    spring.datasource.password=SUA_SENHA_AQUI
    ```

### Execução
Use o terminal do VS Code para rodar a aplicação:
`mvn spring-boot:run`

A API estará acessível em `http://localhost:8080`.

---

## 👨‍💻 Autor

Projeto desenvolvido por **Amanda A. da Silva** para estudos e aplicação prática de conceitos de Spring Boot.
