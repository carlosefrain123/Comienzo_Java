package G_HerenciaAvanzada;

import G_HAClass.*;
import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        Persona3 pers1 = new Persona3("Junior");
        imprimir(pers1);

        Empleado3 emp1 = new Empleado3("Efraub", 400);
        imprimir(emp1);

        Empleado3 emp2 = new Empleado3("Efrain", 200, 'M', 20, "Simón Bolivar");
        imprimir(emp2);

        Date fechaRegistro = new Date();
        Clientes3 clt1 = new Clientes3("José", fechaRegistro, true, 'M', 30, "Trujillo");
        imprimir(clt1);
        //
        Persona3 pers2=new Persona3("Raul", "Peru - Monsefu");
        imprimirGener(pers2);
    }

    public static void imprimir(Persona3 persona) {
        System.out.println(persona.obtenerDetalle());
    }
    public static void imprimirGener(Persona3 persona){
        System.out.println(persona.obtenerGenero());
    }
}
