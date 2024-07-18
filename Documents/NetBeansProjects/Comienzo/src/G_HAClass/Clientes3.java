package G_HAClass;

import java.util.Date;

public class Clientes3 extends Persona3 {
    private int idCliente;
    private static int contadorCliente;
    private Date fechaRegistro;
    private boolean VIP;

    public Clientes3(String nombre, Date fechaRegistro, boolean VIP, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Clientes3.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.VIP = VIP;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Clientes3.contadorCliente = contadorCliente;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes3{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", VIP=").append(VIP);
        sb.append(", {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + ", Fecha de Registro: " + this.fechaRegistro + ", VIP: " + this.VIP;
    }
}
