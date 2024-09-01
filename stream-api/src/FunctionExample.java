import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 15, 35, 128, 512);

        List<Integer> numerosTriplicados = numeros.stream().map(n -> n*3).toList();

        numerosTriplicados.forEach(System.out::println);

    }
}
