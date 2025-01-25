# demo-app
Claro! Aqui está o README atualizado com o exemplo do que o código retorna, conforme solicitado:

---

# Projeto de Aprendizado com Java Spring Boot

Este repositório contém um projeto desenvolvido com o objetivo de explorar e aprender os fundamentos do **Spring Boot**, incluindo sua configuração, gerenciamento de dependências e funcionalidades principais.

⚠ **Nota**: Este projeto foi criado apenas para fins de estudo e testes. Não é destinado para produção ou uso profissional.

## 🚀 Funcionalidades Implementadas

- Configuração inicial de um projeto Spring Boot.
- Gerenciamento de dependências com **Gradle**.
- Integração com bibliotecas do ecossistema Spring.
- Estrutura básica de uma aplicação Spring, como Controllers.

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Gradle** (para gerenciamento de dependências e execução do projeto)
- **Spring Web**

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
  }
]
```

Este exemplo mostra os produtos disponíveis com seus respectivos preços e departamentos. A resposta inclui informações detalhadas de cada produto e seu departamento associado.

---
