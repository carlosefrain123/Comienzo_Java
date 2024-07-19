package G_HAClass;

public class Empleado4 extends Persona4{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado4(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado4.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado4.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado4{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", {=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String obtenerGenero() {
        return super.obtenerGenero()+"sueldo: "+this.sueldo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
