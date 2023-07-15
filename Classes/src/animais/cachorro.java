package animais;

public class cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int comprimento;
    
    public void comer(){}
    
    public void latir(){
        System.out.println("Auuu Auuu");
    }

    public String estado;

    public String pegar(){
        return "Bolinha";
    }

    public String interacao(String acao){
        if (acao.equals("carinho")){
            this.estado = "feliz";
        }
        else if (acao.equals("ofender")){
            this.estado = "bravo";
        }
        else{
            this.estado = "neutro";
        }
        return estado;
    }
}
