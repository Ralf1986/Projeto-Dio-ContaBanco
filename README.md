# DIO - Trilha Java Básico  
[www.dio.me](https://www.dio.me)

## Autores  
**Gleyson Sampaio**

## Sintaxe - Desafio  
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

### Projeto ContaBanco  
Crie o projeto **ContaBanco** que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:

Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

### Revisão de Regras de Declaração de Variáveis  

| **Atributo**    | **Tipo** | **Exemplo**        |
|-----------------|----------|--------------------|
| **Numero**      | Inteiro  | 1021               |
| **Agencia**     | Texto    | 067-8              |
| **Nome Cliente**| Texto    | MARIO ANDRADE      |
| **Saldo**       | Decimal  | 237.48             |

### Revisão de Terminal, `main args` e a classe `Scanner`

Permita que os dados sejam inseridos via terminal, sendo que o usuário receberá a mensagem de qual informação será solicitada. Exemplo:

- **Programa**: "Por favor, digite o número da Agência!"
- **Usuário**: 1021 (pressione ENTER para o próximo campo)

### Revisão de Concatenação e Classe `String` com Método `concat`

Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

> "Olá **[Nome Cliente]**, obrigado por criar uma conta em nosso banco, sua agência é **[Agencia]**, conta **[Numero]** e seu saldo **[Saldo]** já está disponível para saque."

Os campos em `[ ]` devem ser substituídos pelas informações inseridas pelos usuários.
