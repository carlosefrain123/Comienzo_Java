/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package K_Manejo_4de_Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean seguir_ejecucion=true;
        do {            
            try {
                System.out.println("Ingrese N1:");
                int n1=leer.nextInt();
                //Acá pon el 0
                System.out.println("Ingrese N2:");
                int n2=leer.nextInt();
                int resultado=dividir(n1,n2);
                System.out.println("Resultado->"+resultado);
                seguir_ejecucion=false;
            } catch (Generar_error_1 e) {
                System.err.println("Error"+e.getMessage());
            } catch (InputMismatchException e){
                System.err.println("Ingrese números enteros");
                leer.nextLine();
            } catch(Exception e){
                e.printStackTrace(System.out);
            }   finally{
                System.out.println("Finalizó el programa");
            }
        } while (seguir_ejecucion);
    }
    static int dividir(int n1,int n2) throws Generar_error_1{
        if (n2==0) {
            throw new Generar_error_1("Dividir entre cero");
        }
        return n1/n2;
    }
}
