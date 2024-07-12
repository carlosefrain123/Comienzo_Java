/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_POO;
import clases.Main2Class;
/**
 *
 * @author USER
 */
public class Main2 {
    //Metodos
    public static void main(String[] args) {
        Main2Class suma1=new Main2Class();
        System.out.println("La suma es: "+suma1.suma(40, 80));
        //================================
        Main2Class mult1=new Main2Class();
        System.out.println("La multiplicación: "+mult1.multiplicacion(80.5, 50));
        //================================
        Main2Class saludo=new Main2Class();
        System.out.println("Hola mi nombre es: "+saludo.Saludo("Efrain"));
    }
}
