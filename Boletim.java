class Boletim {
    private double notaFinal;
    private String periodo;
    private java.util.List<IAvaliacao> avaliacoes;
    
    // Boletim é criado junto com o Aluno e não existe sem ele
    public Boletim(String periodo) {
        this.periodo = periodo;
        this.avaliacoes = new java.util.ArrayList<>();
        this.notaFinal = 0.0;
    }
    
    public void adicionarAvaliacao(IAvaliacao avaliacao) {
        avaliacoes.add(avaliacao);
        calcularNotaFinal();
    }
    
    private void calcularNotaFinal() {
        if (avaliacoes.isEmpty()) {
            notaFinal = 0.0;
            return;
        }
        double soma = 0;
        for (IAvaliacao av : avaliacoes) {
            soma += av.avaliar();
        }
        notaFinal = soma / avaliacoes.size();
    }
    
    public void exibirBoletim() {
        System.out.println("  === Boletim do Período: " + periodo + " ===");
        for (IAvaliacao av : avaliacoes) {
            av.exibirDetalhes();
        }
        System.out.println("  Nota Final: " + String.format("%.2f", notaFinal));
        System.out.println("  Status: " + (notaFinal >= 6.0 ? "APROVADO" : "REPROVADO"));
    }
    
    public double getNotaFinal() {
        return notaFinal;
    }
}