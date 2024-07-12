/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ClasesEncapsulamiento;
/**
 *
 * @author USER
 */
public class Encap3 {
    int a,b;

    public Encap3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int suma(){
        int suma=this.a+this.b;
        return suma;
    }

    @Override
    public String toString() {
        return "La suma de %d y %d es %d".formatted(this.a,this.b,suma()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
