package list.basic_ops.carrinho_compras;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;


    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void removerUnidade() {
        quantidade--;
    }

    @Override
    public String toString() {
        return "\n\nItem: " + nome + "\nquantidade: " + quantidade + "\npreço unitário: R$" + preco;
    }
}
