
package zoologico;

/* Crear la clase Cuidador que tenga las siguientes características:
•	Es el responsable de alimentar a los animales.
•	Es una subclase de Persona.
•	Posee un atributo entero privado cantidadDeRaciones que se setea cuando 
        se construye el objeto.
•	Método alimentarAnimales() que informará si la cantidad de raciones que 
        le entregaron al cuidador fue suficiente para alimentar a todos los animales.
*/

/* Clase Cuidador
Esta clase es del tipo final y extiende a Persona, es decir es una clase hija de la clase 
Persona que definimos arriba. Idealmente definir la variable que almacenará la cantidad de 
raciones que tendrá que utilizar el Cuidador, esta debe ser del tipo private.
Escribir el constructor con parámetros que recibirá, el nombre de la persona, fecha de nacimiento 
y la cantidad de raciones. Utilizar super(,); para hacer una sobrecarga de métodos y cargarle 
valores a una persona que será del tipo Cuidador.
También tenemos que escribir el método 'alimentar' que recibirá como parámetro la cantidad 
de raciones que va a tener el cuidador, con un detalle, dado que en el clase Zoologico definimos 
2 variables de tipo constante, que podemos acceder desde aquí para no desperdiciar recursos y 
agilizar el proceso, ¿Cómo hacemos? Supongamos que queremos acceder a CANTIDAD_ANIMALES desde 
Cuidador, para ello hacemos Zoologico.CANTIDAD_ANIMALES, lo mismo para RACIONES_POR_ANIMAL. 
Algo importante a saber es que en base a la cantidad de raciones tendremos que calcular si 
nos alcanza para todos los animales, entonces podrían usar un if para comparar si tenemos más o 
menos raciones que las necesarias.
Recuerdan el constructor de Cuidador que escribieron arriba? Bueno, ahora podrían agregarle el 
método que crearon llamado 'alimentar' pasandole como parámetro la cantidad de raciones.
*/

final class Cuidador extends Persona {
    
    final private int Cant_Raciones;
    
  
    Cuidador (String nombre, String fechaDeNacimiento, int Cant_Raciones){
        
        super (nombre, fechaDeNacimiento);
        this.Cant_Raciones = Cant_Raciones;
    }
    
    public void Alimentar_Animales (int Raciones){
        int raciones = Raciones;
        int raciones_A_Usar;
        
        raciones_A_Usar = Zoologico.Cantidad_Animales * Zoologico.Raciones_Por_Animal; 
        
        if (raciones < raciones_A_Usar){
            int dif = raciones_A_Usar - raciones;
            System.out.println("Las raciones no son suficientes, faltan "+dif+" raciones.");
        }
        else {
            System.out.println("Las raciones son suficientes, se han alimentado a todos los animales.");
        }
        
    }
    
}
