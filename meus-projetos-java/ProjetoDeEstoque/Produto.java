public class Produto {

    String nome;
    int quantidade;

    void darEntrada(int qtd) {
        quantidade = quantidade + qtd;
    }

    void darSaida(int qtd) {
        if (qtd > quantidade) {
            System.out.println("Quantidade Insuficiente!!");
        } else {
            quantidade = quantidade - qtd;
        }
    }

    @Override
    public String toString() {
        return nome + " - Quantidade: " + quantidade;
    }
}
