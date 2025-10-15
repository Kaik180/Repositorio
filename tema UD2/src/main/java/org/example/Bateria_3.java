package org.example;

import java.util.Scanner;

public class Bateria_3 {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("insertar numero");
        int numero = teclado.nextInt();
        System.out.println("cuantas cifras quieres eliminar?");
        int quitar = teclado.nextInt();

        String numero_string = Integer.toString(numero);
        int tamanyo = numero_string.length();
        int nuevo_tamanyo = tamanyo - quitar;

        String resultado = numero_string.substring(0,nuevo_tamanyo);
        System.out.println("El resultado es "+ resultado);


    }
}
