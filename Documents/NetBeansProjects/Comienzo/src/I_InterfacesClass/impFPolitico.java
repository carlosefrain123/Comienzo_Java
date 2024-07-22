/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I_InterfacesClass;

/**
 *
 * @author USER
 */
public class impFPolitico implements PoliticoMalo{

    @Override
    public void robar() {
        System.out.println("Robar");
    }

    @Override
    public void engañar() {
        System.out.println("Engañar");
    }

    @Override
    public void matar() {
        System.out.println("Matar");
    }
    
}
