package prog02_ejer09;

import java.util.Scanner;

/**
 * @author Joaquín
 */
/**
 * 9.- Diseña un programa Java que solicite un número de 5 dígitos del teclado,
 * separe el número en sus dígitos individuales y los muestre por pantalla. Por
 * ejemplo, si el número es 53123 que muestre: 5 3 1 2 3
 */
public class PROG02_Ejer09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Introduzca un número de cinco cifras: ");
            numero = teclado.nextInt();
        } while (numero < 10000 || numero > 99999);

        int numero1 = (numero / 10);
        int numero2 = (numero / 100);
        int numero3 = (numero / 1000);

        int N1 = (numero / 10000);
        int N2 = (numero3 % 10);
        int N3 = (numero2 % 10);
        int N4 = (numero1 % 10);
        int N5 = (numero % 10);

        System.out.println("Sus dígitos separados son: ");
        System.out.println(N1 + " " + N2 + " " + N3 + " " + N4 + " " + N5);

    }

}
