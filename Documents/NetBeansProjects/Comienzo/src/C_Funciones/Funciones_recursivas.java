/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_Funciones;

/**
 *
 * @author USER
 */
public class Funciones_recursivas {
    public static void main(String[] args) {
        
    }
    static void cuentaRegresiva(int numero){
            numero --;
            if (numero>0) {
                System.out.println(numero);
                cuentaRegresiva(numero);
        } else {
                System.out.println("Llego hasta 0");
        }
    }
}
