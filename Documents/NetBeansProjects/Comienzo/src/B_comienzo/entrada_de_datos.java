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
public class entrada_de_datos {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre= leer.nextLine();
        System.out.println("Ingrese Edad");
        int edad=leer.nextInt();
        System.out.println("Ingrese un caracter");
        char caracter=leer.next().charAt(0);
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Caracter: "+caracter);
        System.out.printf("Nombre: %s Edad: %d\n",nombre,edad);
    }
}
