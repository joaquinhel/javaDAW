/* Diseña un programa Java que pida dos números por teclado, 
 determine si el primero es múltiplo del segundo y muestre el resultado.*/
package prog2_ejer05;

import java.util.Scanner;
/**
 * @author Joaquín
 */
public class PROG2_Ejer05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Creamos el objeto teclado de la Clase Scanner con la que introducimos los datos

        //Pedimos el primer número por teclado que será de tipo float, ya que el enunciado no nos dice que tenga que se entero
        System.out.println("Intruzca un número: ");
        float x = teclado.nextFloat();

        //Pedimos el segundo número por teclado que también será de tipo int
        System.out.println("Introduzca el segundo número: ");
        float y = teclado.nextFloat();

        //Realizamos la división
        float resultado = (x / y);
        
        //Mostramos los resultados
        System.out.printf("\nEl resultado de la división (x/y) es %.2f: ", resultado,"\n");
        System.out.println("\nEl resto es de: " + (x % y)+ ", por lo tanto");

        if (x % y == 0) {
            System.out.printf("%.2f SI es múltiplo de %.2f\n", x, y);
           
        } else {
            System.out.printf("%.2f NO es múltiplo de %.2f\n", x, y);
           
        }
    }
}
