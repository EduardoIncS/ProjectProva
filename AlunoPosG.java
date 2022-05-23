package ProjectProva;

public class AlunoPosG extends Aluno{
    private String orientador;

    public AlunoPosG(String nome, double[] notas, String orientador){
        super(nome, notas);
        this.orientador = orientador;
    }

    public double calcularMedia(){
        double soma = 0;
        int[] j = {2, 3, 5};
        for (int i = 0, k = 0; i < notas.length; i++, k++){
            soma += notas[i] * j[k]; 
        }
        return soma/10; 
    }
    
}
