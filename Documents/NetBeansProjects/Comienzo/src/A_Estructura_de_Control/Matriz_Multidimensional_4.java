/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Estructura_de_Control;

/**
 *
 * @author USER
 */
public class Matriz_Multidimensional_4 {
    public static void main(String[] args) {
        int[][]numero={
            {1,2,3},
            {4,5,6}
        };
        for (int[] x : numero) {
            for (int i : x) {
                System.out.println(i);
            }
        }
    }
}
