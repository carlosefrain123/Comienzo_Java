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
public class while_2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero=entrada.nextInt();
        int numero2=0;
        while (numero2<=10) {  
            System.out.printf("%dx%d=%d\n",numero,numero2,(numero*numero2));
            numero2++;
        }
    }
}
