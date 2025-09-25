package org.example;

import java.util.Scanner;

public class actividad1 {
    static void main() {
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Como te llamas?");
        String Nombre = Entrada.nextLine();

        System.out.println("a que curso vas?");
        String Curso = Entrada.nextLine();

        System.out.println("hola " + Nombre + ",bienvenido a " + Curso );

        System.out.println("introduce un numero");
        int num1 = Entrada.nextInt();
        System.out.println("introduce otro numero");
        int num2 = Entrada.nextInt();
        int resultado = num1 + num2;
        System.out.println("EL resultado es " + resultado );





       

    }
}
