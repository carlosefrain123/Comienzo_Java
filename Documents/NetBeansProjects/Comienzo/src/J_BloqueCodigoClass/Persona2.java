/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J_BloqueCodigoClass;

/**
 *
 * @author USER
 */
public class Persona2 {
    private final int idPersona;
    private static int ContadorPersona;
    static{
        System.out.println("Código static");
        ++Persona2.ContadorPersona;
    }
    
    {
        System.out.println("Bloque Código");
        this.idPersona=Persona2.ContadorPersona;
    }

    public Persona2() {
        System.out.println("Constructor");
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona2{" + "idPersona=" + idPersona + '}';
    }
    
    
}
