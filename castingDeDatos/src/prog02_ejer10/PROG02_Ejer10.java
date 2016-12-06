package prog02_ejer10;

/**
 * @author Joaquín
 */
/**
 * 10.- Diseña un programa Java que realice las siguientes operaciones, en el
 * orden que se muestran. *Se indica la variable y el tipo de dato que recibe el
 * valor o resultado de la operación indicada:
 */
public class PROG02_Ejer10 {

    public static void main(String[] args) {
        System.out.println("-------Conversiones entre enteros y coma flotante------");
        //Defino las varaibles de este apartado
        float x = 4.5f;//Añado la f porque es float
        int i = 2;
        int j = (int) (i * x); //Debo hacer el casting de int*float para que el resultado sea int
        //Resultado
        System.out.println("Producto de int por float: j= i*x = " + j);

        //Defino las varaibles de este apartado
        double dx = 2.0;
        float y = 3.0f; //Añado la f porque es float
        double dz = dx * y; //Double  * float = double  
        //Resultado
        System.out.println("Producto de float por double: dz=dx * y = " + dz + "\n\n");

        System.out.println("-------Operaciones con byte------");
        //Defino las variables
        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx - by); //Las operaciones tre byte dan como resultado int. Debo hacer el casting
        //Resultado
        System.out.println("byte: " + bx + " - " + by + " = " + bz);

        //Cambio el valor a las varaibles
        bx = -128;
        by = 1;
        bz = (byte) (bx - by); //Castin para pasar el resultado de int a byte
        //Resultado
        System.out.println("byte " + bx + " - " + by + " = " + bz);

        //Realizco la operación
        int num = bx - by; //Declaro la varible num que es entera. Conversión implicita
        //Resultado
        System.out.print("(int)(" + bx + " - " + by + ") = " + num + "\n\n\n");

        System.out.println("-------Operaciones con short------");
        //Defino las variables
        short sx = 5;
        short sy = 2;
        short sz = (short) (sx - sy);//Las operaciones con shor devuelven int por lo que debo hacer el casting
        //Resultado
        System.out.println("short: " + sx + " - " + sy + " = " + sz);

        //Modifico el valor de las variables y opero
        sx = 32767;
        sy = 1;
        sz = (short) (sx + sy); //Conversión explicita o casting
        //Resultado
        System.out.println("short: " + sx + " + " + sy + " = " + sz);

        System.out.print("\n\n------- Operaciones con char -------");
        //Defino las variables
        char cx = '\u000F';
        char cy = '\u0001';
        int z = (cx - cy);//La conversión es implicita
        //Resultado
        System.out.print("\nchar: " + cx + " - " + cy + " = " + z);

        //Variables
        z = ((int) cx) - 1;
        //Resultado
        System.out.printf("\nchar(%x) - 1 = %d ", (int) cx, z);

        //Variables
        cx = '\uFFFF';
        z = cx;
        //Resultado
        System.out.print("\n(int)= " + z);

        sx = (short) cx; // conversión explicita requerida
        //Resultado
        System.out.print("\n(short)= " + sx);

        sx = -32768;
        cx = (char) sx;
        z = (int) sx;
        sx = (short) cx; // conversión explicita requerida
        System.out.print("\n" + z + " short-char-int = " + z);

        sx = -1;
        cx = (char) sx; // conversion explicita
        z = (int) cx; // conversion explicita
        System.out.print("\n" + sx + " short-char-int = " + z + "\n");
    }

}
