package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Hacer un programa que calcule e imprima la cantidad de dinero que tiene entre los tres");

        int g, l, j, x;

        Scanner entrada = new Scanner(System.in);

        // Solicitar los datos
        System.out.println("Ingres cuanto dinero tiene guillermo: ");
        g = entrada.nextInt();

        System.out.println("Guillermo tiene: " + g);

        l = g / 2;
        System.out.println("Por lo tanto Luis tiene: " + l);

        j = (l + g) / 2;
        System.out.println("Y Juan tiene: " + j);

        x = g + l + j;
        System.out.println("Y juntos tienen: " + x);

    }
}
