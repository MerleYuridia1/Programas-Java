
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Introduccion1 {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: "); // para una ventana emergente, guarda un string
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:")); // el integer.parseInt es para
                                                                                     // convertir de string a entero
        letra = JOptionPane.showInputDialog("Digite un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un Decima: "));

        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);

    }

}
