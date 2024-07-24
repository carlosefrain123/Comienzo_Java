/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * II
 */
public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas{
    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPelicula() {
        this.listaPeliculas=new ArrayList<>();
    }
    
    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(
                null,
                this.listaPeliculas,
                "Lista de Películas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado=null;
        for (var pelicula:this.listaPeliculas) {
            if (pelicula.equals(nombrePelicula)) {
                resultado=pelicula;
                break;
            }else{
                resultado=pelicula;
            }
        }
        if (nombrePelicula.equals(resultado)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Resultado->"+resultado,
                    "BUSCAR PELICULA",
                    JOptionPane.QUESTION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,"No se encontró la Película->"+nombrePelicula,
                    "Buscar Película",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
    
}
