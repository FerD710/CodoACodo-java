
package ipmtech;

public class Empleado {
    
    private String nombre;
    private String cedula;
    private int edad;
    private String clase;
    private boolean estado_civil;
    private double salario;
    
    public Empleado(){
        }
    public Empleado (String Nombre, String Cedula, int Edad, boolean EstadoCivil, double Salario){
        nombre = Nombre;
        cedula = Cedula;
        edad = Edad;
        estado_civil = EstadoCivil;
        salario = Salario;
    }
    
    public String clasificacion(){
        if (edad <= 21) {
            return clase = "Principiante";
        }
        else if (edad > 21 && edad <= 35){
            return clase = "Intermedio";
        }
        else {
            return clase = "Senior";
        }
    }
    
    public void imprimir (){
        System.out.println("Nombre y Apellido: "+nombre);
        System.out.println("Cédula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Clasificación: "+clase);
        System.out.println("Casado (T/F): "+estado_civil);
        System.out.println("Salario: "+salario);
    }
    
    public void aumentoSalario(double aumento) {
        double salario2;
        salario2 = salario * (1+aumento);
        System.out.println("El salario con aumento será: "+salario2);      
    }
    
}
