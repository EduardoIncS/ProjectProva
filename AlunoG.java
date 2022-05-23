package ProjectProva;

public class AlunoG extends Aluno{
    private String nomeCurso;

    public AlunoG(String nome, double[] notas, String nomeCurso){
        super(nome, notas);
        this.nomeCurso = nomeCurso;
    }    
}