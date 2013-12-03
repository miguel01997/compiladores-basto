/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_lexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author yamirsuarez
 */
public class Analizador_Lexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        try {
            int x;
            
           // if (args[0] == "-i"){
                
                Sintactico sintactico;

                System.out.println("\nEscriba la direccion del archivo a analizar: ");

                String direccionar = "/Users/yamirsuarez/Documents/comp.txt";
                //Scanner lector = new Scanner (System.in);
                //direccionar = lector.next();
                sintactico = new Sintactico ();

                sintactico.AnalizisSintactico(direccionar);   
                
                
            //}
            
        
        /*System.out.println("Cargando Analizador..........");
        String anaLex = "/Users/yamirsuarez/Downloads/Analizador_Lexico/src/analizador_lexico/Lexer.flex";
        
        
        Analizador analizador = new Analizador(anaLex);*/

        
        /*System.out.println(sintactico.getToken());*/       
        /*System.out.println(sintactico.getToken());
        System.out.println(sintactico.getToken());*/
        /*analizador.ProbarAnaLex(direccionar);*/
        
        /*System.out.println(direccionar);*/
        
        /*System.out.println(analizador.ProbarAnaLex(direccionar));*/

        }
        
        catch (NullPointerException e){
            
        }
        
        
        
        
        // TODO code application logic here
    }
    
    }
    


