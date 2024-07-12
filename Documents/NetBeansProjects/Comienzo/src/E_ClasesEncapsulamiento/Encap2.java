/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ClasesEncapsulamiento;

/**
 *
 * @author USER
 */
public class Encap2 {
    String nombre;
    int edad;

    public Encap2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
    return "Persona:[nombre: %s ,edad: %d]"
                    .formatted(this.nombre,this.edad);    
    }
    
}
