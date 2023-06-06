/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

/**
 *
 * @author santino
 */
public abstract class Figura {
    protected int lado;
    protected int altura;
    
    public Figura(int lado, int altura){
        this.lado=lado;
        this.altura=altura;
    }
    
    public abstract void calcularArea();
}

