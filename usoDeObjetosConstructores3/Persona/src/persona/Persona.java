
//Ejercicio 3

/*De la misma forma que has creado los métodos anteriores, crea ahora un método 
constructor para la clase Persona que al declarar un objeto de tipo Persona 
asigne los siguientes valores a sus atributos:
nombre="Luisa Perez"
edad=22
altura=1,70
A continuación crea un proyecto que declare un objeto de tipo Persona utilizando 
el constructor, para posteriormente mostrar el contenido de sus atributos por pantalla*/

package persona;

public class Persona {
 
 String nombre;
 int edad;
 float altura;
  
    //Constructor de objetos de la clase Persona
    public Persona (){  
        //Parametros predeterminados del constructor
        nombre = "Luisa Perez"; 
        edad = 22;
        altura = 1.70F;
    }
     
   String consulta_Nombre(){ //Método para la consulta del nombre
        return nombre;
    }
  
    int consulta_Edad(){ //Método para la consulta de la edad
        return edad;
    }
  
    float consulta_Altura(){ //Método para la consulta de la altura
        return altura;
    }
     
    void cambia_Nombre(String nom){ // Método que nos permitirá definir o cambiar el nombre
        nombre=nom;
    }
     
    void cambia_Edad(int age){ // Método que nos permitirá definir o cambiar la edad
        edad=age;
    }
     
    void cambia_Altura(float alt){ // Método que nos permitirá definir o cambiar la altura
        altura=alt;
    }
        
    public static void main(String[] args) {

        //Creamos un objeto de persona a la que pasamos como parámetros los datos propuestos
        Persona objPersona1 = new Persona();

       //Accedemos a los métodos consulta_XXXX() que nos devolverá como return las variables anteriores
        System.out.println("El nombre de la persona introducida es: " + objPersona1.consulta_Nombre());
        System.out.println("La edad de " + objPersona1.consulta_Nombre()+ " es de " + objPersona1.consulta_Edad()+ " años");
        System.out.println("La altura de " + objPersona1.consulta_Nombre()+ " es de " + objPersona1.consulta_Altura()+" metros");
    }
}