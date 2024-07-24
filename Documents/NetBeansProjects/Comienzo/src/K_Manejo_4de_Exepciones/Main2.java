package K_Manejo_4de_Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main2 {
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
                int resultado=n1/n2;
                System.out.println("Resultado->"+resultado);
                seguir_ejecucion=false;
            } catch (ArithmeticException e) {
                System.err.println("No se puede dividir entre 0");
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
}
