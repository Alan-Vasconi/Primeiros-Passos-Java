package escola;

public class professores extends funcionarios{

    static int numeroProfessores;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getConcursado() {
        return concursado;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setConcursado(String concursado) {
        this.concursado = concursado;
    }


    public professores(String nome, int idade, double altura, String concursado) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.concursado = concursado;
        numeroProfessores ++;
    }
    

    @Override
    public void frase(){
        System.out.println("Educar a mente sem educar o coração não é educação.");
    }

    public static int getNumeroProfessores() {
        return numeroProfessores;
    }

    public static void setNumeroProfessores(int numeroProfessores) {
        professores.numeroProfessores = numeroProfessores;
    }
    
}

