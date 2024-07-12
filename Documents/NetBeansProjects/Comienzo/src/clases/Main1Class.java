/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class Main1Class {
    public String nombre;
    public int a,b;
    public void mostrarSaludo(){
        System.out.println("Hola soy: "+nombre);
    }
    public void mostrarSuma(int a,int b){
        int suma=a+b;
        System.out.println("La suma es: "+suma);
    }
    public void mostrarResta(int a, int b){
        int resta=a-b;
        System.out.println("La resta es: "+resta);
    }
}
