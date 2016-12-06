/**
 * 8.- Diseña un programa Java que calcule la suma, resta, multiplicación y
 * división de dos números introducidos por teclado. Incorpora también las
 * funciones que permitan realizar la potencia de un número y la raíz cuadrada
 * del otro. Salida del programa para x=9, y=3: 
 * Introducir primer numero: 9
 * Introducir segundo numero: 3 
 * x = 9.0 
 * y = 3.0 
 * x + y = 12.0 
 * x - y = 6.0 
 * x * y = * 27.0 
 * x / y = 3.0 
 * x ^ 2 = 81.0 
 * √ x = 3.0
 */

package prog2_ejer08;

import java.util.Scanner;

/**
 * @author Joaquín
 */
public class PROG2_Ejer08 {

    public static void main(String[] args) {

        //Util Scanner que nos permite introducir los datos por teclado
        Scanner teclado = new Scanner(System.in);

        //Introducimos el primer número:
        System.out.print("Introducir primer numero: ");
        float x = teclado.nextFloat();

        //Introducimos el segundo número:
        System.out.print("Introducir segundo numero: ");
        float y = teclado.nextFloat();

        System.out.printf("x = %.1f y = %.1f\n", x, y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x + y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x ^ y = " + (x * x));
        System.out.println("√x= " + (Math.sqrt(x)));

    }

}
