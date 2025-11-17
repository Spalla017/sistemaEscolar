# 🎓 Sistema Escolar - Demonstração de Relações POO em Java

Sistema completo desenvolvido em Java para demonstrar os **quatro principais tipos de relações** da Programação Orientada a Objetos: **Associação**, **Agregação**, **Composição** e **Interface**.

## 📚 Sobre o Projeto

Este projeto foi criado com propósito educacional para ilustrar de forma prática e clara como diferentes tipos de relações entre classes funcionam em um contexto real de sistema escolar.

## 🎯 Conceitos Demonstrados

### 1️⃣ **Associação** (Professor ↔ Curso)
Relação fraca onde ambas as classes existem independentemente.
- Um `Professor` pode dar aula para um `Curso`
- Ambos continuam existindo mesmo se a relação for desfeita
- Representa um vínculo sem dependência de ciclo de vida

```java
Professor prof = new Professor("Dr. Carlos Silva", "Programação");
Curso curso = new Curso("Java Avançado", "PROG-101", 60);
prof.darAulaParaCurso(curso); // Associação criada
```

### 2️⃣ **Agregação** (Turma ◇ Alunos)
Relação "tem um" onde as partes existem independentemente do todo.
- Uma `Turma` contém vários `Alunos`
- Os alunos podem existir sem pertencer a nenhuma turma
- Remoção da turma não afeta a existência dos alunos

```java
Aluno aluno = new Aluno("João Pedro", "2025001");
Turma turma = new Turma("TURMA-A", "2025.1");
turma.adicionarAluno(aluno); // Aluno agregado à turma
turma.removerAluno(aluno);   // Aluno continua existindo
```

### 3️⃣ **Composição** (Aluno ◆ Boletim)
Relação forte onde a parte não existe sem o todo.
- Um `Boletim` pertence exclusivamente a um `Aluno`
- O boletim é criado automaticamente no construtor do aluno
- Se o aluno for destruído, o boletim também é

```java
Aluno aluno = new Aluno("Ana Paula", "2025002");
// Boletim é criado automaticamente (composição)
aluno.getBoletim().adicionarAvaliacao(prova);
```

### 4️⃣ **Interface** (IAvaliacao)
Contrato que define comportamentos comuns para diferentes implementações.
- Interface `IAvaliacao` define os métodos `avaliar()` e `exibirDetalhes()`
- Classes `Prova` e `Trabalho` implementam a interface
- Demonstra **polimorfismo** em ação

```java
IAvaliacao av1 = new Prova("Matemática", 8.5, 10);
IAvaliacao av2 = new Trabalho("IA", 9.0, "Pesquisa");
av1.avaliar(); // Polimorfismo
av2.avaliar();
```

## 🏗️ Estrutura do Projeto

```
SistemaEscolar/
│
├── IAvaliacao.java          # Interface para avaliações
├── Prova.java               # Implementação de avaliação tipo prova
├── Trabalho.java            # Implementação de avaliação tipo trabalho
├── Boletim.java             # Composição com Aluno
├── Aluno.java               # Classe principal com composição
├── Turma.java               # Agregação de alunos
├── Curso.java               # Associação com Professor
├── Professor.java           # Associação com Curso
└── SistemaEscolar.java      # Classe principal (main)
```

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Variável de ambiente JAVA_HOME configurada

### Compilação e Execução

```bash
# Compilar o projeto
javac SistemaEscolar.java

# Executar o sistema
java SistemaEscolar
```

### Ou em um único comando:
```bash
javac SistemaEscolar.java && java SistemaEscolar
```

## 💡 Funcionalidades Demonstradas

✅ Criação de professores e associação com cursos  
✅ Gerenciamento de turmas com adição/remoção de alunos  
✅ Sistema de boletim com cálculo automático de média  
✅ Avaliações polimórficas (Provas e Trabalhos)  
✅ Demonstração clara de cada tipo de relação  

## 📊 Saída do Programa

O programa exibe uma demonstração completa e organizada:

```
╔════════════════════════════════════════════════╗
║      SISTEMA ESCOLAR - DEMO COMPLETO           ║
╚════════════════════════════════════════════════╝

【1】 ASSOCIAÇÃO - Professor e Curso
【2】 AGREGAÇÃO - Turma contém Alunos
【3】 COMPOSIÇÃO - Aluno e Boletim
【4】 INTERFACE - IAvaliacao (Prova e Trabalho)

╔════════════════════════════════════════════════╗
║              RESUMO DAS RELAÇÕES               ║
╚════════════════════════════════════════════════╝
```

## 🎓 Aprendizado

Este projeto é ideal para:
- Estudantes de Programação Orientada a Objetos
- Desenvolvedores aprendendo Java
- Preparação para entrevistas técnicas
- Referência rápida sobre relações entre classes

## 📝 Conceitos de POO Aplicados

- ✨ **Encapsulamento**: Atributos privados com métodos de acesso
- 🔄 **Polimorfismo**: Interface implementada por múltiplas classes
- 🏗️ **Composição**: Ciclo de vida compartilhado entre objetos
- 🔗 **Agregação**: Relacionamento fraco entre objetos
- 🤝 **Associação**: Vínculo bidirecional entre classes

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:
- Reportar bugs
- Sugerir melhorias
- Adicionar novos exemplos
- Melhorar a documentação

## 📄 Licença

Este projeto está sob a licença MIT - sinta-se livre para usar em seus estudos e projetos.

## 👨‍💻 Autor

Desenvolvido como material educacional para demonstração de conceitos de POO em Java.

---

⭐ **Se este projeto te ajudou, considere dar uma estrela!** ⭐
