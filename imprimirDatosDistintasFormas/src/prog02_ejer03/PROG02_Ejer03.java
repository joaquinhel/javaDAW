package prog02_ejer03;

/**
 * @author Joaquín Sánchez
 * @class PROG02_Ejer03
 * @descripción: Ejemplo con variables en Java
 */
public class PROG02_Ejer03 { // nombre de la clase

    public enum sexo {
        V, M
    } // variable sexo de tipo "enumerado" con 2 posibles valores

    public static void main(String[] args) { // clase principal main
        boolean casado = true;
        final int MAXIMO = 999999;
        byte diasem = 1;
        short dia_año = 300;
        long miliseg = 1298332800000L;
        float totalfactura = (float) 10350.678;
        long poblacion = 6775235741L;
        sexo genero = sexo.M; //La variable genero proviene de sexo y le asignamos el valor M

        // visualizacin de las variables con println
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.println("El valor de la variable casado es " + casado);
        System.out.println("El valor de la variable MAXIMO es " + MAXIMO);
        System.out.println("El valor de la variable diasem es " + diasem);
        System.out.println("El valor de la variable dia_añoo es " + dia_año);
        System.out.println("El valor de la variable miliseg es " + miliseg);
        System.out.println("El valor de la variable totalfactura es " + totalfactura);
        System.out.println("El valor de la variable poblacion es " + poblacion);
        System.out.println("El valor de la variable sexo es " + genero);

        // visualización de las variables con print
        System.out.print("\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.print("\nEl valor de la variable casado es " + casado);
        System.out.print("\nEl valor de la variable MAXIMO es " + MAXIMO);
        System.out.print("\nEl valor de la variable diasem es " + diasem);
        System.out.print("\nEl valor de la variable dia_año es " + dia_año);
        System.out.print("\nEl valor de la variable miliseg es " + miliseg);
        System.out.print("\nEl valor de la variable totalfactura es " + totalfactura);
        System.out.print("\nEl valor de la variable poblacion es " + poblacion);
        System.out.print("\nEl valor de la variable sexo es " + genero + "\n");

        // visualización de las variables con printf
        System.out.printf("\n----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.printf("\nEl valor de la variable casado es " + casado);
        System.out.printf("\nEl valor de la variable MAXIMO es " + MAXIMO);
        System.out.printf("\nEl valor de la variable diasem es " + diasem);
        System.out.printf("\nEl valor de la variable dia_año es " + dia_año);
        System.out.printf("\nEl valor de la variable miliseg es " + miliseg);
        System.out.printf("\nEl valor de la variable totalfactura es " + totalfactura);
        System.out.printf("\nEl valor de la variable poblacion es " + poblacion);
        System.out.printf("\nEl valor de la variable sexo es " + genero + "\n");

    } // cierre de la clase main

} // cierre de la clase PROG02_Ejer03

