package org.example;

import java.util.Scanner;

public class Bateria_1 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        String frase = "al palo JuanFran del atleti";
        int tamanyo = frase.length();
        System.out.println(tamanyo);
        System.out.println(frase.charAt(8));

        String trozo_final = frase.substring(8,17);
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        int posicion_ultima = frase.lastIndexOf("palo");
        System.out.println(posicion_ultima);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        String base_datos = "Raul          ";
        System.out.println(base_datos.trim() + "-" + base_datos + "#");

        boolean igual = base_datos.trim().equals("Raul");
        System.out.println(igual);

        boolean igual_sin_mayusculas = "Raul".equalsIgnoreCase("Raul");
        System.out.println(igual_sin_mayusculas);

        String frase_remplazos= frase.replace("palo", "florentino");
        System.out.println(frase_remplazos);










    }
}
