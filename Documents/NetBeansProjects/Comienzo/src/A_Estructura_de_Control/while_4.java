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
public class while_4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el número a multiplicar:");
        int numero =entrada.nextInt();
        int multiplicar=0;
        while (multiplicar<=10) {
            int respuesta= numero*multiplicar;
            System.out.printf("La multiplicación de %d y %d es: %d\n",numero,multiplicar,respuesta);
            multiplicar++;
            
        }
    }
}
