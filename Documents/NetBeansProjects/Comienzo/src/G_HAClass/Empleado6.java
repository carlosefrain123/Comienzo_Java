/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HAClass;

/**
 *
 * @author USER
 */
public class Empleado6 extends Persona6{
    protected int idEmpleado;
    protected int sueldo;
    protected static int contadorEmpleado;

    public Empleado6(int edad, int sueldo, String nombre) {
        super(nombre, edad);
        this.idEmpleado = ++Empleado6.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado6{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }    
    
}
