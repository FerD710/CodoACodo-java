
package bank;
/* Crear una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad 
(puede tener decimales).
El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla 
lo anterior. Crear sus métodos get, set y toString.
Tendrá dos métodos especiales:
    • Ingresar (double cantidad): se ingresa una cantidad a la cuenta, si la cantidad 
      introducida es negativa, no se hará nada.
    • Retirar (double cantidad): se retira una cantidad a la cuenta, si restando la 
      cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
*/


public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular) {
        this(titular, 0);
    }
 
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }
    
    public void settitular(String titular){
        this.titular = titular;
    }
    public void setcantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public String gettitular (){
        return titular;
    }
    public double getcantidad(){
        return cantidad;
    }
    
    public void Ingresar (double cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    
    public void Retirar (double cantidad){
        if ((this.cantidad - Math.abs(cantidad) < 0)){
            this.cantidad = 0;
        }
        else {
            this.cantidad -= cantidad;
        }
    }
    
    @Override
    public String toString(){
        return this.titular + " tiene " + cantidad + " pesos en la cuenta.";
    }
    
}
