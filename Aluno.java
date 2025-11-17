class Aluno {
    private String nome;
    private String matricula;
    private Boletim boletim; // COMPOSIÇÃO: Boletim faz parte do ciclo de vida do Aluno
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        // Boletim é criado automaticamente com o Aluno
        this.boletim = new Boletim("2025.1");
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public Boletim getBoletim() {
        return boletim;
    }
    
    public void exibirInformacoes() {
        System.out.println("\n--- ALUNO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        boletim.exibirBoletim();
    }
}