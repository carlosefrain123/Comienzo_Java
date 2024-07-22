/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_EnumeracionesClass;

/**
 *
 * @author USER
 */
public enum Laptop {
    HP(4),
    Apple(5),
    Lenovo(10);
    private final int n;

    private Laptop(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
    
}
