
package zoologico;

/*Crear la clase Programa que la utilizaremos como punto de entrada principal:
•	Deberá crear una instancia de Zoológico para abrir el zoológico, alimentar 
a los animales y cerrar el zoológico.
*/

/*Finalmente volviendo a la clase Persona que es donde tendremos el main, instanciar un objeto 
de la clase Zoológico y uno del tipo Cuidador con sus respectivos parámetros. Una vez creado los 
objetos y validada la cantidad de raciones procedemos a cerrar el zoológico.
*/




public class Programa {

    
    public static void main(String[] args) {
       
        Zoologico Zoo_1 = new Zoologico (true);
        Cuidador Cuidador_1 = new Cuidador ("Juan", "12/98/1985", 100);
        
        Cuidador_1.Alimentar_Animales(100);
        
        Zoo_1.Cerrar_Zoo();
        
        if (!Zoo_1.Zoo_Abierto){
            System.out.println ("El Zoologico ha cerrado.");
        }
        else {
            System.out.println ("El Zoologico sigue abierto.");
        }
        
    }
    
}
