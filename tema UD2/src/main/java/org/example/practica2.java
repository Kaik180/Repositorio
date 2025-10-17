package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class practica2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        final int ANYO_MINIMO = 1900;
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();
        int anyo_nacimiento_int = 0;

        boolean seguir = true;
        System.out.println("que modo quieres (1) o (2)");
        System.out.println("[1] - año de nacimiento");
        System.out.println("[2] - Edad");
        System.out.println("----------------------------");

        if (teclado.hasNext()){
            int numero = teclado.nextInt();
            if (numero==1){
                anyo_nacimiento_int = 0;
                String anyo_nacimiento = teclado.nextLine();
                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                }catch (NumberFormatException e){
                    System.out.println("formato incorrecto del año");
                    return;
                }





            } else if (numero==2) {
                int edad = 0;
                if (teclado.hasNext()){
                    edad = teclado.nextInt();
                }else {
                    System.out.println("la edad no tiene el formato correcto (numerico)");
                }
                if (edad>=0){
                     anyo_nacimiento_int = anyo_actual -edad;
                }else {
                    System.out.println("introduce una edad valida");
                }


            }else {
                System.out.println("valor del modo incorrecto");
            }

        }else {
            System.out.println("valor del modo incorrecto");
            seguir = false;
        }
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
