/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HAClass;

/**
 *
 * @author USER
 */
public class Clientes5 extends Persona5{ 
    private int idEmpleado;
    private boolean VIP;
    private static int contadorEmpleado;

    public Clientes5(boolean VIP, String nombre, int edad) {
        super(nombre, edad);
        this.idEmpleado = ++Clientes5.contadorEmpleado;
        this.VIP = VIP;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Clientes5.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes5{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", VIP=").append(VIP);
        sb.append(", {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    //

    @Override
    public String obtenerDatos() {
        return super.obtenerDatos()+"VIP"+this.VIP; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
