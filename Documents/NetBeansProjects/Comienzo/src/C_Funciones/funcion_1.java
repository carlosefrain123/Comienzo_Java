/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_Funciones;

/**
 *
 * @author USER
 */
public class funcion_1 {
    public static void main(String[] args) {
        sumar(20, 40);
        saludo("Efrain",22);
    }
    static void sumar(int a,int b){
        int suma=a+b;
        System.out.println("La suma es: "+suma);
    }
    static void saludo(String nombre, int edad){
        System.out.printf("Mi nombre es %s y tengo %d años",nombre,edad);
    }
}
