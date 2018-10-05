/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author user
 */
public class Estudiantes {
    private String Nombre;
    private String Apellido;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }

    
    
}
