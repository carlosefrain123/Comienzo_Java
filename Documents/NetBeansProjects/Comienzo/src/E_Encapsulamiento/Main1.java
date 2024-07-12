/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_Encapsulamiento;

import E_ClasesEncapsulamiento.Encap1;

/**
 *
 * @author USER
 */
public class Main1 {
    public static void main(String[] args) {
        Encap1 persona=new Encap1("Efrain", 20, true);
        System.out.println(persona.getNombre());
        System.out.println(persona);
        //Acá se puede modificar
        persona.setNombre("José");
        System.out.println(persona.getNombre());
        //
        System.out.println(persona);
    }
}
