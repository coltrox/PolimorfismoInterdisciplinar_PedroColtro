package util;

// Importa a classe Scanner 
import java.util.Scanner;

public class Utils {
    // Cria um Scanner para usar nos métodos da classe
    private static Scanner sc = new Scanner(System.in);

    public static String lerString(String mensagem) {
        // Exibe a mensagem passada
        System.out.print(mensagem);
        // Retorna a linha digitada pelo usuário
        return sc.nextLine();
    }

    
    public static double lerDouble(String mensagem) {
        double valor = 0;
        boolean valido = false;

        // Repete até usuáriio digitar valor válido
        do {
            try {
                // Exibe a mensagem e tenta converter a entrada para double
                System.out.print(mensagem);
                valor = Double.parseDouble(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                // se a entrada não for um número xibe uma mensagem de erro
                System.out.println("Valor inválido. Digite um número.");
            }
        } while (!valido); //repete ate ser válido

        
        return valor;
    }
}
