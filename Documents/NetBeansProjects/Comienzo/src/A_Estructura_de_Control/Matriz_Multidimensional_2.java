/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Estructura_de_Control;

/**
 *
 * @author USER
 */
public class Matriz_Multidimensional_2 {
    public static void main(String[] args) {
        int[][][]x={
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12}
            }
        };
        for (int[][] matriz2D : x) {
            for (int[]matriz1D : matriz2D) {
                for (int dato : matriz1D) {
                    System.out.println(dato);
                }
            }
        }
    }
}
