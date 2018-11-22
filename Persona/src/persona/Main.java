
package persona;


public class Main {

    
    public static void main(String[] args) {
      Persona persona_1 = new Persona ("Juan", 23, 'H', "Av. Rivadavia 2341", "juan@hotmail.com", 1523459810);
      
      
      Persona persona_2 = new Persona();
      
      Persona persona_3 = new Persona ("Marta", 15, 'M');
      
      Persona persona_4 = new Persona ("Miguel", 52, 'R');
      
      persona_1.generarDNI();
      persona_2.generarDNI();
      persona_3.generarDNI();
      persona_4.generarDNI();
      
      System.out.println(persona_1);
      System.out.println(persona_2);
      System.out.println(persona_3);
      System.out.println(persona_4);
        
    }
    
}
