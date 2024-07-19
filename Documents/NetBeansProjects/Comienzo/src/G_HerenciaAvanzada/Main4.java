/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G_HerenciaAvanzada;

import G_HAClass.Empleado4;
import G_HAClass.Persona4;
import static G_HerenciaAvanzada.MainCompleto.imprimer;

/**
 *
 * @author USER
 */
public class Main4 {
    public static void main(String[] args) {
        Persona4 p4=new Persona4("Efrain");
        //System.out.println(p4);
        imprimer(p4);
        //
        Empleado4 em4=new Empleado4("Victor Manuel", 200);
        imprimer(em4);
                
    }
    public static void imprimer(Persona4 p4){
        System.out.println(p4.obtenerGenero());
    }
}
