/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cola.doble;

 

/**
 *
 * @author Israel
 */
public class ColaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos met = new metodos();
        for (int i=0;i<10;i++){
             met.insertar((int)(Math.random()*10));
             

         }
        System.out.println("Referencias :"+ met.Imprimir());
         met.seek();
          
          
    }
}
