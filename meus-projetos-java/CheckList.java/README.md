# CheckList - Sistema de Tarefas em Java

Sistema de linha de comando para gerenciar uma lista de tarefas, desenvolvido em Java como parte dos meus estudos de Programação Orientada a Objetos.

## Funcionalidades

- Adicionar tarefas
- Listar tarefas (com status de pendente/concluída)
- Marcar uma tarefa como concluída
- Sair do sistema

## Tecnologias e conceitos utilizados

- Java (POO)
- Classes e objetos (`Tarefa`)
- Arrays
- Estruturas de repetição (`do-while`, `for`)
- Estrutura condicional (`switch`)
- Scanner para entrada de dados
- Cores no terminal (códigos ANSI)

## Como executar

1. Clone o repositório
2. Compile os arquivos:
   ```
   javac List.java Tarefa.java
   ```
3. Execute:
   ```
   java List
   ```

## Estrutura do projeto

```
├── List.java      # Classe principal, com o menu e a lógica do sistema
└── Tarefa.java     # Classe que representa uma tarefa (descrição e status)
```

## Exemplo de uso

```
=========================================
           Bem Vindo ao CheckList
=========================================

1 - Adicionar Tarefa
2 - Ver Tarefas
3 - Concluir Tarefa
4 - Sair

Escolha uma das opcoes: 2

----- Suas Tarefas -----
1 - Estudar [Pendente]
2 - Exercicio [Concluida]
```

## Melhorias futuras

- Suporte a descrições com múltiplas palavras
- Persistência de dados (salvar em arquivo ou banco de dados)
- Uso de `ArrayList` no lugar de array de tamanho fixo

## Autor

Igor Pereira