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
public class ejercicio_entrada_de_datos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Número a:");
        int a=entrada.nextInt();
        System.out.println("Número b:");
        int b=entrada.nextInt();
        var suma=a+b;
        System.out.printf("La suma de %d + %d=%d", a,b,suma);
    }
}
