# Portfolio Backend API 🚀

Este é o repositório do backend do meu portfólio pessoal, desenvolvido com **Java** e **Spring Boot**. A aplicação serve como uma API RESTful para gerenciar os dados exibidos no frontend do portfólio, como a lista de projetos, utilizando um banco de dados **MySQL**.

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 17+)
- **Spring Boot** (Web, Data JPA)
- **Hibernate** (Mapeamento Objeto-Relacional)
- **MySQL** (Banco de Dados Relacional)
- **Maven** (Gerenciador de Dependências)

## ⚙️ Funcionalidades

- **CRUD de Projetos:** Criação, leitura, atualização e exclusão de projetos que são exibidos na página principal do portfólio.
- **Integração com Banco de Dados:** Mapeamento automático de entidades e persistência de dados.
- **CORS Configurado:** Permite acesso do frontend React ao backend de forma segura.

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
- Ter o **Java (JDK 17 ou superior)** instalado.
- Ter o **Maven** instalado (ou utilizar o `mvnw` incluso no projeto).
- Um servidor **MySQL** rodando localmente (ex: XAMPP).

### Passo a Passo

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/ThierrySant0007/portfolio-backend.git
   cd portfolio-backend
   ```

2. **Configure o Banco de Dados:**
   - Crie um banco de dados no MySQL com o nome `portfolio_db`.
   - As configurações de conexão estão definidas no arquivo `src/main/resources/application.properties` apontando para o seu banco local (`root` sem senha).

3. **Inicie a Aplicação:**
   - Pelo terminal, na raiz do projeto, execute o comando:
     ```bash
     mvn spring-boot:run
     ```
   - A aplicação iniciará na porta `8080`.

## 📡 Principais Endpoints

- `GET /api/projects` - Retorna a lista de todos os projetos.
- `POST /api/projects` - Cria um novo projeto.
- `PUT /api/projects/{id}` - Atualiza um projeto existente.
- `DELETE /api/projects/{id}` - Deleta um projeto pelo seu ID.

## 👨‍💻 Autor

- Desenvolvido por **Thierry Santos** ([@ThierrySant0007](https://github.com/ThierrySant0007))
