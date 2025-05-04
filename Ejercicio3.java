package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println(
                "Hacer un programa que calcule e imprima el salario semanala de un empleado a partir de sus horas semanales trabajadas y de su salario por hora");

        int hs, sh, ss;

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas horas a la semana trabajaste?");
        hs = entrada.nextInt();

        System.out.println("¿Cual es tu salario por hora?");
        sh = entrada.nextInt();

        ss = hs * sh;

        System.out.println("Tu pago semanal corresponde a: " + ss);

    }
}
