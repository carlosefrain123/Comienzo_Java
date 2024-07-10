/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_POO;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Persona pe1;
        pe1=new Persona();
        
        pe1.nombre="Efrain";
        pe1.edad=22;
        pe1.mostraDatos();
        
        Persona persona2=new Persona();
        
        persona2.nombre="Carlos";
        persona2.edad=24;
        persona2.mostraDatos();
        
        Auto auto1=new Auto();
        auto1.marca="Toyota";
        auto1.color="Azul";
        auto1.mostrarAuto();
    }    
}
