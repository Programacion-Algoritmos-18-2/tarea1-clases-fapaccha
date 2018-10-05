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
        Estudiantes e1 = new Estudiantes();
        System.out.println("Ingrese nombre del Estudiante 1");
        e1.setNombre(entrada.nextLine());
        System.out.println("Ingrese Apellido del Estudiante 1 ");
        e1.setApellido(entrada.nextLine());
        Estudiantes e2 = new Estudiantes();
        System.out.println("Ingrese nombre del Estudiante 2");
        e2.setNombre(entrada.nextLine());
        System.out.println("Ingrese Apellido del Estudiante 2");
        e2.setApellido(entrada.nextLine());
        System.out.println("Nombre Estudiante 1"+e1);
        System.out.println("Nombre Estudiante 2"+e2);
    }

    
    
}
