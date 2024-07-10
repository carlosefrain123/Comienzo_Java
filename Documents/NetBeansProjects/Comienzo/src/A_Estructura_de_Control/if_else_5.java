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
public class if_else_5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad=entrada.nextInt();
        if (edad>18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}
