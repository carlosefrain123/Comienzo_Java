/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_EnumeracionesClass;

/**
 *
 * @author USER
 */
public enum Persona {
    Caminar(11),
    Correr(10);
    private final int funciones_persona;

    private Persona(int funciones_persona) {
        this.funciones_persona = funciones_persona;
    }

    public int getFunciones_persona() {
        return funciones_persona;
    }
    
}
