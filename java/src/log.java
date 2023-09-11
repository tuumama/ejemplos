import javax.swing.*;
public class log {
    public static void main(String[] args) {
        ImageIcon icon= new ImageIcon("aa.jpg");
        String clave="Pambazo93";
        String contra="";
        while(clave.equals(contra)==false){
            contra=JOptionPane.showInputDialog(null, "Ingresa la contraseña");
            if(clave.equals(contra)==false){
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
            } 

        } JOptionPane.showMessageDialog(null, "La contraseña es correcta", "BIENVENIDO", JOptionPane.PLAIN_MESSAGE, icon);
        

    }
}
