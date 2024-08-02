package explorando_telefonia;
import java.util.Scanner;

public class Telefonia {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            if (servico.equals("tv")) {
                tvContratada = true;
            } else if (servico.equals("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.equals("movel")) {
                movelContratado = true;
            }
        }

        if (tvContratada && bandaLargaContratada && movelContratado) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}