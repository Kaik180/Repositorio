package org.example;

import java.util.Random;
import java.util.Scanner;

public class dados {
    static void main(){
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        //Ejercicio1

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int suma = dado1 + dado2; // Calcular la suma


        System.out.println("Resultado del dado 1: " + dado1);
        System.out.println("Resultado del dado 2: " + dado2);
        System.out.println("Suma total: " + suma);
        //Ejercicio2
        String caracteres= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena = "";
        for (int i=0;i<12;i++){
            contrasena+= caracteres.charAt(random.nextInt(caracteres.length()-1));
        }
        //Ejercicio3

        int min, max;

        // Solicitar rango y validar que mínimo < máximo
        while (true) {
            System.out.print("Introduce el valor mínimo: ");
            min = teclado.nextInt();
            System.out.print("Introduce el valor máximo: ");
            max = teclado.nextInt();

            if (min < max) {
                break;
            } else {
                System.out.println("Error: el valor mínimo debe ser menor que el máximo. Intenta de nuevo.");
            }
        }

        // Solicitar cantidad de números aleatorios
        System.out.print("¿Cuántos números aleatorios quieres generar? ");
        int cantidad = teclado.nextInt();

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(max - min + 1) + min;
            System.out.println(numero);
        }
    }

        //Ejercicio4
        // Longitud aleatoria entre 8 y 12
            int longitud = random.nextInt(5) + 8; // (0–4) + 8 → 8–12

            // Apartados de caracteres
            String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String minusculas = "abcdefghijklmnopqrstuvwxyz";
            String numeros = "0123456789";
            String todos = mayusculas + minusculas + numeros;
            contrasena = "";

            // Primer carácter: una mayúscula
            contrasena += mayusculas.charAt(random.nextInt(mayusculas.length()));

            // Segundo carácter: una minúscula
            contrasena += minusculas.charAt(random.nextInt(minusculas.length()));

            // Tercer carácter: un número
            contrasena += numeros.charAt(random.nextInt(numeros.length()));

            // Resto de caracteres: aleatorios de todos los apartados
            for (int i = 3; i < longitud; i++) {
                contrasena += todos.charAt(random.nextInt(todos.length()));
            }

            // Mostramos resultado
            System.out.println("Contraseña generada: " + contrasena);
    



}
