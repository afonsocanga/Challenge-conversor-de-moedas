# 💱 CurrencyConverter

Um conversor de moedas simples e interativo via console, desenvolvido em **Java**, utilizando a **ExchangeRate API** para taxas de câmbio em tempo real e a biblioteca **GSON** para manipulação de JSON.

---

## 🚀 Funcionalidades

- Interface interativa via terminal
- Conversão entre 6 pares de moedas:
  - USD ↔️ EUR
  - USD ↔️ BRL
  - EUR ↔️ BRL
- Taxas de câmbio em **tempo real** via API
- Projeto estruturado com **Maven**
- Manipulação de dados JSON com **GSON**

---

## 🛠️ Tecnologias Utilizadas

- Java 11+
- Maven
- GSON (Google JSON Library)
- ExchangeRate API

---

## 🧪 Como Executar

### Pré-requisitos
- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Apache Maven](https://maven.apache.org/install.html)
- Conexão com a internet

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/CurrencyConverter.git
cd CurrencyConverter
```

2. Compile o projeto:

```bash
mvn compile
```

3. Execute o programa:

```bash
mvn exec:java -Dexec.mainClass="com.example.Main"
```

---

## 🔐 API Key

Este projeto utiliza a [ExchangeRate API](https://www.exchangerate-api.com/). Para utilizá-lo com sua própria chave:

1. Crie uma conta gratuita no site da API
2. Copie sua **API Key**
3. Substitua a chave dentro da classe `Main.java` na linha:

```java
private static final String API_KEY = "SUA_API_KEY_AQUI";
```

---

## 🧾 Exemplo de Uso

```text
=== Conversor de Moedas ===
1. USD para EUR
2. EUR para USD
3. USD para BRL
4. BRL para USD
5. EUR para BRL
6. BRL para EUR
Escolha a opção (1-6): 3
Digite o valor a converter: 100
100.00 USD = 486.65 BRL
```

---

## 📂 Estrutura do Projeto

```
CurrencyConverter/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── Main.java
```

---

## 📝 Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

## 🙋‍♂️ Autor

Desenvolvido por **Afonso** — sinta-se à vontade para contribuir ou abrir issues!

[![GitHub](https://img.shields.io/badge/GitHub-Perfil-181717?style=for-the-badge&logo=github)](https://github.com/seu-usuario)
