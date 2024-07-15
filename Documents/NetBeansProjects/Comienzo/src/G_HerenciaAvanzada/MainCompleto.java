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
        Empleado empleado1=new Empleado(400, "Efrain");
        System.out.println(empleado1);
        //
        var fecha=new Date();
        Clientes clientes1=new Clientes(fecha, true, "Carlos Efraín", 'M', 22, "Monsefú");
        System.out.println(clientes1);
    }
}
