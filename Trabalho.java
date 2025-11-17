class Trabalho implements IAvaliacao {
    private String tema;
    private double nota;
    private String tipo;
    
    public Trabalho(String tema, double nota, String tipo) {
        this.tema = tema;
        this.nota = nota;
        this.tipo = tipo;
    }
    
    @Override
    public double avaliar() {
        return nota;
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("  [TRABALHO] Tema: " + tema + 
                         " | Nota: " + nota + 
                         " | Tipo: " + tipo);
    }
}