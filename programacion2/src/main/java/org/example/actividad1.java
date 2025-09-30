package org.example;

import java.util.Scanner;

public class actividad1 {
    static void main() {
        Scanner Entrada = new Scanner(System.in);
        try {

            System.out.println("Como te llamas?");
            String Nombre = Entrada.nextLine();

            System.out.println("a que curso vas?");
            String Curso = Entrada.nextLine();

            System.out.println("hola " + Nombre + ",bienvenido a " + Curso);

        } catch (Exception e){
            System.out.println();
        }

    }
}
