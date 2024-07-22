/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I_InterfacesClass;

/**
 *
 * @author USER
 */
public class implentarFunciones implements Persona{

    @Override
    public void Correr() {
        System.out.println("La persona puede Correr");
    }

    @Override
    public void Caminar() {
        System.out.println("La persona puede Caminar");
    }

    @Override
    public void Conducir() {
        System.out.println("La persona puede Conducir");  
    }
    
}
