package util;

import java.util.Scanner;

public class Utils {
    private static Scanner sc = new Scanner(System.in);

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    public static double lerDouble(String mensagem) {
        double valor = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensagem);
                valor = Double.parseDouble(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número.");
            }
        } while (!valido);
        return valor;
    }
}
