import java.util.Arrays;
import java.util.List;

/*
Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */

public class Desafio_05 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosFiltrados = numeros
                .stream()
                .filter(n -> n > 5)
                .toList();

        double mediaNumerosFiltrados = (double) numerosFiltrados.stream().reduce(0, Integer::sum) / (long) numerosFiltrados.size();

        System.out.println(mediaNumerosFiltrados);
    }
}
