package analizador_lexico;
import static analizador_lexico.Token.*;
%%
%class lexer
%type Token

L = [a-zA-Z_]
D = [0-9]
Initcor = [{]
Termcor = [}]
PuntCom = [;]
AperPar = [(]
CerrPar = [)]
DosPunt = [:]
Coma = [,]
Comilla = [']

WHITE = [ \t\r\n]

%{
    public String lexeme;
%}

%%
{WHITE} {/*Ignore*/}
"//".* {/*Ignore*/}
{PuntCom} {return PUNTOYCOMA;}
{Initcor} {lexeme = yytext(); return INITCOR;}
{Termcor} {lexeme = yytext(); return TERMCOR;}
{AperPar} {lexeme = yytext(); return APERPAR;}
{CerrPar} {lexeme = yytext(); return CERRPAR;}
{DosPunt} {lexeme = yytext(); return DOSPUNT;}
{Coma}    {lexeme = yytext(); return COMA;}
{Comilla} {lexeme = yytext(); return COMILLA;}



"class" {return CLASS;}

"int"   {return INT;}
"float" {return FLOAT;}
"boolean" {return BOOLEAN;}
"char" {return CHAR;}


"if" {return IF;}
"else" {return ELSE;}
">" {return MAYORQUE;}
"=" {return ASIGNA;}
"==" {return IGUAL;}
"<" {return MENORQUE;}
"=<" {return MENOROIGUAL;}
"=>" {return MAYOROIGUAL;}
"!=" {return DIFERENTEQUE;}


"while" {return WHILE;}


"switch" {return SWITCH;}
"case" {return CASE;}
"default" {return DEFAULT;}


"TRUE" {return TRUE;}
"FALSE" {return FALSE;}

"while" {return WHILE;}


"for" {return FOR;}


"-" {return RESTA;}
"*" {return MULTIPLICACION;}
"+" {return SUMA;}
"/" {return DIVISION;}

{L}({D}|{L})* {lexeme = yytext(); return IDENTIFICADOR;}
[+-]? {D}+ {lexeme = yytext(); return NUMERO;}
. {return ERROR;}