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
        
        cachorro1.pegar();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interacao("ofender"));
        System.out.println("O cachorro está " + cachorro1.interacao("carinho"));
        System.out.println("O cachorro está " + cachorro1.interacao("nada"));
        // Manda uma ação que recebe uma resposta de acordo com a acao em cima do cachorro
    }
}
