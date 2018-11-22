
package banco;

public class Banco {

    public static void main(String[] args) {
     // creación de las cuentas mediante instancia al objeto Cuenta.java  
        Cuenta cuentapesos = new Cuenta("José",200);
        Cuenta cuentadolares = new Cuenta("Jorge",30);
       
     // Ingreso de dinero en cuenta
     cuentapesos.ingresar(1000);
     cuentadolares.ingresar(400);
        
     // Retiro de dinero de la cuenta
     cuentadolares.retirar(50);
     cuentapesos.retirar(800);
     
     //Mostrar la información de las cuentas Metodo toString
        System.out.println(cuentapesos);
        System.out.println(cuentadolares);
        
        
    }
    
}
