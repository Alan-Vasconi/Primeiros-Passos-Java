import escola.alunos;
import escola.monitores;
import escola.professores;

public class Main {
    public static void main(String[] args){
        
        alunos aluno_novo = new alunos("Alan", 19, 1.90,"Não"); 
        
        System.out.println(aluno_novo.pagar("Pagou"));
        
        System.out.println(alunos.getNumeroAlunos());
        
        monitores monitor_novo = new monitores("José", 19, 1.60,"Não"); 

        System.out.println(monitores.getNumeroMonitores());

        professores professor_novo = new professores("Maria", 21, 1.57,"Sim");

        System.out.println(professores.getNumeroProfessores());
        
        // Frases são modificadas de acordo com qual classe nos referimos
        
        professor_novo.frase(); 
        monitor_novo.frase();
    }
}
