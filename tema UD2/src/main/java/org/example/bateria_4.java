package org.example;



public class bateria_4 {
    static void main(){
        String texto = "hola Mundo, bienvenido a Mundo, Mundo es genial";
        String palabra = "Mundo";

        int texo_tamanyo = texto.length();
        int palanra_tamanyo = palabra.length();

        String frase_sin = texto.replace(palabra, "");
        int conteo= frase_sin.length();
        int resta = texo_tamanyo - conteo;
        int resultado = resta /palanra_tamanyo;
        System.out.println(resultado);


    }
}
