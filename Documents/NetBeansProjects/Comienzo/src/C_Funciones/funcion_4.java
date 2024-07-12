/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_Funciones;

/**
 *
 * @author USER
 */
public class funcion_4 {
    public static void main(String[] args) {
        System.out.println(nombre("Efrain"));
        System.out.println("La suma es: "+Suma(20, 25));
        System.out.println("La suma es: "+SumaIndefinida(20, 25,40));
        System.out.println("La resta es: "+resta(52, 20));
    }
    static String nombre(String name){
        return name;
    }
    static int Suma(int a,int b){
        return a+b;
    }
    static int SumaIndefinida(int...num){
        int sum=0;
        for (int i : num) {
            sum+=i;
        }
        return sum;
    }
    static int resta(int a,int b){
        return a-b;
    }
}
