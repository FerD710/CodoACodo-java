
package zoologico;
    /*Crear la clase abstracta Persona con las siguientes características:
•	nombre (privado ).
•	fechaDeNacimiento (privado ).
•	métodos de acceso (setters y getters) correspondientes.*/

/*Crear una clase abstracta llamada Persona, ahí tendremos el main. 
Dentro de ella declarar las variables nombre y fecha de nacimiento con un permiso del tipo protected. 
Escribir el constructor con parámetros que recibirá el nombre y la fecha de nacimiento.
Escribir los respectivos getters para nombre y fecha de nacimiento.*/

abstract class Persona {
    protected String nombre;
    protected String fechaDeNacimiento;
    
    public Persona (String name, String dateOfBirth) {
        nombre = name;
        fechaDeNacimiento = dateOfBirth;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }
}
