package Ejercicios;

import java.util.Scanner;

public class Ejercico1 {
    public static void main(String[] args) {

        System.out.println("Hacer un programa que calcule e imprima las suma de 3 calificaciones y te de el promedio");

        float num1, num2, num3, suma, prom;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las tres calificaciones: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        num3 = entrada.nextFloat();

        // realizar la operacion

        suma = num1 + num2 + num3;
        prom = suma / 3;

        System.out.println("La suma de las calificaciones es: " + suma);
        System.out.println("El promedio de las calificaciones es: " + prom);

    }
}
