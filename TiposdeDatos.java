
import java.util.Scanner;

public class TiposdeDatos {

    public static void main(String[] arg) {

        Integer numero = null;
        String palabra = "Hola que tal";
        int num = 10; // Una variable, puede ser un valor que mas adalante podemos cambair
        final int nume = 10; // Aqui declaramos una constante, un valor que nunca va a cambiar

        num = 15;

        System.out.println("El numero es: " + numero);
        System.out.println(palabra);
        System.out.println("El numero es: " + num);
        System.out.println("El numero es: " + nume);

        // como guardamos datos

        Scanner entradaI = new Scanner(System.in);
        float numer;

        System.out.println("Digite un numero");
        numer = entradaI.nextFloat(); // nextInt es porque es un tipo entero
        System.out.println("El numero es: " + numer);

        // como guardar cadena

        Scanner entradaC = new Scanner(System.in);
        String cadena;

        System.out.println("Digie una cadena: ");
        // Vamos a guardar esta cadena
        cadena = entradaC.nextLine(); // Next para cadena o nextline
        System.out.println("La cadena es: " + cadena); // solo guarda hasta que encuentra un espacio, despues de eso ya
                                                       // no guarda nada
        // para eso usamos el nexline, para que detecte espacios y podamos guardar todo

        // Como guardar caracteres

        Scanner EntradaL = new Scanner(System.in);
        char letra;

        System.out.println("Digite una letra");
        letra = EntradaL.next().charAt(1); // el charAt, solo va a leer el primer caracter, dependiendo del numero
        System.out.println("La cadena es: " + letra);

    }

}
