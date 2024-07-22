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
public class Generar_Excepciones {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese N1:");
        int n1=leer.nextInt();
        //Acá pon el 0
        System.out.println("Ingrese N2:");
        int n2=leer.nextInt();
        int resultado=n1/n2;
        System.out.println(resultado);
    }
}
