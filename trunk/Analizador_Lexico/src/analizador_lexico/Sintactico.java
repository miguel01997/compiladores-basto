/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analizador_lexico;

import java.io.IOException;

/**
 *
 * @author yamirsuarez
 */
public class Sintactico {
    
    
    private String anaLex = "/Users/yamirsuarez/Downloads/Analizador_Lexico/src/analizador_lexico/Lexer.flex";
    private Analizador lex;
    private String token;
    private boolean ok = true;
    private String tokenact;
    
    public Sintactico () throws IOException{
        
        this.lex = new Analizador (this.anaLex);
    }
    
    public void AnalizisSintactico (String direccion) throws IOException{
        
        this.lex.ProbarAnaLex(direccion);
        
        programa();
        
        return;
    }
    
    public void programa () throws IOException{
        
        this.tokenact = this.lex.getTokens();
        
        if (this.tokenact == "CLASS"){
            
            this.tokenact = this.lex.getTokens();
            
            if (this.tokenact == "IDENTIFICADOR"){
                
                this.tokenact = this.lex.getTokens();
                
                if (this.tokenact == "INITCOR"){
                    
                    this.tokenact = this.lex.getTokens();
                    declaraciones();
                    
                }
                else {
                    System.out.println("Se esperaba un {");
                }
            }
            else {
                System.out.println("Se esperaba un identificador");
            }
            
        }
        else {
            System.out.println("Se esperaba una palabraclave class" );
        }
        
        
    }
    
    public void declaraciones () throws IOException{
        
        while (this.tokenact != "PUNTOYCOMA"){
            declaracion();
            declaraciones();
            this.tokenact=this.lex.getTokens();
        }
        return;
        
    }
    
    public void declaracion (){
        
        tipo();
        
        if (this.tokenact == "IDENTIFICADOR"){
            
        }
        
    }
    
    
            
            
}
