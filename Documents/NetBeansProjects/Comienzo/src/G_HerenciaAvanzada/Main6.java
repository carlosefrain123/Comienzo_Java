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
public class Main6 {
    public static void main(String[] args) {
        Persona6 p1=new Persona6("Efrain", 20);
        System.out.println(p1);
        //
        Date fechaRegistro=new Date();
        Clientes6 c1=new Clientes6("Carlos", fechaRegistro, true, 0);
        System.out.println(c1);
    }
}
