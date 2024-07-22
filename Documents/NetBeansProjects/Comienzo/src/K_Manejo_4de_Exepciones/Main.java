/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package K_Manejo_4de_Excepciones;

import K_Manejo_4de_Exepciones.GenerarErrorExcepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuarEjecucion = true;
        do {            
            try {
                System.out.println("Ingrese N1:");
                int n1 = leer.nextInt();
                
                System.out.println("Ingrese N2:");
                int n2 = leer.nextInt();
                
                int resultado = dividir(n1, n2);
                System.out.println("Resultado -> " + resultado);
                continuarEjecucion = false;
                
            } catch (InputMismatchException e) {
                System.err.println("Ocurrió un error: Ingrese números enteros");
                leer.nextLine(); // Limpiar el buffer del scanner
            } catch (GenerarErrorExcepciones e) {
                System.err.println("Error: " + e.getMessage());
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Se revisó la división");
            }
        } while (continuarEjecucion);
    }
    
    static int dividir(int n, int d) throws GenerarErrorExcepciones {
        if (d == 0) {
            throw new GenerarErrorExcepciones("Dividir entre cero");
        }
        return n / d;
    }
}
