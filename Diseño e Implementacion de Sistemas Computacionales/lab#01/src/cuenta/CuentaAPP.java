/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;


public class cuentaApp {
    public static void main(String[] args) {
      Cuenta c1 = new Cuenta ("Pepe","65546",7.0,1000);
      Cuenta c2 = new Cuenta();
      c2.setNombre("Juan");
      c2.setNrodecuenta("46987");
      c2.setInteres(17);
      c2.setSaldo(500);
      
      //ingresar 2000 c1 e ingresar 5000 en c2
      
      c1.ingreso(2000);
      c2.ingreso(5000);

        System.out.println("Ingresos:: ");
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        
      //extraccion 500 c1 y egreso 700 c2
      
      c1.extraccion(500);
      c2.extraccion(700);
      
        System.out.println("Egresos: ");
        System.out.println(c1.getSaldo());
        System.out.println(c1.getSaldo());
        
      //transferencia 800 de c1 a c2
      
      c1.transferencia(c2, 800);
      
        System.out.println("Transferencias: ");
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
