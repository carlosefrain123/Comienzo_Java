/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Matriz_Multidimensional_6 {
    public static void main(String[] args) {
        int [][][]x={
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12}
            }
        };
        for (int[][] ises : x) {
            for (int[] e : ises) {
                for (int i : e) {
                    System.out.println(i);
                }
            }
        }
    }
}
