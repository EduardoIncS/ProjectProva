package ProjectProva;

public abstract class Aluno {
    protected String nome;
    protected double[] notas;

    public Aluno(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double[] getNotas(){
        return notas;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma/3;
    }
    
}