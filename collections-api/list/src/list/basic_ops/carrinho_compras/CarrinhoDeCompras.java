package list.basic_ops.carrinho_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
        System.out.printf("%dx \"%s\" adicionado ao carrinho (+ R$%.2f).\n", quantidade, nome, preco*quantidade);
    }

    public void removerItem(String nome) {
        for (Item i : carrinhoCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                if (i.getQuantidade() > 1) {
                    i.removerUnidade();
                } else {
                    carrinhoCompras.remove(i);
                }
            }
        }
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item i : carrinhoCompras) {
            total += i.getPreco()*i.getQuantidade();
        }
        System.out.printf("O valor total dos itens no carrinho é de R$%.2f.\n", total);
    }

    public void exibirItens() {
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Nutella", 33.50, 2);
        carrinho.adicionarItem("Saco de arroz", 16.75, 1);
        carrinho.adicionarItem("Saco de feijão", 12, 2);

        carrinho.exibirItens();

        carrinho.removerItem("saco de arroz");

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
