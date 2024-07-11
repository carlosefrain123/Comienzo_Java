/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public class MetodosCalculadora {
    //Sobrecarga de funciones
    public static int suma(int numa,int numb){
        int suma=numa+numb;
        return suma;
    }
    public static double suma(double numa,double numb){
        double suma=numa+numb;
        return suma;
    }
    //Sobrecarga de métodos
    public int resta(int a,int b){
        int resta=a-b;
        return resta;
    }
    public double resta(double a,double b){
        double resta=a-b;
        return resta;
    }
}
