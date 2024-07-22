package K_Manejo_4de_Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Generar_Excepciones_pt3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean continuarEjecucion=true;
        do {            
            try {
            System.out.println("Ingrese N1:");
            int n1=leer.nextInt();
            //Acá pon el 0
            System.out.println("Ingrese N2:");
            int n2=leer.nextInt();
            int resultado=n1/n2;
            System.out.println("Resultado->"+resultado);
            continuarEjecucion=false;
            } catch (InputMismatchException e) {
                System.err.println("Ocurrio un error: Ingrese numeros enteros");
                leer.nextLine();
            } catch(ArithmeticException e){
                System.err.println("Error: No se puede dividir entre cero");
            } catch(Exception e){
                e.printStackTrace(System.out);
            } finally{
                System.out.println("Se reviso la division");
            }
        } while (continuarEjecucion);
    }
}
