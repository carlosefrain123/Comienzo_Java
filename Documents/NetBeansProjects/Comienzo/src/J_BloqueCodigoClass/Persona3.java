/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J_BloqueCodigoClass;

/**
 *
 * @author USER
 */
public class Persona3 {
    private final int idCliente;
    private static int contadorPersona;
    static {
        System.out.println("Código estático");
        ++Persona3.contadorPersona;
    }
    {
        System.out.println("Bloque código");
        this.idCliente=Persona3.contadorPersona;
    }

    public Persona3() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona3{");
        sb.append("idCliente=").append(idCliente);
        sb.append('}');
        return sb.toString();
    }
    
}
