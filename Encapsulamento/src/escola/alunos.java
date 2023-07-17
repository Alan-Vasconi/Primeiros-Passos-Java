package escola;

public class alunos {
    private String nome;

    private int idade;
    
    private double altura;
    
    private String bolsista;

    private String matricula;

    public alunos(){}

    public alunos(String nome, int idade, double altura, String bolsista){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.bolsista = bolsista;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getBolsista(){
        return this.bolsista;
    }
    
    public void setbolsista(String bolsista){
        this.bolsista = bolsista;
    }


    public String pagar(String valor){
        switch(valor){
            case "Pagou": this.matricula = nome + " está matriculado com sucesso!"; break;
            case "Não": this.matricula = "Matricula inválida, aguardando pagamento."; break;
            default: this.matricula = "Matricula não encontrada!"; break;

        }
        return matricula;
    }
}
