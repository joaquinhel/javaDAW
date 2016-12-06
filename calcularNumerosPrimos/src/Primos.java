
import java.util.InputMismatchException;
import java.util.Scanner;

//Supuesto 3: Escribe un programa que lea un número y lo descomponga en factores primos.

/**
 * @author Joaquín
 */

public class Primos {
    int num;//Creo la variable

    /**
     * Método para la introducción de números por teclado
     * @return num
     */
    public int pedirNumero() {
        boolean error = false;
        do {
            try {
                Scanner teclado = new Scanner(System.in);//Introducimos el número por teclado
                System.out.print("Introduce un número entero mayor que 0: ");
                num = teclado.nextInt(); //Le doy valor a la variable int que he creado anteiormente.
                error = false;
            } catch (InputMismatchException e) {
                System.err.println("Debe introducir un número y sin decimales.\n");
                error = true;
            }
        } while (num < 1 || error == true); //Mientras el número sea mayor a 1 se sigue el bucle do-while
        return num;
    }

    /**
     * Método que reliza los cáculos para determinar la descomposición en números primos del dato introducido.
     * @param num 
     */
    public void calcular(int num) {
        int primo = 2;
        this.num = num;

        if (num == 1) { //Si el número introducido es uno.
            System.out.println("1 = 1");
        } else { // Si el número introducido es mayor que 1
            System.out.print(num + " = ");
            //Seguimos iterando hasta que el número sea distinto a primo que se inicializa en 2.
            while (num != primo) {
                if (num % primo == 0) { // Es divisible por valor de número primo
                    System.out.print(primo + " * ");
                    num = (num / primo);
                } else { // Si no es divisible por el nÃºmero
                    primo++;
                }
            }
            // Debemos añadir el último primo manualmente, ya que sale del bucle while sin visualizarlo
            System.out.println(primo + " * 1");
        }
    }
/**
 * Método principal de la clase
 * @param args 
 */
    public static void main(String[] args) {
        Primos p1 = new Primos(); //Declaro el objeto p1
        p1.calcular(p1.pedirNumero()); //Llamo al método cáculos del objeto p1 y le paso como parámetro el método pedirNumeros
    }

}
