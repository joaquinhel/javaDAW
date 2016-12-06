
import java.util.Scanner;

//Supuesto 1: Realiza un programa que lea un número entero e indique si es par.
/**
 * @author Joaquín
 */
public class ParImpar {

    Scanner teclado = new Scanner(System.in);
    int num;
    boolean error;

    /**
     * Método para introducir el número por teclado
     * @return num
     */
    public int introducirDatos() {
        do {
            error = false;
            try {
                System.out.println("Introduzca un número entero: ");
                num = Integer.valueOf(teclado.nextLine());
            } catch (NumberFormatException e) {

                System.out.println("Debe introducir un número y sin decimales.\n");
                error = true;
            }
        } while (error == true);
        return num;
    }

    /**
     * Método que en función del valor introducido determinará si este es par o
     * impar
     * @param num
     */
    public void analizarDatos(int num) {
        this.num = num;

        int numPar = num % 2;

        if (numPar == 0) {
            System.out.println("El número introducido es par");
        } else if (numPar != 0) {
            System.out.println("El número introducido es impar");
        }
    }

    /**
     * Método principal de la clase
     * @param args
     */
    public static void main(String[] args) {
        ParImpar solucion = new ParImpar(); //Creamos el objeto de la clase ParImpar
        solucion.analizarDatos(solucion.introducirDatos()); //Ejecutamos el método analizarDatos pasando como parámetro el método que los introduce
    }
}
