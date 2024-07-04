/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Estructura_de_Control;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class if_else_3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa n1");
        int n1=entrada.nextInt();
        System.out.println("Ingresa n2");
        int n2=entrada.nextInt();
        if (n1>n2) {
            System.out.println(n1+" es mayor que "+n2);
        }else if (n1<n2) {
            System.out.println(n2+" es mayor que "+n1);
        }
    }
}
