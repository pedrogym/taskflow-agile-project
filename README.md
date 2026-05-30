# TaskFlow Agile Project

## Descrição

O TaskFlow é um sistema de gerenciamento de tarefas desenvolvido para uma startup de logística fictícia. O objetivo é permitir o acompanhamento do fluxo de trabalho em tempo real, a organização das atividades da equipe e o controle do andamento das tarefas.

## Escopo Inicial

- Cadastro de tarefas
- Visualização de tarefas
- Atualização de status
- Exclusão de tarefas
- Atribuição de responsáveis

## Metodologia Utilizada

O projeto foi desenvolvido utilizando conceitos das metodologias ágeis Scrum e Kanban.

### Scrum
- Planejamento por Sprints
- Priorização de atividades
- Entregas incrementais

### Kanban
- Coluna A Fazer
- Coluna Em Progresso
- Coluna Concluído

## Tecnologias Utilizadas

- Java 17
- Maven
- JUnit 5
- GitHub Actions
- GitHub Projects

## Controle de Qualidade

Foram implementados testes automatizados utilizando JUnit 5. O GitHub Actions executa os testes automaticamente a cada alteração enviada ao repositório.

## Gestão de Mudanças

Durante o desenvolvimento foi identificada a necessidade de maior rastreabilidade das tarefas. Como consequência, o escopo foi ajustado para incluir validações adicionais e controle de responsáveis. A funcionalidade de filtros avançados foi adiada para uma próxima Sprint.

## Estrutura do Projeto

src/main/java
- Task.java

src/test/java
- TaskTest.java

.github/workflows
- testes.yml
