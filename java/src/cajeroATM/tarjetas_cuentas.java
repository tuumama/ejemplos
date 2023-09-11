package proyecto;

import javax.swing.JOptionPane;

public class tarjetas_cuentas {
    public static void main(String[] args) {
        String[] numeros = { "1234123412341234" };
        int numb = JOptionPane.showOptionDialog(null, "Ingrese el numero", "", JOptionPane.QUESTION_MESSAGE,
                JOptionPane.DEFAULT_OPTION, null, numeros, numeros[0]);

    }
}
