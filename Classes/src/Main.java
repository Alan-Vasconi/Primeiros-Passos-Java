import animais.cachorro;

public class Main {
    public static void main(String[] args){
        cachorro cachorro1 = new cachorro(); // Cria-se um novo cachorro baseado nos dados de cachorro
// É atribuido as características do cachorro1
        cachorro1.nome = "Brutus";
        cachorro1.altura = 190;
        cachorro1.comprimento = 50;
        cachorro1.cor = "Preto";
        cachorro1.peso = 18.5;
        System.out.println(cachorro1); // Pode-se perceber o endereço que tem na memória
    }
}
