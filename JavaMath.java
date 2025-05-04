package Introduccion;

public class JavaMath {
    public static void main(String[] args) {

        // El método sqrt(double a) devuelve la raíz cuadrada positiva de un número.
        double raiz = Math.sqrt(25); // es para sacra la raiz cuadrada

        // El método pow(double base, double exponente) eleva un número a la potencia
        // indicada.
        double potencia = Math.pow(2, 3); // Es para evaluar numero al exponente Devuelve 8.0 (2^3)

        // El método abs devuelve el valor absoluto de un número.
        int absoluto = Math.abs(-10); // Devuelve 10

        // Estos métodos devuelven el seno, coseno, y tangente de un ángulo dado en
        // radianes
        double seno = Math.sin(Math.PI / 2); // Devuelve 1.0
        double coseno = Math.cos(0); // Devuelve 1.0
        double tangente = Math.tan(Math.PI / 4); // Devuelve 1.0

        // toRadians(double grados): Convierte un ángulo en grados a radianes.
        // toDegrees(double radianes): Convierte un ángulo en radianes a grados.
        double radianes = Math.toRadians(180); // Devuelve 3.14159...
        double grados = Math.toDegrees(Math.PI); // Devuelve 180.0

        // Estos métodos devuelven el valor máximo o mínimo de dos números.
        int maximo = Math.max(10, 20); // Devuelve 20
        int minimo = Math.min(10, 20); // Devuelve 10

        // round(double a): Redondea al entero más cercano.
        // ceil(double a): Redondea al entero más cercano hacia arriba.
        // floor(double a): Redondea al entero más cercano hacia abajo.
        double redondeado = Math.round(3.6); // Devuelve 4
        double techo = Math.ceil(3.2); // Devuelve 4.0
        double piso = Math.floor(3.8); // Devuelve 3.0

        // log(double a): Devuelve el logaritmo natural (base e) de un número.
        // log10(double a): Devuelve el logaritmo en base 10 de un número.
        double logaritmoNatural = Math.log(10); // Devuelve 2.3025...
        double logaritmoBase10 = Math.log10(100); // Devuelve 2.0

        // Math.PI: Valor de π (aproximadamente 3.14159).
        // Math.E: Valor de e (aproximadamente 2.71828).
        double areaCirculo = Math.PI * Math.pow(5, 2); // Área de un círculo de radio 5

        System.out.println("La raiz es: " + raiz);
        System.out.println("La potencia es:" + potencia);
        System.out.println("El valor absoluto es:" + absoluto);
        System.out.println("El valor de seno es: " + seno);
        System.out.println("El valor de conseno es: " + coseno);
        System.out.println("El valor de tangente es: " + tangente);
        System.out.println("El valor de radianes es" + radianes);
        System.out.println("El valor de grados es: " + grados);
        System.out.println("El valor de maximo es: " + maximo);
        System.out.println("El valor de minimo es: " + minimo);
        System.out.println("El valor redondeado es: " + redondeado);
        System.out.println("El valor de techo es: " + techo);
        System.out.println("El valor de piso es: " + piso);
        System.out.println("El valor de logaritmo natural es: " + logaritmoNatural);
        System.out.println("El valor de logaritmo base 10 es: " + logaritmoBase10);
        System.out.println("El area de circulo es: " + areaCirculo);
    }
}
