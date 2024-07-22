/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I_InterfacesClass;

/**
 *
 * @author USER
 */
public class impleMYSQL implements BD{

    @Override
    public void listar() {
        System.out.println("Listra");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrar");    
    }

    @Override
    public void editar() {
        System.out.println("Editar");
    }
    
}
