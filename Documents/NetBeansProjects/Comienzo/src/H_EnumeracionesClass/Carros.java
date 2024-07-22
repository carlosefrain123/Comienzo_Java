/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_EnumeracionesClass;

/**
 *
 * @author USER
 */
public enum Carros {
    Toyota(4),
    Ferrari(5),
    Ford(10);
    private final int i;

    private Carros(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
    
}
