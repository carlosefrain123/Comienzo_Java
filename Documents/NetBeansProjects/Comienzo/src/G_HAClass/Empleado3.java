package G_HAClass;

public class Empleado3 extends Persona3 {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado3(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado3.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado3(String nombre, double sueldo, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++Empleado3.contadorEmpleado;
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
        Empleado3.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado3{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", {").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + ", Sueldo: " + this.sueldo;
    }

    @Override
    public String obtenerGenero() {
        return super.obtenerGenero(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
