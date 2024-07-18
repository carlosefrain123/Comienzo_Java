/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HerenciaAvanzada;
import G_HAClass.*;
import java.util.Date;
/**
 *
 * @author USER
 */
public class MainCompleto {
    public static void main(String[] args) {
        Persona persona=new Persona("Efrain", 'M', 20, "Chiclayo");
        imprimer(persona);
        //
        Empleado empleado1=new Empleado(400, "Efrain");
        imprimer(empleado1);
        //
        var fecha=new Date();
        Clientes clientes1=new Clientes(fecha, true, "Carlos Efraín", 'M', 22, "Monsefú");
        imprimer(clientes1);      
        //Dowcasting
        Persona persona1=new Empleado(800, "Jose");
        Empleado empleado2=(Empleado) persona1;
        System.out.println(empleado2.obtenerDetalle());
    }
    //Polimorfismo
    public static void imprimer(Persona persona){
        System.out.println(persona.obtenerDetalle());
    }
                
}
