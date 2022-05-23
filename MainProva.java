package ProjectProva;

import java.util.Scanner;

public class MainProva {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
    
        Disciplina POO = new Disciplina("POO");
        double[] notas = {10.0, 6.0, 5.5};
        Aluno a  = new AlunoPosG("Eduardo", notas, "Computação Universitária");
        Aluno b  = new AlunoG("Lucas", notas, "Computação Universitária");
        Aluno c  = new AlunoPosG("Matheus", notas, "Computação Universitária");
        Aluno d  = new AlunoPosG("Clara", notas, "Computação Universitária");
        Aluno e  = new AlunoG("Alicia", notas, "Computação Universitária");
    
        POO.adicionar(a);
        POO.adicionar(b);
        POO.adicionar(c);
        POO.adicionar(d);
        POO.adicionar(e);
    
        POO.listarAprovados("Ambos");
        reader.close();
    }
}
