/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ClasesEncapsulamiento;

/**
 *
 * @author USER
 */
public class Encap1 {
    private String nombre;
    private int edad;
    private boolean eliminado;

    public Encap1(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
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

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    //POO Encapsulamiento

    @Override
    public String toString() {
        return "Persona: [Nombre: %s,Edad: %d, Eliminado %b]"
                .formatted(this.nombre,this.edad,this.eliminado);
    }
}
