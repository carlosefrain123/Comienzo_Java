/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_Encapsulamiento;
import E_ClasesEncapsulamiento.Encap2;
/**
 *
 * @author USER
 */
public class Main2 {
    public static void main(String[] args) {
        Encap2 ejercicio1=new Encap2("Efrain", 20);
        System.out.println("Me llamo "+ejercicio1.getNombre()+" y tengo "+ejercicio1.getEdad()+" años");
        ejercicio1.setEdad(22);
        System.out.println("Me llamo "+ejercicio1.getNombre()+" y tengo "+ejercicio1.getEdad()+" años");
        //ToString
        System.out.println(ejercicio1.toString());
    }
}
