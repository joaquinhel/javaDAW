
//Ejercicio 1.

/*La clase debe incluir un método principal que solicite un valor al usuario y
lo introduzca en el atributo nombre, para posteriormente mostrar por pantalla 
el nuevo valor del atributo.*/

package persona;
import java.util.Scanner;

public class Persona {

//Definimos las Variables
    private String nombre;
    private int edad;
    private float altura;

    //Método para consultar el nombre
    String consulta_Nombre() {
        return nombre;
    }
    
//Método para cambiar el nombre
    void cambia_Nombre(String nom) {
        nombre = nom;
    }

    //Método principal de la clase
    public static void main(String[] args) {
        //Declaramos el objeto teclado de la clase Scanner para la introducción de los datos
        Scanner teclado = new Scanner(System.in);  

        //Introducimos el nombre de una persona por teclado
        System.out.println("Introduzca el nombre de una persona: ");
        String persona = teclado.nextLine();

        //Creamos un objeto de persona que tendrá sus variables y métodos
        Persona objPersona1 = new Persona();

        //Accedemos al método cambia_Nombre y le pasamos como parámetro el nombre que acabamos de introducir
        objPersona1.cambia_Nombre(persona);

        System.out.println("\nEl nombre de la persona introducida es: ");
        //Accedemos al método consulta_Nombre() que nos devolverá como return el nombre
        System.out.println(objPersona1.consulta_Nombre());

    }

}
