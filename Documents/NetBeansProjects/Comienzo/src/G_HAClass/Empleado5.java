/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HAClass;

/**
 *
 * @author USER
 */
public class Empleado5 extends Persona5{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado5(double sueldo,String nombre, int edad) {
        super(nombre, edad);
        this.idEmpleado = ++Empleado5.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado5{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
