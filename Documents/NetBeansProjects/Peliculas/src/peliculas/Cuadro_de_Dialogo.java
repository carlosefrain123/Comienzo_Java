/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;

import javax.swing.JOptionPane;

/**
 *
 * 3. Interface Pelicula
 */
public class Cuadro_de_Dialogo {
    public static void main(String[] args) {
        /*
        JOptionPane.ERROR:MESSAGE. ->0
        JOptionPane.INFORMATION_MESSAGE ->1
        JOptionPane.WAARNING_MESSAGE ->2
        JOptionPane.QUESTION_MESSAGE ->3
        */
        String valor=JOptionPane.showInputDialog(
                null,
                "Ingrese Texto",
                "Entrada",
                JOptionPane.QUESTION_MESSAGE
        );
        JOptionPane.showMessageDialog(
                null,
                valor,
                "Mi mensaje",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
