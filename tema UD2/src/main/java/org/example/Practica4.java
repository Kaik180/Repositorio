package org.example;

import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA *****");
        System.out.print("> Introduce operando: ");
        double operando1;
        double op2=0;
        double op2_p = 0;
        double resultado = 0; //definir variables

        try {
            operando1 = Double.parseDouble(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Operando no válido.");
            return;
        } //comprobar que me dan un numero y no una letra

        System.out.println("--------------------------");
        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raíz cuadrada");
        System.out.println("--------------------------");
        System.out.print("Elige una operación: ");

        String operacion = teclado.nextLine();
        if (operacion.equals("R")){

        }else {
            try {
                System.out.print("> Introduce el segundo operando: ");
                op2_p = Double.parseDouble(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Operando no válido.");
                return;
            }
        }

        switch (operacion.toLowerCase()) {
            case "+": //caso donde quieres hacer una suma
                System.out.print("> Introduce el segundo operando: ");
                resultado = operando1 + op2_p;
                System.out.printf("El resultado de"+ operando1+ " + "+  op2_p+ "= "+ resultado);
                break;

            case "-": //caso donde quieres restar dos numeros
                System.out.print("> Introduce el segundo operando: ");
                resultado = operando1 - op2_p;
                System.out.printf("El resultado de"+ operando1+ " - "+  op2_p+ "= "+ resultado);
                break;

            case "x": //caso donde eliges una multiplicacion
                System.out.print("> Introduce el segundo operando: ");
                resultado = operando1 * op2_p;
                System.out.printf("El resultado de"+ operando1+ " x "+  op2_p +"= "+ resultado);
                break;

            case "/": //caso donde quieres una division

                if ( op2_p== 0) { //comprobacion de numero negativo
                    System.out.println("Error: No se puede dividir entre cero.");


                }else{
                    resultado = operando1 /  op2_p;
                    System.out.printf("El resultado de"+ operando1+ " / "+   op2_p +"= "+ resultado);
                }

                break;

            case "r": //En el caso de que quieras una raiz cuadrada
                if (operando1 < 0) {//comprobacion de numero negativo para no crear un numero irreal
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    return;
                }else {

                }
                resultado = Math.sqrt(operando1);
                System.out.printf("El resultado de la raiz cuadrada de "+ operando1+ " es "+ resultado);
                break;

            default:
                System.out.println("Operación no válida."); //en caso de que ponga cualquier otra opcion inexistente
        }
    }
}
