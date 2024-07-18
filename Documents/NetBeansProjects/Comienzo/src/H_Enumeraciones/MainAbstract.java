/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_Enumeraciones;
import H_EnumeracionesClass.*;
/**
 *
 * @author USER
 */
public class MainAbstract {
    public static void main(String[] args) {
        FiguraGeometrico figura=new Rectangulo("Rectangulo 1");
        System.out.println(figura);
        figura.dibujar();
        
        figura=new Cuadrado("Cuadrado");
        figura.dibujar();
    }
}
