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
public class switc_2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el número de estación:");
        int nEstacion=entrada.nextInt();
        String nombreEstacion=null;
        switch (nEstacion) {
            case 1:
                nombreEstacion="Verano";
                break;
            case 2:
                nombreEstacion="Otoño";
                break;
            case 3:
                nombreEstacion="Invierno";
                break;
            case 4:
                nombreEstacion="Primavera";
                break;
            default:
                System.out.println("Incorrecto el número de estación");
        }
        System.out.println("La estación es: "+nombreEstacion);
    }
}
