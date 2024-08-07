package basic_ops;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!conjuntoPalavras.isEmpty()) {
            if (conjuntoPalavras.contains(palavra)) {
                conjuntoPalavras.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void verificarPalavra(String palavra) {
        if (conjuntoPalavras.contains(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" está presente no conjunto referenciado.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" NÃO está presente no conjunto referenciado.");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjPalavras = new ConjuntoPalavrasUnicas();

        conjPalavras.adicionarPalavra("Palavra 1");
        conjPalavras.adicionarPalavra("Palavra 2");
        conjPalavras.adicionarPalavra("Palavra 3");
        conjPalavras.exibirPalavrasUnicas();

        conjPalavras.verificarPalavra("Palavra 2");
        conjPalavras.removerPalavra("Palavra 2");

        conjPalavras.exibirPalavrasUnicas();
    }
}
