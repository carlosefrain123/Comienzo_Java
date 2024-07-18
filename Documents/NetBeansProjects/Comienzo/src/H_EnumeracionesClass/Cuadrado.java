/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_EnumeracionesClass;

/**
 *
 * @author USER
 */
public class Cuadrado extends FiguraGeometrico{

    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se diba un: "+getClass().getSimpleName());
    }
    
}
