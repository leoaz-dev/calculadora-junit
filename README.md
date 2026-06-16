# PROJETO CALCULADORA - JUNIT 5

## Objetivo

Este projeto foi desenvolvido para demonstrar a implementação de testes automatizados utilizando **JUnit 5**, juntamente com a utilização do **Git** e **GitHub** para controle de versão.

A aplicação consiste em uma calculadora simples contendo as quatro operações matemáticas básicas:

* Soma
* Subtração
* Multiplicação
* Divisão

Além da implementação da calculadora, foram desenvolvidos testes automatizados cobrindo diferentes cenários de utilização.

---

## Requisitos

Para executar o projeto é necessário possuir instalado:

* Java JDK 17 ou superior
* Apache Maven 3.9 ou superior
* Git (opcional)

---

## Como executar o projeto

Abra o terminal na pasta raiz do projeto e execute:

```bash
mvn test
```

O Maven fará automaticamente:

* download das dependências;
* compilação do projeto;
* execução dos testes do JUnit 5.

Ao final da execução deverá ser apresentada uma saída semelhante a:

```text
Tests run: 21
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

---

## Estrutura do projeto

```text
calculadora-junit
│
├── src
│   ├── main
│   │   └── java
│   │       └── br/com/calculadora
│   │            └── Calculadora.java
│   │
│   └── test
│       └── java
│           └── br/com/calculadora
│                └── CalculadoraTest.java
│
├── pom.xml
├── README.txt
└── .gitignore
```

---

## Funcionalidades

A classe **Calculadora** implementa os seguintes métodos:

* somar()
* subtrair()
* multiplicar()
* dividir()

A operação de divisão realiza tratamento para divisão por zero através da exceção `ArithmeticException`.

---

## Testes Automatizados

Os testes foram desenvolvidos utilizando **JUnit 5**.

Foram implementados **21 testes unitários**, contemplando:

* números positivos;
* números negativos;
* zero;
* valores decimais;
* divisão por zero;
* casos de sucesso;
* tratamento de exceções.

---

## Controle de versão

Durante o desenvolvimento foi utilizado Git com as seguintes branches:

* **main** → versão principal do projeto;
* **desenvolvimento** → implementação das funcionalidades e testes.

Após a conclusão do desenvolvimento e validação dos testes, foi realizado o merge da branch **desenvolvimento** para a **main**.

---

## Tecnologias utilizadas

* Java 17
* Maven
* JUnit 5
* Git
* GitHub

---

## Autor

Leonardo Azevedo

Repositório GitHub: https://github.com/leoaz-dev/calculadora-junit

