package org.example;
import java.util.Scanner;

public class bateria_cadenas {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el texto");
        String frase2 = teclado.nextLine();
        System.out.println(frase2);
        int tamanyo = frase2.length();
        System.out.println(tamanyo);
        String frase_remplazos= frase2.replace(" ", "");
        System.out.println(frase_remplazos);
        int mitad = tamanyo/2;
        String trozo_inicial = frase2.substring(0,mitad);
        String trozo_final = frase2.substring(mitad,tamanyo);
        System.out.println("Primera mitad del texto es " + trozo_inicial + " y la segunda mitad del texto es " + trozo_final);
        String frase_mayusculas = frase2.toUpperCase();
        System.out.println(frase_mayusculas);


    }
}
