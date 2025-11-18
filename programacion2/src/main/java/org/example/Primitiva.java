package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Primitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetido = false;

        System.out.println("Introduce tu boleto (N-N-N-N-N-N/R):");
        String entrada = sc.nextLine();

        // Validación con matches
        if (!entrada.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")) {
            System.out.println("Formato inválido.");
            return;
        }

        // Separar con split
        String[] partes = entrada.split("[-/]");
        int[] boleto = new int[6];
        int reintegroUsuario = Integer.parseInt(partes[6]);

        for (int i = 0; i < 6; i++) {
            boleto[i] = Integer.parseInt(partes[i]);
        }

        // Sorteo de 6 números únicos con array
        int[] sorteo = new int[6];
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            int nuevo;

            do {
                nuevo = 1 + rnd.nextInt(49); // número entre 1 y 49
                repetido = false;
                // comprobar duplicados en el array
                for (int j = 0; j < i; j++) {
                    if (sorteo[j] == nuevo) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            sorteo[i] = nuevo;
        }

        Arrays.sort(sorteo); // ordenar el sorteo

        // Complementario (distinto de los 6 sorteados)
        int complementario;
        do {
            complementario = 1 + rnd.nextInt(49);
            repetido = false;
            for (int j = 0; j < 6; j++) {
                if (sorteo[j] == complementario) {
                    repetido = true;
                    break;
                }
            }
        } while (repetido);

        // Reintegro
        int reintegroSorteo = rnd.nextInt(10);

        // Mostrar resultados
        System.out.println(Arrays.toString(boleto) + " / " + reintegroUsuario);
        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(sorteo));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reintegroSorteo);

        // Comparar aciertos
        int aciertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (boleto[i] == sorteo[j]) {
                    aciertos++;
                }
            }
        }

        boolean aciertaComplementario = false;
        for (int i = 0; i < 6; i++) {
            if (boleto[i] == complementario) {
                aciertaComplementario = true;
                break;
            }
        }

        boolean aciertaReintegro = reintegroUsuario == reintegroSorteo;

        // Evaluar los aciertos
        if (aciertos == 6 && aciertaReintegro) {
            System.out.println("Categoría Especial");
        } else if (aciertos == 6) {
            System.out.println("1ª Categoría");
        } else if (aciertos == 5 && aciertaComplementario) {
            System.out.println("2ª Categoría");
        } else if (aciertos == 5) {
            System.out.println("3ª Categoría");
        } else if (aciertos == 4) {
            System.out.println("4ª Categoría");
        } else if (aciertos == 3) {
            System.out.println("5ª Categoría");
        } else if (aciertaReintegro) {
            System.out.println("Premio de Reintegro");
        } else {
            System.out.println("No premiado");
        }
    }
}
