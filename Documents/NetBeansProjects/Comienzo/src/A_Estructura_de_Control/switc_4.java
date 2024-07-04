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
public class switc_4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la opción:");
        int opcion=entrada.nextInt();
        String vocal = null;
        switch (opcion) {
            case 1:
                vocal="a";
                break;
            case 2:
                vocal="e";
                break;
            case 3:
                vocal="i";
                break;
            case 4:
                vocal="o";
                break;
            case 5:
                vocal="u";
                break;
            default:
                System.out.println("No hay vocal");
        }
        System.out.println("Vocal: "+vocal);
    }
}
