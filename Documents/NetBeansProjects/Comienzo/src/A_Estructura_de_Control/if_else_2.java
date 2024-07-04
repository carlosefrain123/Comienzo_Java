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
public class if_else_2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la vocal");
        char vocal=entrada.next().charAt(0);
        if (vocal=='A'||vocal=='a') {
            System.out.println("Es la vocal: "+vocal);
        } else if (vocal=='E'||vocal=='e') {
            System.out.println("Es la vocal e");
        } else if (vocal=='I'||vocal=='i') {
            System.out.println("Es la vocal i");
        } else if (vocal=='O'||vocal=='o') {
            System.out.println("Es la vocal o");
        } else if (vocal=='U'||vocal=='u') {
            System.out.println("Es la vocal u");
        } else {
            System.out.println("No es");
        }
    }
}
