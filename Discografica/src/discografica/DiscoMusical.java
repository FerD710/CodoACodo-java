package discografica;

/*Desarrollar un programa Java donde necesitan trabajar con objetos de tipo DiscoMusical. 
Definir una clase DiscoMusical considerando los siguientes atributos de clase: 
titulo (String), autor (String), añoEdicion (int), formato (String), digital (boolean). 
Definir un constructor y los métodos para poder establecer y obtener los valores de los atributos. 
Compilar el código para comprobar que no presenta errores. Crea un objeto y comprueba sus métodos.
*/

/*Ayuda para el último punto….. hacer de además fue un método main a la clase 
(ya que el netbeans nos deja correrlo sin un main...) para poder crear el objeto 
"disco1"y poder añadir los datos e imprimir con el System.out.
*/

public class DiscoMusical {
    
    private String Titulo;
    private String Autor;
    private int AñoEdicion;
    private String Formato;
    private boolean Digital;
    
    public void setTitulo (String titulo){
        this.Titulo = titulo;
    }
    public String getTitulo(){
        return Titulo;
    }
    
    public void setAutor (String autor){
        this.Autor = autor;
    }
    public String getAutor(){
        return Autor;
    }
    
    public void setAñoEdicion (int año_edicion){
        this.AñoEdicion = año_edicion;
    }
    public int getAñoEdicion(){
        return AñoEdicion;
    }
    
    public void setFormato (String formato){
        this.Formato = formato;
    }
    public String getFormato(){
        return Formato;
    }
    
    public void setDigital (boolean digital){
        this.Digital = digital;
    }
    public boolean getDigital(){
        return Digital;
    }
    
}
