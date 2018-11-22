
package ipmtech;


public class IPMTech {

    
    public static void main(String[] args) {
       Empleado Empleado1 = new Empleado ("Juan Perez", "ASDKJ123123", 45, true, 20000);
       Empleado1.clasificacion();
       Empleado1.imprimir();
       Empleado1.aumentoSalario(0.2);
    }
    
}
