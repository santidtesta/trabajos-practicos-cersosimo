/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

/**
 *
 * @author santino
 */
public class Circulo extends Figura{
        public Circulo(int lado, int altura){
            super(lado, altura);
        }

    @Override
    public void calcularArea() {
        System.out.println("Area circulo: " + Math.PI * (lado*lado));
    }
}
