/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HerenciaAvanzada;

import G_HAClass.*;

/**
 *
 * @author USER
 */
public class Main5 {
    public static void main(String[] args) {
        Persona5 p1=new Persona5("Efrain", 20);
        System.out.println(p1);
        //===========
        Empleado5 e1=new Empleado5(20.5, "Victor", 20);
        System.out.println(e1);
        //===========
        Clientes5 c1=new Clientes5(true, "Luis", 20);
        imprimir(c1);
    }
    public static void imprimir(Persona5 persona){
        System.out.println(persona.obtenerDatos());
    }
}
