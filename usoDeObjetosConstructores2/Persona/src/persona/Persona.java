//Ejercicio 2

/*Añade a la clase Persona los métodos que faltan para poder consultar y modificar 
 el valor de todos los atributos. Para ello observa cómo se han creado los métodos 
 del atributo nombre y determina los parámetros y resultado de los demás atributos. 
 Después completa el programa para comprobar el funcionamiento de los nuevos métodos */

package persona;

import java.util.Scanner;

public class Persona {

//Variables
    private String nombre;
    private int edad;
    private float altura;

    String consulta_Nombre() { //Método para la consulta del nombre
        return nombre;
    }

    int consulta_Edad() { //Método para la consulta de la edad
        return edad;
    }

    float consulta_Altura() { //Método para la consulta de la altura
        return altura;
    }

    void cambia_Nombre(String nom) { // Método que nos permitirá definir o cambiar el nombre
        nombre = nom;
    }

    void cambia_Edad(int edad) { // Método que nos permitirá definir o cambiar la edad
        this.edad = edad;
    }

    void cambia_Altura(float altura) { // Método que nos permitirá definir o cambiar la altura
        this.altura = altura;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Introducimos el nombre por teclado
        System.out.println("Introduzca el nombre de una persona: ");
        String nomPersona = teclado.nextLine();
        
        //Introducimos la edad por teclado
        System.out.println("Introduzca la edad de una persona: ");
        int edadPersona = teclado.nextInt();

        //Introducimos la altura por teclado
        System.out.println("Introduzca la altura de una persona: ");
        String alturaPersona = teclado.next(); //Introducimos un String

        String alturaPersona1 = alturaPersona.replace(",", "."); //Cambiamos la "," por el "." para evitar errores
        float alturaFinal = Float.parseFloat(alturaPersona1); //Convertimos el String en Float

        //Creamos un objeto de persona que tendrá sus variables y métodos
        Persona objPersona1 = new Persona();

        //Accedemos a los métodos cambia_XXXX y le pasamos como parámetro los que acabamos de introducir
        objPersona1.cambia_Nombre(nomPersona);
        objPersona1.cambia_Edad(edadPersona);
        objPersona1.cambia_Altura(alturaFinal);

        //Accedemos a los métodos consulta_XXXX() que nos devolverá como return las variables buscadas
        System.out.println("\nEl nombre de la persona introducida es: " + objPersona1.consulta_Nombre());
        System.out.println("La edad de la persona introducida es: " + objPersona1.consulta_Edad());
        System.out.println("La altura introducida de la persona es: " + objPersona1.consulta_Altura());
    }
}
