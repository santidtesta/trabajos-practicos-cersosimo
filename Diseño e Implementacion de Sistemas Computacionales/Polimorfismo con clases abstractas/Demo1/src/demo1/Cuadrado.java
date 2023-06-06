/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

/**
 *
 * @author santino
 */
public class Cuadrado extends Figura {
    public Cuadrado (int lado, int altura){
        super(lado, altura);
    }

    @Override
    public void calcularArea() {
        System.out.println("Area Cuadrado: " + lado*lado);
    }
    
    
}
