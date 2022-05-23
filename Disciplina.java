package ProjectProva;

import java.util.ArrayList;

public class Disciplina {
    protected String nome;
    ArrayList<Aluno> semestre;

    public Disciplina(String nome){
        this.nome = nome;
        semestre = new ArrayList<Aluno>();
    }

    public void adicionar(Aluno x){
        semestre.add(x);
    }

    public void listarAprovados(String tipo){
        if (tipo.equalsIgnoreCase("Graduação")){
            for (int i = 0; i < semestre.size(); i++){
                if (semestre.get(i) instanceof AlunoG){
                    if (semestre.get(i).calcularMedia() >= 6){
                        System.out.println(semestre.get(i).getNome());
                    }
                }
            }
        }
        else if (tipo.equalsIgnoreCase("Graduação")){
            for (int i = 0; i < semestre.size(); i++){
                if (semestre.get(i) instanceof AlunoPosG){
                    if (semestre.get(i).calcularMedia() >= 7){
                        System.out.println(semestre.get(i).getNome());
                    }
                }
            }
        }
        else{
            for (int i = 0; i < semestre.size(); i++){
                if (semestre.get(i) instanceof AlunoG && semestre.get(i).calcularMedia() >= 6) {
                    System.out.println(semestre.get(i).getNome());
                } else if (semestre.get(i) instanceof AlunoPosG && semestre.get(i).calcularMedia() >= 7) {
                    System.out.println(semestre.get(i).getNome());
                }
            }
        }
    }

}