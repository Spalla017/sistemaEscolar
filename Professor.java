class Professor {
    private String nome;
    private String especialidade;
    private Curso cursoLecionado; // ASSOCIAÇÃO: Professor está associado a um Curso
    
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    // Professor pode dar aula para um curso (associação bidirecional fraca)
    public void darAulaParaCurso(Curso curso) {
        this.cursoLecionado = curso;
        System.out.println("Professor " + nome + " agora leciona " + curso.getNome());
    }
    
    public void exibirInformacoes() {
        System.out.println("\n--- PROFESSOR ---");
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (cursoLecionado != null) {
            System.out.print("Ministra o ");
            cursoLecionado.exibirInformacoes();
        } else {
            System.out.println("Não está lecionando nenhum curso no momento");
        }
    }
    
    public String getNome() {
        return nome;
    }
}