/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_Funciones;

/**
 *
 * @author USER
 */
public class funciones_indefinidas {
    public static void main(String[] args) {
        System.out.println(sumar("Efrain", 1,5,8));
    }
    static int sumar(String nombre, int... numeros){
        System.out.println("La suma de: "+nombre);
        int suma=0;
        for (int numero : numeros) {
            suma+=numero;
        }
        return suma;
    }
    static double sumar(double... numeros){
        double suma=0;
        for(double num:numeros){
            suma+=num;
        }
        return suma;
    }
}
