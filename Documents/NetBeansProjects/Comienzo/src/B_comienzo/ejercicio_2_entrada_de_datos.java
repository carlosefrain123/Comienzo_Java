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
public class ejercicio_2_entrada_de_datos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Valor de Venta:");
        double vv=entrada.nextDouble();
        /*IGV es el 18%*/
        double igv=vv*0.18f;
        double pv=vv+igv;
        System.out.println("El pv es: "+pv);
    }
}
