/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package H_EnumeracionesClass;

/**
 *
 * @author USER
 */
public enum Continentes {
    AFRICA(54),
    EUROPA(50),
    ASIA(54),
    AMERICA(35),
    OCEANIA(14);
    private final int paises;

    private Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
    
    
}
