/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I_Interfaces;
import I_InterfacesClass.*;
/**
 *
 * @author USER
 */
public class main2 {
    public static void main(String[] args) {
        BD ej1=new impleMYSQL();
        ej1.editar();
        Persona p1=new implentarFunciones();
        p1.Correr();
        PoliticoMalo pM1=new impFPolitico();
        pM1.engañar();
    }
}
