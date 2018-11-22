/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

/*Archivo UsaCoordenadas.java*/
 public class UsaCoordenadas {
 public static void main (String args []){
 Coordenadas P=new Coordenadas (10,20);
 //calculamos la Distancia:
 System.out.println("La Distancia es: "+P.Distancia(5,6));
 //Punto Medio
 P.Pmedio(5,6);
 }
}
