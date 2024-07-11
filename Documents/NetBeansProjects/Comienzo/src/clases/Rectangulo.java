/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class Rectangulo {
    public int base;
    public int altura;
    public int area(int base, int altura){
        this.base=base;
        this.altura=altura;
        int area=this.base*this.altura;
        return area;
    }
    public int perimetro(int base, int altura){
        this.base=base;
        this.altura=altura;
        return 2*(this.base+this.altura);
    }
}
