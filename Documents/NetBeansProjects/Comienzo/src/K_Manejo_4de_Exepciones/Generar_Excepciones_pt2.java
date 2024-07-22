/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package K_Manejo_4de_Exepciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Generar_Excepciones_pt2 {
    public static void main(String[] args) {
        try {
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese N1:");
            int n1=leer.nextInt();
            //Acá pon el 0
            System.out.println("Ingrese N2:");
            int n2=leer.nextInt();
            int resultado=n1/n2;
            System.out.println(resultado);
        } catch (Exception e) {
            System.err.println("Ocurrio un error:");
            e.printStackTrace(System.out);
        }
    }
}
