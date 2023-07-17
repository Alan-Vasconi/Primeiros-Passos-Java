import escola.alunos;

public class Main {
    public static void main(String[] args){
        
        alunos aluno_novo = new alunos("Alan", 19, 1.90,"Não"); 
        
        System.out.println(aluno_novo.pagar("Pagou"));

    }
}
