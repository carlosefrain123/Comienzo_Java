/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_Funciones;

/**
 *
 * @author USER
 */
public class funciones_indefinidas_2 {

    public static void main(String[] args) {
        System.out.println(suma(10, 28));
    }

    static int suma(int... num) {
        int sumar = 0;
        for (int i : num) {
            sumar += i;
        }
        return sumar;
    }
}
