package escola;

public class monitores extends funcionarios{
    static int numeroMonitores;

    


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

    public monitores(String nome, int idade, double altura, String concursado) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.concursado = concursado;
        numeroMonitores ++;
    }

    @Override
    public void frase(){
        System.out.println("Só a educação liberta.");
    }

    public static int getNumeroMonitores() {
        return numeroMonitores;
    }

    public static void setNumeroMonitores(int numeroMonitores) {
        monitores.numeroMonitores = numeroMonitores;
    }
    

    
}
