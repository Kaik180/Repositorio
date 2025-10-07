package org.example;

import java.util.Scanner;

public class Practica2_4 {
    public static void main() {
        //preparamos nuestras variables
        int numero1 = 0;
        int numero2 = 0;
        String numero_primero = "";
        String numero_segundo = "";
        String numero_tercero = "";
        boolean control = false;
        Scanner teclado = new Scanner(System.in);

        do {
            try {
                System.out.println("Introduce el primer número (3 cifras, puede ser negativo):"); //pedimos los dos numeros
                numero1 = teclado.nextInt();
                System.out.println("Introduce el segundo número (3 cifras, puede ser negativo):");
                numero2 = teclado.nextInt();

                // Validar que ambos tengan 3 cifras positivas o negativas
                if ((numero1 > -100 && numero1 < 100) || (numero2 > -100 && numero2 < 100)) {
                    System.out.println("El número tiene menos de 3 cifras");
                } else if (numero1 < -999 || numero1 > 999 || numero2 < -999 || numero2 > 999) {
                    System.out.println("El número tiene más de 3 cifras");
                } else {
                    String numero_string;
                    // por si es negativo agarrar los numeros correctos
                    if (numero2 < 0) {
                        numero_string = Integer.toString(numero2);

                        numero_primero = numero_string.substring(1, 2);
                        numero_segundo = numero_string.substring(2, 3);
                        numero_tercero = numero_string.substring(3, 4);
                    } else {
                        numero_string = Integer.toString(numero2);
                        numero_primero = numero_string.substring(0, 1);
                        numero_segundo = numero_string.substring(1, 2);
                        numero_tercero = numero_string.substring(2, 3);
                    }

                    // Convertir los caracteres en numeros
                    int numero_primero_int = Integer.parseInt(numero_primero);
                    int numero_segundo_int = Integer.parseInt(numero_segundo);
                    int numero_tercero_int = Integer.parseInt(numero_tercero);

                    // Calcular el numero de cada linea
                    int linea1 = numero1 * numero_tercero_int;
                    int linea2 = numero1 * numero_segundo_int;
                    int linea3 = numero1 * numero_primero_int;

                    int resultado = numero1 * numero2;

                    // Mostrar resultado de la multiplicacion
                    System.out.println(" " + numero1);
                    System.out.println("x" + numero2);
                    System.out.println("---------------");
                    System.out.println("   " + linea1);
                    System.out.println("  " + linea2 + "x");
                    System.out.println(" " + linea3 + "xx");
                    System.out.println("---------------");
                    System.out.println(" " + resultado);

                    control = true;
                }
            } catch (Exception e) {
                System.out.println("Error de formato. Asegúrate de escribir solo números enteros.");
                teclado.nextLine(); // Limpia la catche
            }
        } while (!control); // Repite mientras haya un error
    }
}


