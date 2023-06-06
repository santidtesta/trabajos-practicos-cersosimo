/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo1;

/**
 *
 * @author santino
 */
public class Demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura c = new Cuadrado(10, 0);
        Figura t = new Triangulo(10, 5);
        Figura circulo = new Circulo(10, 0);
        
        
        c.calcularArea();
        t.calcularArea();
        circulo.calcularArea();
    }
    
    
    
}
