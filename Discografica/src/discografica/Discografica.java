
package discografica;


public class Discografica {

    
    public static void main(String[] args) {
        
        DiscoMusical Disco1 = new DiscoMusical();
        
        Disco1.setTitulo("News of the World");
        Disco1.setAutor("Queen");
        Disco1.setAñoEdicion(1977);
        Disco1.setFormato("Studio Album");
        Disco1.setDigital(false);
        
        System.out.println(Disco1.getTitulo());
        System.out.println(Disco1.getAutor());
        System.out.println(Disco1.getAñoEdicion());
        System.out.println(Disco1.getFormato());
        System.out.println(Disco1.getDigital());
       
    }
    
}
