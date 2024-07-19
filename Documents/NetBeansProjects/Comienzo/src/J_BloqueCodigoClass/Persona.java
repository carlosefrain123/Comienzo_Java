package J_BloqueCodigoClass;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecución de bloque estático");
        ++Persona.contadorPersona;
    }
    
    {
        System.out.println("Ejecución bloque de código");
        this.idPersona = Persona.contadorPersona;
    }
    
    public Persona() {
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona() {
        return idPersona;
    }
    
    @Override
    public String toString() {
        return "Persona{idPersona=" + idPersona + "}";
    }
}
