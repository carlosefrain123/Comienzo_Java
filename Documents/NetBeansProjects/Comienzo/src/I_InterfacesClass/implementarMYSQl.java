/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I_InterfacesClass;

/**
 *
 * @author USER
 */
public class implementarMYSQl implements BaseDatos{

    @Override
    public void insertar() {
        System.out.println("e inserto un dato");
    }

    @Override
    public void listar() {
        System.out.println("e listo un dato");
    }

    @Override
    public void actualizar() {
        System.out.println("e Actualizo un dato");
    }

    @Override
    public void eliminar() {
        System.out.println("e elimino un dato");
    }
    
}
