
import K_Manejo_4de_Exepciones.Generar_error_4;
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
public class Main4_1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean seguir_ejecucion=true;
        do {            
            try {
                System.out.println("Ingrese N1:");
                int n1=leer.nextInt();
                //Acá pon el 0
                System.out.println("Ingrese N2:");
                int n2=leer.nextInt();
                int resultado= dividir(n1, n2);
                System.out.println(resultado); 
                seguir_ejecucion=false;
            } catch (InputMismatchException e){
                System.err.println("Solo números enteros");
                leer.nextLine();
            } catch (Generar_error_4 e) {
                System.out.println("Error: "+e.getMessage());
            } finally{
                System.out.println("Ejecución finalizada");
            }
        } while (seguir_ejecucion);
    }
    static int dividir(int n1,int n2) throws Generar_error_4{
        if (n2==0) {
            throw new Generar_error_4("No se puede divir entre 0");
        }
        return n1/n2;
    }
}
