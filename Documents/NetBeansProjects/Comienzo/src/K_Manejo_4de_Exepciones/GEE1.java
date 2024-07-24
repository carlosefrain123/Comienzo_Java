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
public class GEE1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        try {
            System.out.println("Número 1:");
            int n1=entrada.nextInt();
            System.out.println("Número 2:");
            int n2=entrada.nextInt();
            float dividir=n1/n2;
            System.out.println("Dividir: "+dividir);
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace(System.out);
        }
    }
}
