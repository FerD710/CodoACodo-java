
package zoologico;

/*Crear la clase Zoológico que tenga las siguientes características:
•	Atributos de clase públicos y constantes CANTIDAD_ANIMALES= 25 y 
        RACIONES_POR_ANIMAL= 5 del tipo entero.
•	Atributo privado abierto del tipo boolean representando si el zoológico 
        está abierto o cerrado.
•	Método abrir() para abrir el zoológico
•	Método alimentarAnimales (int unaCantidadDeRaciones) deberá instanciar 
        a un Cuidador pasándole la cantidad de raciones en el constructor del mismo.
•	Método cerrar() para cerrar el zoológico.*/

/*Clase zoológico
Esta clase está libre, no extiende a persona, definimos 3 variables, 2 del tipo 
static final ya que son constantes y una del tipo boolean para saber el estado 
del zoológico, es decir, si está abierto o cerrado.
Escribir un constructor que recibirá como parámetro el estado del zoológico.
Crear un método llamado cerrar que cambiará el estado del zoológico*/


public class Zoologico {
    protected final static int Cantidad_Animales = 25;
    protected final static int Raciones_Por_Animal = 5;
    protected boolean Zoo_Abierto;
    
    public Zoologico (boolean Estado){
        Zoo_Abierto = Estado;
        
    }
    
    public void Cerrar_Zoo (){
        Zoo_Abierto = false;
    }
}
