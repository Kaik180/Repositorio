package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class split {
    public static void main(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String cadena = "Hola,Soy,Una,Cadena";
        String[] subcadenas = cadena.split(",");
        System.out.println(Arrays.toString(subcadenas));
    }
}
