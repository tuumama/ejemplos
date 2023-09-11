package awt;

import javax.swing.JOptionPane;

public class xd {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre");
        JOptionPane.showMessageDialog(null, "Holis" + " " + nombre, "Inicio", 0);
    }
}
