package cuenta;


public class Cuenta {

   private String nombre;
   private String Nrodecuenta;
   private double interes;
   private double saldo;

    public Cuenta() {
    }
   
    public Cuenta(String nombre, String Nrodecuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.Nrodecuenta = Nrodecuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNrodecuenta() {
        return Nrodecuenta;
    }

    public void setNrodecuenta(String Nrodecuenta) {
        this.Nrodecuenta = Nrodecuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
   
    public boolean ingreso(double importe){
        if(importe > 0){
            saldo+= importe;
        return true;
        }else{
        return false;
        
    }
    }
    
    public boolean extraccion(double importe){
        if(importe > 0 && importe<=saldo){
            saldo-= importe;
            return true;
        }else{
        return false;
        }
    
    }
    
    
    public boolean transferencia(Cuenta cuentaDestino,double importe){
   if (extraccion(importe) && cuentaDestino.ingreso(importe)){
        return true;
    }else{
            return false;
            }
    
    }
    
    
    
    
}
