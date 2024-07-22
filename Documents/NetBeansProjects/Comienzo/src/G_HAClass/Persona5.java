/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HAClass;

/**
 *
 * @author USER
 */
public class Persona5 {
    protected String nombre;
    protected int edad;

    public Persona5() {
    }
    
    public Persona5(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String obtenerDatos() {
        return "".formatted("Nombre: "+this.nombre);
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
        StringBuilder sb = new StringBuilder();
        sb.append("Persona5{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
    
}
