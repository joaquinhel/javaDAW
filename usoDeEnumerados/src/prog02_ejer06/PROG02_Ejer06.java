package prog02_ejer06;

/**
 * @author Joaquín
 */

/**
 * 6.Diseña un programa Java que cree un tipo enumerado para los meses del año.
 * El programa debe realizar las siguientes operaciones: Crear una variable m
 * del tipo enumerado y asignarle el mes de marzo. Mostrar por pantalla su
 * valor. Asignar a la variable m, la cadena de texto "MARZO". Mostrar por
 * pantalla el valor de la variable de tipo enumerado tras realizar la
 * asignación.
 */
public class PROG02_Ejer06 {

//Tipo enumerado para los meses del año    
    public enum año {

        Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiempre, Octubre, Noviembre, Diciembre
    }

    public static void main(String[] args) {
        //Creación de la variable m de tipo enumerado a la que le asignamos el valor m
        año m = año.Marzo;
        System.out.println("El valor asignado a la variable m es: " + m);
    }

}
