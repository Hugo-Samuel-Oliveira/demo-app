# demo-app

Este repositório contém um projeto desenvolvido com o objetivo de explorar e aprender os fundamentos do **Spring Boot**, incluindo sua configuração, gerenciamento de dependências e funcionalidades principais, com integração ao banco de dados H2 usando Spring Data JPA.

⚠ **Nota**: Este projeto foi criado apenas para fins de estudo e testes. Não é destinado para produção ou uso profissional.

## 🚀 Funcionalidades Implementadas

- Configuração inicial de um projeto Spring Boot.
- Gerenciamento de dependências com **Gradle**.
- Integração com **Spring Data JPA** para persistência de dados no banco H2.
- Exposição de um endpoint **REST** para consultar produtos cadastrados.
- Banco de dados H2 em memória configurado para persistir dados de produtos e departamentos.
- CRUD simples para a entidade `Product` e `Department` com relacionamento `ManyToOne`.

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Gradle** (para gerenciamento de dependências e execução do projeto)
- **Spring Web**
- **Spring Data JPA** (para interação com o banco de dados)
- **H2 Database** (banco de dados em memória para persistência dos dados)
- **Jakarta Persistence API (JPA)**

## 📦 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Acesse a pasta do projeto:
   ```bash
   cd seu-repositorio
   ```

3. Instale as dependências e compile o projeto:
   ```bash
   ./gradlew build
   ```

4. Execute o projeto:
   ```bash
   ./gradlew bootRun
   ```

5. Acesse a aplicação no navegador:
   ```
   http://localhost:8080
   ```

## 🧑‍💻 Exemplo de Retorno da API

Ao acessar o endpoint `http://localhost:8080/products`, a API retorna uma lista de produtos no seguinte formato JSON:

```json
[
  {
    "id": 1,
    "name": "Macbook Pro",
    "price": 4000.0,
    "department": {
      "id": 1,
      "name": "Tech"
    }
  },
  {
    "id": 2,
    "name": "PC Gamer",
    "price": 5000.0,
    "department": {
      "id": 1,
      "name": "Tech"
    }
  },
  {
    "id": 3,
    "name": "Pet House",
    "price": 300.0,
    "department": {
      "id": 2,
      "name": "Pet"
    }
  },
  {
    "id": 4,
    "name": "Coleira",
    "price": 150.0,
    "department": {
      "id": 2,
      "name": "Pet"
    }
  }
]
```

Este exemplo mostra os produtos disponíveis com seus respectivos preços e departamentos. A resposta inclui informações detalhadas de cada produto e seu departamento associado.

## 🧰 Banco de Dados H2

Este projeto utiliza o banco de dados **H2** em memória para armazenar informações de produtos e departamentos. O banco é configurado automaticamente pelo Spring Boot e as tabelas são criadas na primeira execução do projeto.

Você pode acessar o console do banco de dados H2 através do navegador no seguinte endereço:
```
http://localhost:8080/h2-console
```

As configurações do banco estão no arquivo `application.properties`, incluindo a URL do banco, credenciais de acesso e configurações do JPA. O banco de dados H2 é configurado para estar em memória, o que significa que os dados são apagados quando o aplicativo é desligado.
