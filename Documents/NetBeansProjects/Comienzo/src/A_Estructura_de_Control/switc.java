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
public class switc {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero de dia");
        int dia=entrada.nextInt();
        String nombreDia=null;
        switch (dia) {
            case 1:
                nombreDia="Lunes";
                break;
            case 2:
            nombreDia="Martes";
            break;
            case 3:
            nombreDia="Miercoles";
                break;
            case 4:
            nombreDia="Jueves";
                break;
            case 5:
            nombreDia="Viernes";
                break;
            case 6:
            nombreDia="Sábado";
                break;
            case 7:
            nombreDia="Domingo";
                break;
            default:
                System.out.println("El dia es icorrecto");
        }
        System.out.println("El dia es: "+nombreDia);
    }
}
