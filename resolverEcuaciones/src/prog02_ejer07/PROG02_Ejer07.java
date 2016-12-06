/*7.- Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x),
 suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
 C1x + C2 = 0
*/

package prog02_ejer07;

import java.util.Scanner;

public class PROG02_Ejer07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Creamos el objeto teclado de la Clase Scanner con la que introducimos los datos

        //Introducimos la varible C1, será tipo float, ya que el enunciado no nos da información al respecto
        System.out.println("Intruzca un el valor de C1: ");
        float C1 = teclado.nextFloat();

        //Introducimos la variable C2, será tipo float, ya que el enunciado no nos da información al respecto
        System.out.println("Introduzca el valor de C2: ");
        float C2 = teclado.nextFloat();

        //Mostramos lo resultados por pantalla
        System.out.println("\nEl valor de x se obtiene al dicivir división -C2/C1");
        System.out.printf("El resultado de (%.1f x + %.1f = 0) es = %.2f\n", C1, C2, (-(C2 / C1)));
    }

}
