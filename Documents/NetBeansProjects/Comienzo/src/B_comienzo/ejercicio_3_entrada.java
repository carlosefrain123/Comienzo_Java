/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_comienzo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ejercicio_3_entrada {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el número 1:");
        int num1 =entrada.nextInt();
        System.out.println("Ingrese el número 2:");
        int num2 =entrada.nextInt();
        int suma=num1+num2;
        System.out.println("La suma es: "+suma);
    }
}
