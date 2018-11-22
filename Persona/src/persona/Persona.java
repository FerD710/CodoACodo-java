
package persona;

public class Persona {
    
    /*  Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), 
        no queremos que se accedan directamente a ellos. Piensa que modificador de 
        acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
    */
    private String Nombre;
    private int Edad;
    private char Sexo;
    private String Direccion;
    private String E_Mail;
    private double Telefono;
    private double DNI;
    
    /*  Por defecto, todos los atributos menos el DNI serán valores por defecto según 
        su tipo (0 números, cadena vacía para String, etc.). Sexo será hombre por defecto, 
        usa una constante para ello.
    */
    private final static String NOMBRE = "";
    private final static int EDAD = 0;
    private final static char SEXO = 'H';
    private final static String DIRECCION = "";
    private final static String E_MAIL = "";
    private final static double TELEFONO = 0;
    
    //  Se implementarán varios constructores:

    //  Un constructor por defecto.
    public Persona (){
        this.Nombre = Persona.NOMBRE;
        this.Edad = Persona.EDAD;
        this.Sexo = Persona.SEXO;
        this.Direccion = Persona.DIRECCION;
        this.E_Mail = Persona.E_MAIL;
        this.Telefono = Persona.TELEFONO;        
    }
    
    //  Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona (String nombre,int edad, char sexo){
        this.Nombre = nombre;
        this.Edad = edad;
        comprobarSexo(sexo);
        this.Direccion = Persona.DIRECCION;
        this.E_Mail = Persona.E_MAIL;
        this.Telefono = Persona.TELEFONO;   
    }
    
    //  Un constructor con todos los atributos como parámetro.
    public Persona (String nombre, int edad, char sexo, String direccion, String e_mail, double telefono){
        this.Nombre = nombre;
        this.Edad = edad;
        comprobarSexo(sexo);
        this.Direccion = direccion;
        this.E_Mail = e_mail;
        this.Telefono = telefono;   
    }
    
    // generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número.
    public void generarDNI (){
        this.DNI = (Math.random() * (100000000 - 10000000) + 10000000);
    }
    
    // Métodos set de cada parámetro, excepto de DNI.
    public void setNombre (String nombre){
        this.Nombre = nombre;
    }
    public void setEdad (int edad){
        this.Edad = edad;
    }
    public void setSexo (char sexo){
        this.Sexo = sexo;
    }
    public void setDireccion (String direccion){
        this.Direccion = direccion;
    }
    public void setE_Mail (String e_mail){
        this.E_Mail = e_mail;
    }
    public void setTelefono (int telefono){
        this.Telefono = telefono;
    }
    
    // esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad (){
        boolean MayorDeEdad;
        MayorDeEdad = this.Edad > 18;
        return MayorDeEdad;
    }
    
    /*  comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es 
      correcto, será H. No será visible al exterior.
    */
    private void comprobarSexo (char Sexo){
        if (Sexo == 'H' || Sexo == 'M'){
            this.Sexo = Sexo;
        }
        else {
            this.Sexo = Persona.SEXO;
        }
    }
    
    //  toString(): devuelve toda la información del objeto.
    @Override
    public String toString(){
        return "Nombre: "+Nombre+" / Edad: "+Edad+" / Mayor de Edad: "+esMayorDeEdad()+" / Sexo: "+Sexo+" / DNI: "+DNI+" / Direccion: "+Direccion+" / E-mail: "+E_Mail+" / Telefono: "+Telefono;
    }

    
    
    
    
    
    

/*  Item a.- Este es otro ejercicio dentro del ejercicio 2, por lo tanto tendrán que crear otro 
    proyecto.
    En la clase Persona, deberán definir varias variables como constantes al principio, 
    en caso de que el dato instroducido no fuese correcto. El ejercicio pide que no se pueda 
    acceder directamente por lo tanto el modificador de acceso adecuado es el private.
    Escribir el constructor Persona sin parámetros, que inicialize todos los valores en vacío 
    para el string, 0 para los datos de tipo entero y utilice la constante SEXO definida 
    previamente, esto es como el caso default en un Switch-Case
    Escribir el constructor con parámetros que reciba los datos nombre, edad y sexo de la persona 
    y asignarlos a las respectivas variables (this). Deberán crear un método llamado generaDni() 
    para asignarle a cada persona y el método comprobarSexo(char sexo) para verificar que el 
    sexo introducido sea correcto y en caso omiso asignarle H.
    Escribir setters y getters
    Método: generaDni(), van a tener que usar un generador de números aleatorios para armar 
    un número de dni, utilizar Math.random() con algun seed adecuado, por ejemplo:
    Math.random() * (100000000 - 10000000) + 10000000)
    Con esto generaran un número aleatorio de 8 cifras.
    Luego usan el método toString para convertir de número entero a String, ¿Cómo?
    Suponiendo que DNI es del tipo String
    DNI = Integer.toString(numeroDni);
    Escribir método esMayorDeEdad() que a mí gusto estaría bueno que devuelva un boolean.
    Escribir método toString() que imprimirá todo en pantalla
    Crear una clase personaMain ó el nombre que prefieran que tendrá el main de este proyecto, 
    desde el main leer los valores que se necesitan para luego crear un objeto del tipo Persona 
    mediante Scanner.
    Instanciar objeto persona con estos valores.
    Crear un método que muestre si la persona es mayor de edad, ya que si recuerdan, el método 
    esMayorDeEdad() no recibe parámetros, por lo tanto a este nuevo método le pueden pasar como 
    parámetro el objeto Persona y hacer que mediante esMayorDeEdad() valide la edad del usuario.
    Finalmente mostrar en pantalla si la persona es mayor de edad y todo lo que devuelve toString()
    que acaban de crearlo.
*/
    
}
