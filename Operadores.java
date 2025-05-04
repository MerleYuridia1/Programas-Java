package Introduccion;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float num1, num2, suma, resta, multiplicacion, division, resto;

        System.out.println("Dame dos numeros: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        resto = num1 % num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El residuo de la division es: " + resto);

        // OPERADORES ARITMETICOS COMBINADOS CON ASIGNACIÓN

        int numero = 10;

        numero += 5; // es lo mismo que decir numero = numero + 5;
        // numero -= 5; es lo mismo que decir numero = numero - 5;
        // numero *= 5; es lo mismo que decir numero = numero * 5;
        // numero /= 5; es lo mismo que decir numero = numero / 5;
        // numero %= 5; es lo mismo que decir numero = numero % 5;
        System.out.println(numero);

        // OPERADORES DE INCREMENETO Y DECREMENTO

        int x = 5, y, z;

        // y = x++; // si lo colocamos como sufijo la operacion hara lo siguiente,
        // primero hara la asignacion y despues el incremento
        y = ++x; // si lo colocamos como prefijo la operacion hara lo siguiente, primero hara el
                 // incremento y despues la asignacion
        z = --x;
        System.out.println("El numero es: " + y);
        System.out.println("El numero es: " + z);

    }
}
