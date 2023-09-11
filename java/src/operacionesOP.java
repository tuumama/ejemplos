package awt;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.swing.JOptionPane;

public class operacionesOP {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("valor 1");
        String num2 = JOptionPane.showInputDialog("valor 2");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        int divicion = n1 / n2;
        JOptionPane.showMessageDialog(null, "el resultado de la suma es: " + suma);
        JOptionPane.showMessageDialog(null, "el resultado de la resta es: " + resta);
        JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "el resultado de la divicion es: " + divicion);

    }
}