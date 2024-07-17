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
public class Main2 {
    public static void main(String[] args) {
        Persona2 p1=new Persona2("Efrain", 'M', 20 , "Simón Bolivar #256");
        System.out.println(p1);
        //
        Persona2 p2=new Persona2("José");
        System.out.println(p2);
        //
        Empleado1 p3=new Empleado1(1000, "Efrain");
        System.out.println(p3);
        //
        var fechaRegistro=new Date();
        Clientes1 c1=new Clientes1(fechaRegistro, true, "Efrain", 'M', 20, "Monsefú");
        System.out.println(c1);
    }
}
