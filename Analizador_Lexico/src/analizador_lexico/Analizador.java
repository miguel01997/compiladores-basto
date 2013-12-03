/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_lexico;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author yamirsuarez
 */
public class Analizador {
    
   private String direccion;
   private String tokens;
   private lexer lexer;
    
    public Analizador (String dir) {
        
        this.direccion = dir;
        
        
        File file = new File (dir);
        JFlex.Main.generate (file);
        
        
    }
    
    
    public void ProbarAnaLex (String dir) throws FileNotFoundException, IOException{
        
        
        String strLinea;
        FileInputStream entrada = new FileInputStream (dir);
        DataInputStream data = new DataInputStream (entrada);
        BufferedReader lector = new BufferedReader(new InputStreamReader (data));
        
        
         this.lexer = new lexer(lector);
         
        
        /*Token token = this.lexer.yylex();
            
            if (token == null){
                this.tokens = "EOF";
                return this.tokens;
            }
            
            switch (token){
                case ERROR:
                        this.tokens = this.tokens + "Error";
                    return this.tokens;
                    
                case IDENTIFICADOR: case NUMERO: case INITCOR: case TERMCOR: case APERPAR: case CERRPAR: case DOSPUNT: case PUNTOYCOMA: 
                        this.tokens = this.tokens + token + " ";
                        return this.tokens;
                    
                default:
                        this.tokens = this.tokens + token;
                    return this.tokens;
                    
            }*/
        
        
        
    }
    
    
    
    public String getTokens () throws IOException{
        
        Token token = this.lexer.yylex();
            
            if (token == null){
                this.tokens = "EOF";
                return this.tokens;
            }
            
            switch (token){
                case ERROR:
                        this.tokens = this.tokens + "Error";
                    return this.tokens + " ";
                    
                case IDENTIFICADOR: case NUMERO: case INITCOR: case TERMCOR: case APERPAR: case CERRPAR: case DOSPUNT: case PUNTOYCOMA: case TIPO: case COMA: case COMILLA:
                        this.tokens = token.toString();

                        return this.tokens;
                    
                default:
                        this.tokens = token.toString();
                    return this.tokens;
                    
            }
        
    }
    
 }
