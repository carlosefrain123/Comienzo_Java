/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peliculas;

import java.util.ArrayList;

/**
 *
 * ArrayList
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> meses=new ArrayList<>();
        meses.add("Enero");
        meses.add("Febrero");
        System.out.println(meses);
        meses.forEach(dato->{
            System.out.println(dato);
        });
    }
    
}
