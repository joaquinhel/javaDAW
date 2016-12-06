
//Ejercicio 4

/*Crea un constructor con parámetros para la clase Persona que inicialice los 
atributos del objeto con los valores indicados en los parámetros. A continuación 
crea un proyecto que declare un objeto de tipo Persona utilizando el constructor, 
para posteriormente mostrar el contenido de los atributos por pantalla. 
Utiliza el operador this. */

package persona;

import java.util.Scanner;

public class Persona {

//Variables
    private String nombre;
    private int edad;
    private float altura;

    public Persona(String nombre, int edad, float altura) { //Método constructor con tres parámetros
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

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
        this.edad = edad; //El operador this evita que exista confusión entre el parámetro edad y la variable edad
    }

    void cambia_Altura(float altura) { // Método que nos permitirá definir o cambiar la altura
        this.altura = altura; //El operador this evita que exista confusión entre el parámetro altura y la variable altura
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Introducimos los datos por teclado
        System.out.println("Introduzca el nombre de una persona: ");
        String nomPersona = teclado.nextLine();

        System.out.println("Introduzca la edad de una persona: ");
        int edadPersona = teclado.nextInt();

        System.out.println("Introduzca la altura de una persona: ");
        String alturaPersona = teclado.next(); //Introducimos un String
        String alturaPersona1 = alturaPersona.replace(",", "."); //Cambiamos la "," por el "." para evitar errores en la introducción
        float alturaFinal = Float.parseFloat(alturaPersona1); //Convertimos el String en Float

        //Creamos un objeto de persona que tendrá sus variables y métodos
        //Las variables introducidas por teclado serán los parámetros
        Persona objPersona1 = new Persona(nomPersona, edadPersona, alturaFinal);

        System.out.println("\n--------El valor introducido de las variables es: ----------");
        //Accedemos a los métodos consulta_XXXX() que nos devolverá como return las variables buscadas
        System.out.println("El nombre de la persona introducida es: " + objPersona1.consulta_Nombre());
        System.out.println("La edad de la persona introducida es: " + objPersona1.consulta_Edad());
        System.out.println("La altura introducida de la persona es: " + objPersona1.consulta_Altura());

        //Esta parte no la pide el ejercicio, pero me resulta interesante probarla
        System.out.println("\n--------Cambiamos el valor de las varibles: ---------");
        //Accedemos a los métodos cambia_XXXX y le pasamos como parámetro las varibles
        objPersona1.cambia_Nombre("Lucia");
        objPersona1.cambia_Edad(22);
        objPersona1.cambia_Altura(1.70f);

        System.out.println("El nombre de la persona introducida es: " + objPersona1.consulta_Nombre());
        System.out.println("La edad de la persona introducida es: " + objPersona1.consulta_Edad());
        System.out.println("La altura introducida de la persona es: " + objPersona1.consulta_Altura());
    }
}
