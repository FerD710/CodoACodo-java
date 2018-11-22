/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

/**
 *
 * @author jlfum
 */
public class Coordenadas   
{
    private final int x;//Atributos
    private final int y;//Atributos
  public Coordenadas (int x1 , int y1)//constructor
                      {
 //asignamos esos valores
 x=x1;
 y=y1;
}
public double Distancia (int x1, int y1)
{
//este método recibe como parametros
//las coordenadas del segundo punto
double D;
D=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
return D;//Retornamops el valor de la distancia
}
public void Pmedio(int x1, int y1)
{
double p1, p2;
p1=(x+x1)/2;
p2=(y+y1)/2;
System.out.println("El puntomedio es: "+p1+","+p2);
}
}
