package G_HAClass;

public class Persona3 {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona3(String nombre) {
        this.nombre = nombre;
    }

    public Persona3(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Persona3(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona3{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }

    public String obtenerDetalle(){
        return "Nombre: %s, Edad: %d".formatted(this.nombre, this.edad);
    }
    public String obtenerGenero(){
        return "Nombre: %s,Dirección: %s".formatted(this.nombre,this.direccion);
    }
}
