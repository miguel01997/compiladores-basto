/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cola.doble;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
public class metodos {
    private Nodo sig,ant,nuevo,aux,inicio,fin;
    int dato;
   
    metodos(){
        inicio=fin=null;
        dato=0;
    }
    
    void insertar(int x){
        if (inicio==null) {
            inicio=fin=new Nodo(x,null);
        }else{
            nuevo=new Nodo(x,null);
            fin.sig=nuevo;
            nuevo.ant=fin;
            fin=nuevo;
        }
    }
    String Imprimir(){
        String sal= "";
        aux=inicio;
        while(aux!= null){
            sal+=aux.dato+"|";
            aux=aux.sig;
        }
        return sal;
    }
   void seek(){
       int fallos=0;
        String sal= "";
           int marcos[];
           marcos = new int[4];
    
        int i=0;
        aux=inicio;
          while(aux!=null && i<4){
            // creacion de la cola marcos de 4 elementos  
              
            marcos[i]=aux.dato;  
              aux=aux.sig;
              i++;   
              
          } 
          for (int j = 0; j < 4; j++) {
              System.out.println("|"+marcos[j]+"|");
       }
          
          
           while(inicio!=null){
              for (int j = 0; j < 4; j++) {
                  if (inicio.dato==marcos[j]) {
                      System.out.println("sin fallo de pagina ");
                     inicio=inicio.sig;
                  }else{ 
                      fallos++;
                      aux=fin;
                      int var=inicio.dato;
                     while(aux!=null){
                 for (int k = 0; k < 4; k++){
                  if (marcos[k]==aux.dato){
                      System.out.println("if--inicio:"+inicio.dato +"marco "+ marcos[k]);
                     marcos[k]=var;
                      System.out.println("marco cambiado :"+marcos[k] +"por :" +inicio.dato);
                      return;
                  }else{
                      System.out.println("marco "+marcos[k]+" no es igual al fin"+aux.dato);
                      
                  }
                  aux=aux.ant;
                 }
              
                  
           }// while fin 
                     }// else
              }//for
           
          }// while inicio
          System.out.println("fallos "+fallos);
   }//metodo seek
         
}//fin metodos