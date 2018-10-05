/*
  Realizar un programa que permita crear dos objetos de una clase Estudiante  
 */
package ejercicio_1;
/**
 *  
 * @author user
 */
import java.util.Scanner;
public class Ejercicio_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudiantes a1 = new Estudiantes();
        System.out.println("Nombre Alumno 1");
        a1.setNombre(entrada.nextLine());
        System.out.println("Apellido Alumno 2 ");
        a1.setApellido(entrada.nextLine());
        Estudiantes a2 = new Estudiantes();
        System.out.println("Nombre Alumno 1");
        a2.setNombre(entrada.nextLine());
        System.out.println("Apellido Alumno 2");
        a2.setApellido(entrada.nextLine());
        System.out.println("Alumno 1"+a1);
        System.out.println("Alumno 2"+a2);
    }

    
    
}
