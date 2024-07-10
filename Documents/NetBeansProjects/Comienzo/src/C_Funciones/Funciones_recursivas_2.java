/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_Funciones;

/**
 *
 * @author USER
 */
public class Funciones_recursivas_2 {
    public static void main(String[] args) {
        System.out.println(descuento(10));
    }

    static int descuento(int numero) {
        numero--;
        if (numero > 0) {
            System.out.println(numero);
            return descuento(numero);
        } else {
            System.out.println("Se acabó el bucle");
            return numero;  // Devuelve el valor de 'numero' al finalizar la recursión
        }
    }
}
