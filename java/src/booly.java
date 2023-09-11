import javax.swing.*;
public class booly {
    public static void main(String[] args) {
        ImageIcon icon= new ImageIcon("jedi.png");
        double[]ok=new double[6];
        ok[0]=1.99;
        ok[1]=1.66;
        ok[2]=1.33;
        ok[3]=0.9;
        ok[4]=0.6;
        ok[5]=0.3;

        for(int a=0; a<ok.length;a++){
           JOptionPane.showMessageDialog(null, "Top "+ a + "=" + ok[a], "NUMEROS", JOptionPane.PLAIN_MESSAGE, icon);
        }

    }
}
