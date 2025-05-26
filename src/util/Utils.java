//Declaração da localização
package util;

// Importação da classe Scanner para entrada de dados via console
import java.util.Scanner;

// Importação da classe Scanner para entrada de dados via console
public class Utils {
    private static Scanner sc = new Scanner(System.in);

    public static String lerString(String msg) {
        System.out.print(msg); // Exibe a mensagem ao usuário
        return sc.nextLine(); // Lê e retorna a linha digitada
    }
    
    public static int lerInt(String msg) {
        int numero = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print(msg);
            try {
                numero = Integer.parseInt(sc.nextLine());
                valido = true;     // Marca como válido se não der exceção
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida. Digite um número inteiro.");
            }
        }
        return numero;
    }
}
