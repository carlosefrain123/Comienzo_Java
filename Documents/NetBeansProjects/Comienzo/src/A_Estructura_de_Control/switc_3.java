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
public class switc_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la opción de la operación: \n"
                + "(1) Suma\n" + "(2) Resta\n" + "(3) Multiplicación\n" + "(4) División\n");
        int opcion = entrada.nextInt();
        System.out.println("Ingrese el n1:");
        int n1 = entrada.nextInt();
        System.out.println("Ingrese el n2:");
        int n2 = entrada.nextInt();
        int respuesta = 0;
        boolean error = false;

        switch (opcion) {
            case 1:
                respuesta = n1 + n2;
                break;
            case 2:
                respuesta = n1 - n2;
                break;
            case 3:
                respuesta = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    respuesta = n1 / n2;
                } else {
                    System.out.println("Error: División por cero");
                    error = true;
                }
                break;
            default:
                System.out.println("Error: Opción no válida");
                error = true;
        }

        if (!error) {
            System.out.println("La respuesta es: " + respuesta);
        }
    
    }
}
