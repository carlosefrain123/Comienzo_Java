/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Estructura_de_Control;

/**
 *
 * @author USER
 */
public class Matriz_Multidimensional_5 {
    public static void main(String[] args) {
        int [][]x={
            {1,2,3},
            {4,5,6},
            {9,8,7},
        };
        for (int[] fila : x) {
            for (int columna : fila) {
                System.out.println(columna);
            }
        }
    }
}
