package awt;
import java.awt.*;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.swing.JOptionPane;
public class decimalJO{
    public static void main(String[] args) {
        String num1=JOptionPane.showInputDialog("valor 1");
        String num2=JOptionPane.showInputDialog("valor 2");

        double n1=Integer.parseInt(num1);
        double n2=Integer.parseInt(num2);

        double suma = n1+n2;
        double resta= n1-n2;
        double multiplicacion = n1*n2;
        double divicion = n1/n2;
        JOptionPane.showMessageDialog(null,"el resultado de la suma es: " +  suma);
        JOptionPane.showMessageDialog(null,"el resultado de la resta es: " +  resta);
        JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion es: " +  multiplicacion);
        JOptionPane.showMessageDialog(null,"el resultado de la divicion es: " +  divicion);


    
    }
}