public class SistemaEscolar {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║      SISTEMA ESCOLAR - DEMO COMPLETO          ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        // === 1. ASSOCIAÇÃO: Professor e Curso ===
        System.out.println("【1】 ASSOCIAÇÃO - Professor e Curso");
        System.out.println("─────────────────────────────────────────────────");
        Curso cursoJava = new Curso("Programação Java", "PROG-101", 60);
        Curso cursoBD = new Curso("Banco de Dados", "BD-201", 80);
        
        Professor prof1 = new Professor("Dr. Carlos Silva", "Programação");
        Professor prof2 = new Professor("Dra. Maria Santos", "Banco de Dados");
        
        prof1.darAulaParaCurso(cursoJava);
        prof2.darAulaParaCurso(cursoBD);
        
        prof1.exibirInformacoes();
        prof2.exibirInformacoes();
        
        // === 2. AGREGAÇÃO: Turma e Alunos ===
        System.out.println("\n\n【2】 AGREGAÇÃO - Turma contém Alunos");
        System.out.println("─────────────────────────────────────────────────");
        
        // Alunos existem independentemente da turma
        Aluno aluno1 = new Aluno("João Pedro", "2025001");
        Aluno aluno2 = new Aluno("Ana Paula", "2025002");
        Aluno aluno3 = new Aluno("Lucas Oliveira", "2025003");
        
        Turma turmaA = new Turma("TURMA-A", "2025.1");
        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaA.adicionarAluno(aluno3);
        
        turmaA.listarAlunos();
        
        System.out.println("\nRemovendo um aluno da turma...");
        turmaA.removerAluno(aluno2);
        System.out.println("Aluno ainda existe? " + (aluno2 != null ? "SIM" : "NÃO"));
        System.out.println("Nome do aluno: " + aluno2.getNome());
        
        // === 3. COMPOSIÇÃO: Aluno e Boletim ===
        System.out.println("\n\n【3】 COMPOSIÇÃO - Aluno e Boletim");
        System.out.println("─────────────────────────────────────────────────");
        
        // Adicionando avaliações ao boletim do aluno1
        Prova prova1 = new Prova("Matemática", 8.5, 10);
        Prova prova2 = new Prova("História", 7.0, 15);
        Trabalho trabalho1 = new Trabalho("Revolução Industrial", 9.0, "Seminário");
        
        aluno1.getBoletim().adicionarAvaliacao(prova1);
        aluno1.getBoletim().adicionarAvaliacao(prova2);
        aluno1.getBoletim().adicionarAvaliacao(trabalho1);
        
        aluno1.exibirInformacoes();
        
        // === 4. INTERFACE: IAvaliacao ===
        System.out.println("\n\n【4】 INTERFACE - IAvaliacao (Prova e Trabalho)");
        System.out.println("─────────────────────────────────────────────────");
        
        IAvaliacao av1 = new Prova("Física", 6.5, 20);
        IAvaliacao av2 = new Trabalho("Energia Solar", 8.0, "Pesquisa");
        
        System.out.println("Demonstrando polimorfismo:");
        av1.exibirDetalhes();
        System.out.println("  Resultado da avaliação: " + av1.avaliar());
        
        av2.exibirDetalhes();
        System.out.println("  Resultado da avaliação: " + av2.avaliar());
        
        // === RESUMO FINAL ===
        System.out.println("\n\n╔════════════════════════════════════════════════╗");
        System.out.println("║              RESUMO DAS RELAÇÕES              ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println("✓ ASSOCIAÇÃO: Professor ←→ Curso (independentes)");
        System.out.println("✓ AGREGAÇÃO: Turma ◇ Alunos (alunos existem sozinhos)");
        System.out.println("✓ COMPOSIÇÃO: Aluno ◆ Boletim (boletim pertence ao aluno)");
        System.out.println("✓ INTERFACE: IAvaliacao ← Prova, Trabalho\n");
    }
}