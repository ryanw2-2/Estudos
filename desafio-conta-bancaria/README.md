# Desafio Conta Bancária

Projeto desenvolvido em Java para simular operações básicas de uma conta bancária.

## Funcionalidades

- Consultar saldo
- Depositar dinheiro
- Sacar dinheiro
- Pagar boleto
- Consultar cheque especial
- Verificar se a conta está utilizando cheque especial

## Regras do Cheque Especial

- Depósito inicial até R$ 500,00:
  - Cheque especial de R$ 50,00.
- Depósito inicial acima de R$ 500,00:
  - Cheque especial de 50% do valor depositado.
- Quando o cheque especial é utilizado:
  - É cobrada uma taxa de 20% sobre o valor utilizado.

## Estrutura do Projeto

```text
src/
├── ContaBancaria.java
└── Main.java
```

## Como Executar

Execute a classe `Main`.

## Tecnologias

- Java
- Programação Orientada a Objetos (POO)

## Autor

Projeto desenvolvido para fins de estudo e prática de Java.