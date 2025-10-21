package org.example;

import java.util.Scanner;
import java.time.LocalDateTime;

public class practica3 {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        final int ANYO_MINIMO = 1900;
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();
        int anyo_nacimiento_int = 0;
        int numero;
        int generation; //(constantes y variables )

        System.out.println("¿Qué modo quieres (1) o (2)?");
        System.out.println("[1] - año de nacimiento");
        System.out.println("[2] - edad");
        System.out.println("----------------------------");

        try {
            numero = teclado.nextInt();
            teclado.nextLine();  // hacer un salto de linea (importante)
        } catch (Exception e) {
            System.out.println("Entrada no válida para modo.");
            return;
        } //elegir el numero de opcion

        switch (numero) {
            case 1:
                System.out.println("Introduce tu año de nacimiento:");
                String anyo_nacimiento = teclado.nextLine();
                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                } catch (NumberFormatException e) {
                    System.out.println("Formato incorrecto del año.");
                    teclado.close();
                    return;
                }
                break;
            case 2:
                System.out.println("Introduce tu edad:");
                int edad;
                try {
                    edad = teclado.nextInt();
                    teclado.nextLine();  // Consumir salto de línea
                } catch (Exception e) {
                    System.out.println("La edad no tiene formato correcto (numérico).");
                    teclado.close();
                    return;
                }
                if (edad < 0) {
                    System.out.println("Introduce una edad válida.");
                    teclado.close();
                    return;
                }
                anyo_nacimiento_int = anyo_actual - edad;
                break;
            default:
                System.out.println("has elegido una opcion que no existe");
                return;
        } //hacer la opcion elegida

        //determinar la generacion a la que perteneces


        if (anyo_nacimiento_int>=ANYO_MINIMO && anyo_nacimiento_int <=anyo_actual){
            System.out.println("Generacion sin bautizar.");
        }else if (anyo_nacimiento_int>=1928 && anyo_nacimiento_int<=1944){
            System.out.println("Generacion silent.");
        } else if (anyo_nacimiento_int>=1945 && anyo_nacimiento_int<=1964) {
            System.out.println("Baby boomer");

        } else if (anyo_nacimiento_int>=1965 && anyo_nacimiento_int<=1981) {
            System.out.println("Generacion X");
        } else if (anyo_nacimiento_int>=1982 && anyo_nacimiento_int<=1994) {
            System.out.println("Millenials la mejor");
        }else{
            System.out.println("Generacion Z");
        }
    }
}

