/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cola.doble;

/**
 *
 * @author Israel
 */
public class Nodo {
  Nodo sig,ant;
  int dato;
  
  Nodo(int x, Nodo enlace){
      sig=ant=enlace;
      dato=x;
  }
  
}
