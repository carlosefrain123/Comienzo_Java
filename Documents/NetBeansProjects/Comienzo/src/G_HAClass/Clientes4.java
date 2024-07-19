/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HAClass;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Clientes4 extends Persona4{
    private int idCliente;
    private Date fechaRegistro;
    private boolean VIP;
    private static int contadorCliente;

    public Clientes4(int idCliente, Date fechaRegistro, boolean VIP, String nombre) {
        super(nombre);
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.VIP = VIP;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Clientes4.contadorCliente = contadorCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes4{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", VIP=").append(VIP);
        sb.append(", {=").append(super.toString());        
        sb.append('}');
        return sb.toString();
    }
    
}
