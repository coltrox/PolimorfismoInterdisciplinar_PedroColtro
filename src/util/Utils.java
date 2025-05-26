package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    private static Scanner sc = new Scanner(System.in);

    public static String lerString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public static int lerInt(String msg) {
        int numero = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print(msg);
            try {
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida. Digite um número inteiro.");
            }
        }
        return numero;
    }
}
