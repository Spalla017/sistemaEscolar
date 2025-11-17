class Prova implements IAvaliacao {
    private String disciplina;
    private double nota;
    private int numeroQuestoes;
    
    public Prova(String disciplina, double nota, int numeroQuestoes) {
        this.disciplina = disciplina;
        this.nota = nota;
        this.numeroQuestoes = numeroQuestoes;
    }
    
    @Override
    public double avaliar() {
        return nota;
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("  [PROVA] Disciplina: " + disciplina + 
                         " | Nota: " + nota + 
                         " | Questões: " + numeroQuestoes);
    }
}
