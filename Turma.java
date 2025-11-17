class Turma {
    private String codigo;
    private String periodo;
    private java.util.List<Aluno> alunos; // AGREGAÇÃO: Alunos existem independentemente
    
    public Turma(String codigo, String periodo) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.alunos = new java.util.ArrayList<>();
    }
    
    // Turma apenas agrupa alunos, não os cria
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + codigo);
    }
    
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido da turma " + codigo);
        // O aluno continua existindo mesmo após ser removido da turma
    }
    
    public void listarAlunos() {
        System.out.println("\n=== TURMA " + codigo + " - Período: " + periodo + " ===");
        System.out.println("Total de alunos: " + alunos.size());
        for (Aluno aluno : alunos) {
            System.out.println("  - " + aluno.getNome() + " (" + aluno.getMatricula() + ")");
        }
    }
    
    public java.util.List<Aluno> getAlunos() {
        return alunos;
    }
}