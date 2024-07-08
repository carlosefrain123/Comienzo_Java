/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_Funciones;

/**
 *
 * @author USER
 */
public class Funciones_retorno {
    public static void main(String[] args) {
        int respuesta=suma(10,15);
        System.out.println("La respuesta es: "+respuesta);
        String nombre="Efrain";
        int edad=20;
        System.out.println(saludo(nombre, edad));
    }
    static int suma(int a,int b){
        int sum=a+b;
        return sum;
    }
    static String saludo(String nombre, int edad){
        return "Mi nombre es:"+nombre+" y tengo "+edad+" años";
    }
}
