
package bank;

public class Bank {

    public static void main(String[] args) {
        
        Cuenta cuenta_1 = new Cuenta("Pedro", 2000);
        Cuenta cuenta_2 = new Cuenta ("Juan", 1231);
        
        
        cuenta_1.Ingresar(2000);
        cuenta_2.Ingresar(2314);
        
        cuenta_1.Retirar(-12314);
        cuenta_2.Retirar(123);
        
        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
    
}
